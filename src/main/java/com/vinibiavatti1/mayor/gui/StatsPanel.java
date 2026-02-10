package com.vinibiavatti1.mayor.gui;

import com.vinibiavatti1.mayor.model.Stats;
import com.vinibiavatti1.mayor.data.Resource;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class StatsPanel extends JPanel {
    private final HashMap<Resource, JTextField> fields = new HashMap<>();

    public StatsPanel() {
        int rowCount = Resource.values().length;
        this.setLayout(new GridLayout(rowCount, 2));
        this.createFields();
    }

    public void refresh(Stats stats) {
        fields.forEach((resource, field) -> {
            int amount = stats.get(resource);
            field.setText(String.valueOf(amount));
            if (amount < 0) {
                field.setForeground(Color.RED);
            } else if (amount > 0) {
                field.setForeground(Color.BLUE);
            } else {
                field.setForeground(Color.BLACK);
            }
        });
    }

    private void createFields() {
        Resource[] resources = Resource.values();
        Arrays.sort(resources, Comparator.comparingInt(Resource::getOrder));
        for (Resource resource : resources) {
            JTextField resourceNameField = new JTextField(resource.getName());
            JTextField resourceAmountField = new JTextField("0");
            resourceNameField.setEditable(false);
            resourceNameField.setHorizontalAlignment(JTextField.RIGHT);
            resourceNameField.setMargin(new Insets(2, 2, 2, 2));
            resourceAmountField.setEditable(false);
            resourceAmountField.setFont(resourceAmountField.getFont().deriveFont(Font.BOLD));
            resourceAmountField.setMargin(new Insets(2, 2, 2, 2));
            this.add(resourceNameField);
            this.add(resourceAmountField);
            fields.put(resource, resourceAmountField);
        }
    }
}
