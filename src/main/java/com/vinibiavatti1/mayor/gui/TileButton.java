package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class TileButton extends JButton {
    private Building building = null;

    public TileButton(MainFrame mainFrame) {
        this.addActionListener(_ -> mainFrame.handleTileButtonClick(this));
    }

    public void placeBuilding(Building building) {
        Objects.requireNonNull(building);
        this.building = building;
        this.setIcon(building.getIcon());
        this.setToolTipText(building.getName());
    }

    public Building getBuilding() {
        return this.building;
    }

    public void reset() {
        this.setIcon(null);
        this.setToolTipText(null);
        this.building = null;
    }
}
