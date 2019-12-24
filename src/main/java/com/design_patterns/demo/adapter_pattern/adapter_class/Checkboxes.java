package com.design_patterns.demo.adapter_pattern.adapter_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author DucDT
 */
public class Checkboxes extends JFrame implements ItemListener {

    CheckboxAdapter checks[];
    JTextField textField;

    public Checkboxes() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        checks = new CheckboxAdapter[4];

        for(int i = 0; i <= checks.length-1; i++) {
            checks[i] = new CheckboxAdapter("Check " + i);
            checks[i].addItemListener(this);
        contentPane.add(checks[i]);
        }

        textField = new JTextField(30);
        contentPane.add(textField);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String outString = new String("Selected: ");

        for (int i = 0; i<=checks.length-1; i++) {
            if (checks[i].isSelected()) {
                outString += " checkbox " + i;
            }
        }
        textField.setText(outString);
    }

    public static void main(String[] args) {
        final Checkboxes f = new Checkboxes();

        f.setBounds(100, 100, 400, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
