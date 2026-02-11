package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.Constants;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.Objects;

public class MenuBar extends JMenuBar {
    private final MainFrame mainFrame;

    public MenuBar(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.buildMenu();
    }

    private void buildMenu() {
        JMenu menu = new JMenu("Actions");

        JMenuItem buildMenuItem = new JMenuItem("Build All Types");
        JMenuItem clearMenuItem = new JMenuItem("Clear All Tiles");
        JMenuItem restartMenuItem = new JMenuItem("Restart");
        JMenuItem quitMenuItem = new JMenuItem("Quit");

        URL buildIconUrl = Objects.requireNonNull(this.getClass().getResource("/build.png"));
        URL clearIconUrl = Objects.requireNonNull(this.getClass().getResource("/clear.png"));
        URL restartIconUrl = Objects.requireNonNull(this.getClass().getResource("/reset.png"));
        URL quitIconUrl = Objects.requireNonNull(this.getClass().getResource("/quit.png"));

        buildMenuItem.setIcon(new ImageIcon(buildIconUrl));
        clearMenuItem.setIcon(new ImageIcon(clearIconUrl));
        restartMenuItem.setIcon(new ImageIcon(restartIconUrl));
        quitMenuItem.setIcon(new ImageIcon(quitIconUrl));

        buildMenuItem.addActionListener(this::handleBuildMenuItemClick);
        clearMenuItem.addActionListener(this::handleClearMenuItemClick);
        restartMenuItem.addActionListener(this::handleRestartMenuItemClick);
        quitMenuItem.addActionListener(this::handleQuitMenuItemClick);

        menu.add(buildMenuItem);
        menu.add(clearMenuItem);
        menu.add(restartMenuItem);
        menu.addSeparator();
        menu.add(quitMenuItem);

        this.add(menu);
    }

    private void handleClearMenuItemClick(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(
                this.mainFrame,
                Constants.CLEAR_MESSAGE,
                Constants.TITLE,
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            mainFrame.clearAllTiles();
        }
    }

    private void handleRestartMenuItemClick(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(
                this.mainFrame,
                Constants.RESTART_MESSAGE,
                Constants.TITLE,
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            mainFrame.reset();
        }
    }

    private void handleQuitMenuItemClick(ActionEvent e) {
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

    private void handleBuildMenuItemClick(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(
                this.mainFrame,
                Constants.BUILD_MESSAGE,
                Constants.TITLE,
                JOptionPane.YES_NO_OPTION
        );
        if (option == JOptionPane.YES_OPTION) {
            this.mainFrame.buildAllBuildingTypes();
        }
    }
}
