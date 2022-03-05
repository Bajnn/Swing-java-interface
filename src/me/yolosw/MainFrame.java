package me.yolosw;

import javax.swing.*;
import java.awt.*;

public class MainFrame  extends Main{
    public static void MainFrame(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel("ff text");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(10);
// IDK why it has to be set visible because it should manually be true but no on this library

        frame.setVisible(true);



        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        label.setBounds(10,10,80,25);
        panel.setLayout(null);

        textField.setBounds(10,100,100,20);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));



        panel.add(textField);
        panel.add(label);




    }
}
