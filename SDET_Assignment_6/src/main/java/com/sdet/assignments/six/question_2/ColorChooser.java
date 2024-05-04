package com.sdet.assignments.six.question_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField textField = new JTextField(10);
        panel.add(textField);

        JButton button = new JButton("Get Color");
        panel.add(button);

        JLabel colorLabel = new JLabel();
        panel.add(colorLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String colorName = textField.getText();
                Color color = ColorHashMap.getColor(colorName);
                if (color != null) {
                    colorLabel.setText("Color: " + color.toString());
                    colorLabel.setForeground(color);
                } else {
                    colorLabel.setText("Color not found");
                    colorLabel.setForeground(Color.RED);
                }
            }
        });

        frame.setVisible(true);
    }
}
