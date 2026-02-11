package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.Constants;
import com.vinibiavatti1.mayor.data.*;
import com.vinibiavatti1.mayor.gui.dialog.DifficultySelector;
import com.vinibiavatti1.mayor.model.Stats;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Collections;
import java.util.Objects;

public class MainFrame extends JFrame {
    private static final String TITLE_FORMAT = "%s (v%s) - Difficulty: %s";
    private static final String ICON_PATH = "/residence.png";
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    private final DifficultySelector difficultySelector = new DifficultySelector();
    private final Stats stats = new Stats();
    private final GridPanel gridPanel = new GridPanel(this);
    private final StatsPanel statsPanel = new StatsPanel();
    private final BuildingMenu buildingMenu = new BuildingMenu(this);

    private Difficulty difficulty = null;
    private TileButton currentTileButton = null;

    public MainFrame() {
        URL iconUrl = Objects.requireNonNull(this.getClass().getResource(ICON_PATH));
        this.setIconImage(new ImageIcon(iconUrl).getImage());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(new MenuBar(this));
        this.add(this.gridPanel, BorderLayout.CENTER);
        this.add(this.statsPanel, BorderLayout.LINE_START);
        this.reset();
        this.setVisible(true);
    }

    public void handleTileButtonClick(TileButton tileButton) {
        this.currentTileButton = tileButton;
        this.buildingMenu.show(tileButton, 0, 0);
    }

    public void handleBuildingMenuItemClick(BuildingMenuItem buildingMenuItem) {
        this.currentTileButton.disable(buildingMenuItem.getBuilding());
        this.stats.applyBuildingResourceDeltas(buildingMenuItem.getBuilding(), this.difficulty);
        this.statsPanel.refresh(this.stats);
        this.checkVictory();
    }

    public void reset() {
        this.difficulty = difficultySelector.show();
        if (this.difficulty == null) {
            System.exit(0);
        }
        this.setTitle(String.format(TITLE_FORMAT, Constants.TITLE, Constants.VERSION, difficulty));
        this.stats.reset();
        this.gridPanel.reset();
        this.setupInitialLandmarks();
        this.statsPanel.refresh(this.stats);
    }

    private void setupInitialLandmarks() {
        int limit = this.difficulty == Difficulty.HARD ? 2 : 1;
        Collections.shuffle(this.gridPanel.getTiles());
        this.gridPanel.getTiles().stream().limit(limit).forEach(tile -> {
            tile.disable(Building.LANDMARK);
            stats.applyBuildingResourceDeltas(Building.LANDMARK, this.difficulty);
        });
    }

    private void checkVictory() {
        boolean hasNoFreeTiles = this.gridPanel.getTiles().stream().noneMatch(Component::isEnabled);
        boolean hasNegativeAmounts = this.stats.hasNegativeStats();
        boolean hasLandmarks = this.stats.get(Resource.LANDMARK) > 0;

        if (!hasNegativeAmounts && hasLandmarks) {
            JOptionPane.showMessageDialog(this, Constants.WIN_MESSAGE, Constants.TITLE, JOptionPane.INFORMATION_MESSAGE);
            this.reset();
        } else if (hasNoFreeTiles) {
            JOptionPane.showMessageDialog(this, Constants.LOST_MESSAGE, Constants.TITLE, JOptionPane.INFORMATION_MESSAGE);
            this.reset();
        }
    }
}
