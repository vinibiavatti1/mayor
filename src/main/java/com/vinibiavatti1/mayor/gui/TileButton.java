package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;

import javax.swing.*;
import java.net.URL;
import java.util.Objects;

public class TileButton extends JButton {
    public TileButton(MainFrame mainFrame) {
        this.addActionListener(_ -> mainFrame.handleTileButtonClick(this));
    }

    public void disable(Building building) {
        URL iconUrl = Objects.requireNonNull(getClass().getResource(building.getImagePath()));
        this.setIcon(new ImageIcon(iconUrl));
        this.setDisabledIcon(new ImageIcon(iconUrl));
        this.setEnabled(false);
        this.setToolTipText(building.getName());
    }

    public void reset() {
        this.setIcon(null);
        this.setEnabled(true);
        this.setToolTipText(null);
    }
}
