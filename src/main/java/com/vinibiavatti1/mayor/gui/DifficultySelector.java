package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.Constants;
import com.vinibiavatti1.mayor.data.Difficulty;

import javax.swing.*;

public class DifficultySelector {
    private static final String TITLE_FORMAT = "%s (v%s)";

    private final MainFrame mainFrame;

    public DifficultySelector(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public Difficulty show() {
        int option = JOptionPane.showOptionDialog(
                this.mainFrame,
                Constants.WELCOME_MESSAGE,
                String.format(TITLE_FORMAT, Constants.TITLE, Constants.VERSION),
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                Difficulty.values(),
                0
        );
        if (option == -1) {
            return null;
        }
        return Difficulty.values()[option];
    }
}
