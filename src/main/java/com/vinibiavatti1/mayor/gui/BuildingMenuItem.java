package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;

import javax.swing.*;
import java.net.URL;
import java.util.Objects;

public class BuildingMenuItem extends JMenuItem{
    private final Building building;

    public BuildingMenuItem(MainFrame mainFrame, Building building) {
        this.building = building;
        this.setText(building.getName());
        URL iconUrl = Objects.requireNonNull(this.getClass().getResource(building.getImagePath()));
        this.setIcon(new ImageIcon(iconUrl));
        this.addActionListener(_ -> mainFrame.handleBuildingMenuItemClick(this));
    }

    public Building getBuilding() {
        return building;
    }
}
