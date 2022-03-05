package me.yolosw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {

    public static JLabel label;
    public static JFrame frame;
    public static JButton loginButton;
    public static JButton registerButton;
    public static JPanel panel;
    public static JLabel password;
    public static JLabel success;
    public static JPasswordField fieldPass;
    public static JTextField field;


    public static void main(String[] args) {
        LoginFrame.LoginPanel();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        /*
       When button pressed opens another panel/frame so you can register
       RegisterFrame is the class the method is being called from
         */

        if (registerButton.getModel().isArmed()) {
            RegisterFrame.RegisterPanel();
            String user = field.getText();
            String password = fieldPass.getText();

            System.out.println("Username: " + user + " \n Password :" + password);


        }


        if(loginButton.getModel().isArmed()){


           /*
           should check if the username and password are correct

             maybe start a server and check if the  are valid
             if correct then open the main frame
             */

            MainFrame.MainFrame();
        }
    }

}

