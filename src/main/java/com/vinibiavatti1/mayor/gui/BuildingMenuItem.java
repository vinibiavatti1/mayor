package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;

import javax.swing.*;

public class BuildingMenuItem extends JMenuItem{
    private final Building building;

    public BuildingMenuItem(MainFrame mainFrame, Building building) {
        this.building = building;
        this.setText(building.getName());
        this.setIcon(building.getIcon());
        this.addActionListener(_ -> mainFrame.handleBuildingMenuItemClick(this));
    }

    public Building getBuilding() {
        return building;
    }
}
