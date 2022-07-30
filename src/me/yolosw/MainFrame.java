package me.yolosw;

import javax.swing.*;
import java.awt.*;

public class MainFrame  extends Main{
    public static void MainFrame(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hej");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
        String f = textField.getText();

        boolean onOff = true;


        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        label.setBounds(10, 10, 80, 25);
        panel.setLayout(null);

        label.setBounds(10, 10, 800, 25);
        label.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));


        panel.add(textField);
        panel.add(label);


        if (MainFrame.loginButton.getModel().isPressed()) {
            onOff = false;
        }

        // IDK why it has to be set visible because it should manually be true but no on this library
        frame.setVisible(onOff);


    }
}
