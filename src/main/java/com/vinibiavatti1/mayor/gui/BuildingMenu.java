package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.data.Building;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class BuildingMenu extends JPopupMenu {
    private final MainFrame mainFrame;

    public BuildingMenu(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.createMenuItems();
    }

    private void createMenuItems() {
        Building[] buildings = Building.values();
        Arrays.sort(buildings, Comparator.comparingInt(Building::getOrder));
        Arrays.stream(buildings).forEach(building -> add(new BuildingMenuItem(mainFrame, building)));
    }
}
