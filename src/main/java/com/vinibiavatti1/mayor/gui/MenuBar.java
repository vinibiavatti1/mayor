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

        JMenuItem resetMenuItem = new JMenuItem("Reset");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        URL resetIconUrl = Objects.requireNonNull(this.getClass().getResource("/reset.png"));
        URL quitIconUrl = Objects.requireNonNull(this.getClass().getResource("/quit.png"));
        resetMenuItem.setIcon(new ImageIcon(resetIconUrl));
        quitMenuItem.setIcon(new ImageIcon(quitIconUrl));
        resetMenuItem.addActionListener(this::handleResetMenuItemClick);
        quitMenuItem.addActionListener(this::handleQuitMenuItemClick);

        menu.add(resetMenuItem);
        menu.addSeparator();
        menu.add(quitMenuItem);

        this.add(menu);
    }

    private void handleResetMenuItemClick(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(
                this.mainFrame,
                Constants.RESET_MESSAGE,
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
}
