package me.yolosw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame   extends Main implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(register.getModel().isArmed()){
             /*
            This opens a GUI when you click register
             */
            register.setBounds(0, 0, 0, 0);
            panel.remove(register);
            frame.remove(register);
            JLabel label2 = new JLabel();
            JLabel password2 = new JLabel();

            JFrame frame2 = new JFrame();

            JPanel panel2 = new JPanel();

            JTextField field2 = new JTextField();

            JPasswordField fieldPass2 = new JPasswordField(20);

            frame2.setSize(300, 300);

            frame2.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);


            frame2.add(panel2);

            frame2.setVisible(true);

            System.out.println("f");

            panel2.setLayout(null);

            label2.setText("Username");

            label2.setBounds(10, 10, 80, 30);

            field2.setBounds(100, 20, 165, 25);
            password2.setText("Password");

            password2.setBounds(10, 50, 80, 25);

            fieldPass2.setBounds(100, 50, 165, 25);

            panel2.add(password2);
            panel2.add(label2);
            panel2.add(password2);
            panel2.add(fieldPass2);
            panel2.add(field2);
        }
    }
}