package me.yolosw;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main implements ActionListener {

    private static JLabel label;
    private static JFrame frame;
    private static JButton button;
    private static JButton register;
    private static JPanel panel;
    private static JLabel password;
    private static JLabel success;
    private static JPasswordField fieldPass;
    private static JTextField field;


    public static void main(String[] args) {




         label = new JLabel();
         frame = new JFrame();
         button = new JButton("Login");
         register = new JButton("Register");
         panel = new JPanel();
         password = new JLabel("Password");
         success = new JLabel();
         field = new JTextField(20);
         // test

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
        /* String password = fieldPass.getText();
        FileWriter fw1 = new FileWriter(new File(fieldPass + ".txt"));
        fw1.write(String.valueOf(fieldPass));
        fw1.close();

         */
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {

        if(button.getModel().isArmed()){
            String user = field.getText();
            String password = fieldPass.getText();

            if(password == null){
                System.out.println("Hej");
            }
            System.out.println(user + "," + password);


        }

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


            /*
            Do not type in any real passwords
             */
        }
    }

}

