package View;

import Database.MainDatabase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Saturday 11 November 2023
 * @Time: 9:19 PM
 */
public class LoginGUI {

    public LoginGUI() {
        MainDatabase DB = new MainDatabase();
        DB.Checking();

    }


}
