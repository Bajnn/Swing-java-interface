package me.yolosw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {

    public static JLabel label;
    public static JFrame frame;
    public static JButton button;
    public static JButton register;
    public static JPanel panel;
    public static JLabel password;
    public static JLabel success;
    public static JPasswordField fieldPass;
    public static JTextField field;


    public static void main(String[] args) {

        label = new JLabel();
        frame = new JFrame();
        button = new JButton("Login");
        register = new JButton("Register");
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

        button.setBounds(100, 80, 100, 25);
        button.addActionListener(new Main());
        register.addActionListener(new Main());
        register.setBounds(100, 100, 100, 25);


        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);


        panel.add(success);
        panel.add(register);
        panel.add(button);
        panel.add(fieldPass);
        panel.add(label);
        panel.add(field);
        panel.add(password);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        /*
       When pressed opens another panel/frame so you can register
       RegisterFrame is the class the method is being called from
         */
        if (register.getModel().isArmed()) {
            RegisterFrame.RegisterPanel();
            String user = field.getText();
            String password = fieldPass.getText();

            System.out.println("Username: " + user + " \n Password :" + password);


        }


    }

}

