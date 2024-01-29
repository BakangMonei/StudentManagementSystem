package Database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Saturday 11 November 2023
 * @Time: 9:14 PM
 */
public class MainDatabase {

    private JLabel loginJLabel;
    private JTextField UsernameTXT;
    private JPasswordField passwordTXT;
    private JButton LOGINBUTTONButton;

    public MainDatabase(){
        LOGINBUTTONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Checking();
                LOGINBUTTONButton.setVisible(true);
            }
        });
        loginJLabel.setVisible(true);
    }
    public void Checking(){
        String username = UsernameTXT.getText().toString().trim();
        String password = passwordTXT.getText().toString();

        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Enter initials");
        }

        if (username.equals("Mpho") && password.equals("Neiza")){
            System.out.println("Successful Login");
        }
        else {
            System.out.println("Go away!!!!!");
        }
    }

}
