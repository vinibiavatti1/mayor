package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.Constants;
import com.vinibiavatti1.mayor.data.*;
import com.vinibiavatti1.mayor.data.ResourceStats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import java.util.Objects;
import java.util.List;

public class MainFrame extends JFrame {
    private static final String TITLE_FORMAT = "%s (v%s)";
    private static final String ICON_PATH = "/mayor.png";
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    private final DifficultySelector difficultySelector = new DifficultySelector(this);
    private final ResourceStats resourceStats = new ResourceStats();
    private final GridPanel gridPanel = new GridPanel(this);
    private final StatsPanel statsPanel = new StatsPanel();
    private final BuildingMenu buildingMenu = new BuildingMenu(this);
    private final StatusBar statusBar = new StatusBar();

    private Difficulty difficulty = null;
    private TileButton currentTileButton = null;
    private boolean victory = false;

    public MainFrame() {
        URL iconUrl = Objects.requireNonNull(this.getClass().getResource(ICON_PATH));
        this.setTitle(String.format(TITLE_FORMAT, Constants.TITLE, Constants.VERSION));
        this.setIconImage(new ImageIcon(iconUrl).getImage());
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setJMenuBar(new MenuBar(this));
        this.add(statusBar, BorderLayout.PAGE_END);
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
            building.updateResourceStats(this.resourceStats, this.difficulty, true);
            tileButton.reset();
            this.checkVictory();
            refresh();
        }
    }

    public void handleBuildingMenuItemClick(BuildingMenuItem buildingMenuItem) {
        Building building = buildingMenuItem.getBuilding();
        this.currentTileButton.placeBuilding(building);
        building.updateResourceStats(this.resourceStats, this.difficulty, false);
        this.statsPanel.refresh(this.resourceStats);
        this.checkVictory();
        refresh();
    }

    public void clearAllTiles() {
        this.gridPanel.getTiles().forEach(tile -> {
            Building building = tile.getBuilding();
            if (building != null) {
                building.updateResourceStats(this.resourceStats, this.difficulty, true);
                tile.reset();
            }
        });
        refresh();
    }

    public void reset() {
        this.difficulty = difficultySelector.show();
        if (this.difficulty == null) {
            System.exit(0);
        }
        this.victory = false;
        this.resourceStats.reset();
        this.gridPanel.reset();
        refresh();
    }

    public void buildAllBuildingTypes() {
        Building[] buildings = Building.values();
        List<TileButton> tiles = this.gridPanel.getTiles();
        for (int i = 0; i < buildings.length; i++) {
            TileButton tile = tiles.get(i);
            if (tile.getBuilding() != null) {
                tile.getBuilding().updateResourceStats(this.resourceStats, this.difficulty, true);
            }
            Building building = buildings[i];
            tiles.get(i).placeBuilding(building);
            building.updateResourceStats(this.resourceStats, this.difficulty, false);
        }
        refresh();
    }

    private void refresh() {
        this.statsPanel.refresh(this.resourceStats);
        int tileAmount = (int) this.gridPanel.getTiles().stream()
                .filter(tile -> tile.getBuilding() != null)
                .count();
        int landmarkAmount = (int) getBuildingsBuilt().stream()
                .filter(building -> building == Building.LANDMARK)
                .count();
        this.statusBar.refresh(this.difficulty, this.victory, tileAmount, getBuildingsBuilt().size(), landmarkAmount);
    }

    private List<Building> getBuildingsBuilt() {
        return this.gridPanel.getTiles().stream()
                .map(TileButton::getBuilding)
                .filter(Objects::nonNull)
                .distinct()
                .toList();
    }

    private boolean hasAllBuildingsBuilt() {
        int buildingAmount = this.getBuildingsBuilt().size();
        return buildingAmount == Building.values().length;
    }

    private void checkVictory() {
        boolean hasNegativeAmounts = this.resourceStats.hasNegativeResources();
        if (!victory && !hasNegativeAmounts && hasAllBuildingsBuilt()) {
            JOptionPane.showMessageDialog(this, Constants.WIN_MESSAGE, Constants.TITLE, JOptionPane.INFORMATION_MESSAGE);
            this.victory = true;
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
