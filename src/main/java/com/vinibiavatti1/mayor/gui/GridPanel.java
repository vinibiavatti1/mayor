package com.vinibiavatti1.mayor.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GridPanel extends JPanel {
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;

    private final List<TileButton> tiles = new ArrayList<>();
    private final MainFrame mainFrame;

    public GridPanel(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.setLayout(new GridLayout(GRID_WIDTH, GRID_HEIGHT));
        this.createButtons();
        this.reset();
    }

    public void reset() {
        tiles.forEach(TileButton::reset);
    }

    public List<TileButton> getTiles() {
        return tiles;
    }

    private void createButtons() {
        for (int x = 0; x < GRID_WIDTH; x++) {
            for (int y = 0; y < GRID_HEIGHT; y++) {
                TileButton button = new TileButton(this.mainFrame);
                tiles.add(button);
                this.add(button);
            }
        }
    }
}
