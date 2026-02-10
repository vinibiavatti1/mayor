package com.vinibiavatti1.mayor.gui;

import javax.swing.*;

public class TileButton extends JButton {
    public TileButton(MainFrame mainFrame) {
        this.addActionListener(_ -> mainFrame.handleTileButtonClick(this));
    }

    public void disable(BuildingMenuItem buildingMenuItem) {
        this.setIcon(buildingMenuItem.getIcon());
        this.setDisabledIcon(buildingMenuItem.getIcon());
        this.setEnabled(false);
        this.setToolTipText(buildingMenuItem.getBuilding().getName());
    }

    public void reset() {
        this.setIcon(null);
        this.setEnabled(true);
        this.setToolTipText(null);
    }
}
