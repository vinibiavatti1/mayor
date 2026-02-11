package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;
import com.vinibiavatti1.mayor.data.Difficulty;

import javax.swing.*;
import java.awt.*;

public class StatusBar extends JToolBar {
    private final JLabel difficultyDataLabel = new JLabel();
    private final JLabel tileAmountDataLabel = new JLabel();
    private final JLabel buildingAmountDataLabel = new JLabel();
    private final JLabel landmarkAmountDataLabel = new JLabel();
    private final JLabel victoryDataLabel = new JLabel();

    public StatusBar() {
        JLabel difficultyTextLabel = new JLabel("Difficulty:");
        JLabel tileAmountTextLabel = new JLabel("Tiles:");
        JLabel buildingAmountTextLabel = new JLabel("Building Types:");
        JLabel landmarkAmountTextLabel = new JLabel("Landmarks:");
        JLabel victoryTextLabel = new JLabel("Status:");

        difficultyTextLabel.setForeground(Color.GRAY);
        tileAmountTextLabel.setForeground(Color.GRAY);
        buildingAmountTextLabel.setForeground(Color.GRAY);
        landmarkAmountTextLabel.setForeground(Color.GRAY);
        victoryTextLabel.setForeground(Color.GRAY);

        this.setFloatable(false);
        this.add(difficultyTextLabel);
        this.addSeparator();
        this.add(this.difficultyDataLabel);
        this.addSeparator();
        this.add(tileAmountTextLabel);
        this.addSeparator();
        this.add(this.tileAmountDataLabel);
        this.addSeparator();
        this.add(buildingAmountTextLabel);
        this.addSeparator();
        this.add(this.buildingAmountDataLabel);
        this.addSeparator();
        this.add(landmarkAmountTextLabel);
        this.addSeparator();
        this.add(this.landmarkAmountDataLabel);
        this.addSeparator();
        this.add(victoryTextLabel);
        this.addSeparator();
        this.add(this.victoryDataLabel);
    }

    public void refresh(Difficulty difficulty, boolean victory, int tileAmount, int buildingAmount, int landmarkAmount) {
        this.difficultyDataLabel.setText(difficulty.toString());
        this.tileAmountDataLabel.setText(String.valueOf(tileAmount));
        this.buildingAmountDataLabel.setText(String.format("%s/%s", buildingAmount, Building.values().length));
        this.landmarkAmountDataLabel.setText(String.valueOf(landmarkAmount));
        String victoryText = victory ? "SUCCESS!" : "FAILURE";
        Color victoryColor = victory ? Color.BLUE : Color.RED;
        this.victoryDataLabel.setText(victoryText);
        this.victoryDataLabel.setForeground(victoryColor);
    }
}
