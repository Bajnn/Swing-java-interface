package me.yolosw;

import javax.swing.*;

public class LoginFrame  extends  Main{

    public static void LoginPanel(){

        label = new JLabel();
        frame = new JFrame();
        loginButton = new JButton("Login");
        registerButton = new JButton("Register");
        panel = new JPanel();
        password = new JLabel("Password");
        success = new JLabel();
        field = new JTextField(20);


        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);


        label.setText("Username");
        label.setBounds(10, 10, 80, 30);

        field.setBounds(100, 20, 165, 25);

        password.setBounds(10, 50, 80, 25);
        fieldPass = new JPasswordField(20);
        fieldPass.setBounds(100, 50, 165, 25);

        loginButton.setBounds(100, 80, 100, 25);
        loginButton.addActionListener(new Main());
        registerButton.addActionListener(new Main());
        registerButton.setBounds(100, 100, 100, 25);


        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);

// after logging in  destroy panels and create a new one
        panel.add(success);
        panel.add(registerButton);
        panel.add(loginButton);
        panel.add(fieldPass);
        panel.add(label);
        panel.add(field);
        panel.add(password);
        frame.setVisible(true);

    }
}
