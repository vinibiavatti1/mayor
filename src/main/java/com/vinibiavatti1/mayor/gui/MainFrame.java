package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.Constants;
import com.vinibiavatti1.mayor.data.*;
import com.vinibiavatti1.mayor.gui.dialog.DifficultySelector;
import com.vinibiavatti1.mayor.data.Stats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
    private final Set<Building> buildings = new HashSet<>();

    private Difficulty difficulty = null;
    private TileButton currentTileButton = null;

    public MainFrame() {
        URL iconUrl = Objects.requireNonNull(this.getClass().getResource(ICON_PATH));
        this.setIconImage(new ImageIcon(iconUrl).getImage());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(new MenuBar(this));
        this.add(this.gridPanel, BorderLayout.CENTER);
        this.add(this.statsPanel, BorderLayout.LINE_START);
        this.addWindowListener(new WindowListener(this));
        this.reset();
        this.setVisible(true);
    }

    public void handleTileButtonClick(TileButton tileButton) {
        if (tileButton.getBuilding() == null) {
            this.currentTileButton = tileButton;
            this.buildingMenu.show(tileButton, 0, 0);
        } else {
            Building building = tileButton.getBuilding();
            building.updateStats(this.stats, this.difficulty, true);
            this.statsPanel.refresh(this.stats);
            tileButton.reset();
            buildings.remove(building);
            this.checkVictory();
        }
    }

    public void handleBuildingMenuItemClick(BuildingMenuItem buildingMenuItem) {
        Building building = buildingMenuItem.getBuilding();
        this.currentTileButton.placeBuilding(building);
        building.updateStats(this.stats, this.difficulty, false);
        this.statsPanel.refresh(this.stats);
        buildings.add(building);
        this.checkVictory();
    }

    public void clearAll() {
        this.gridPanel.getTiles().forEach(tile -> {
            Building building = tile.getBuilding();
            if (building != null) {
                building.updateStats(this.stats, this.difficulty, true);
                tile.reset();
            }
        });
        this.buildings.clear();
        this.statsPanel.refresh(this.stats);
    }

    public void reset() {
        this.difficulty = difficultySelector.show();
        if (this.difficulty == null) {
            System.exit(0);
        }
        this.setTitle(String.format(TITLE_FORMAT, Constants.TITLE, Constants.VERSION, difficulty));
        this.buildings.clear();
        this.stats.reset();
        this.gridPanel.reset();
        this.statsPanel.refresh(this.stats);
    }

    private boolean hasAllBuildingsBuilt() {
        return buildings.size() == Building.values().length;
    }

    private void checkVictory() {
        boolean hasNegativeAmounts = this.stats.hasNegativeStats();
        if (!hasNegativeAmounts && hasAllBuildingsBuilt()) {
            JOptionPane.showMessageDialog(this, Constants.WIN_MESSAGE, Constants.TITLE, JOptionPane.INFORMATION_MESSAGE);
            this.reset();
        }
    }

    static class WindowListener extends WindowAdapter {
        private final MainFrame mainFrame;

        public WindowListener(MainFrame mainFrame) {
            this.mainFrame = mainFrame;
        }

        @Override
        public void windowClosing(WindowEvent e) {
            int option = JOptionPane.showConfirmDialog(
                    this.mainFrame,
                    Constants.QUIT_MESSAGE,
                    Constants.TITLE,
                    JOptionPane.YES_NO_OPTION
            );
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
