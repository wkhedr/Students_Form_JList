package edu.fci.cs102;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton convertButton;

    MyFrame() {
        setTitle("Km to Miles Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*BorderLayout layout = new BorderLayout();
        panel1.add(convertButton, BorderLayout.SOUTH);
        panel1.setLayout(layout);*/
        setContentPane(panel1);
        setVisible(true);
        convertButton.addActionListener(e -> {
            String kilo = textField1.getText();
            double kilometers = Double.parseDouble(kilo);
            double miles = kilometers * 0.621371;
            JOptionPane.showMessageDialog(null, "kilometers is " + miles + " miles.");
        });

    }
}
