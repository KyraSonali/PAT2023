/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author Kyrab
 */
import BACKEND.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BACKEND.User;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class UserManager {

    private User currentUser;
    private User[] pArr = new User[100];

    private int size;
    private DB k;

    public UserManager() throws ClassNotFoundException, SQLException {
        k = new DB();
        size = 0;

        String query = "SELECT * FROM kyrabDB.Users";
        try {
            ResultSet users = k.query(query);
            while (users.next()) {
                int id = users.getInt("UserID");
                String name = users.getString("Name");
                String surname = users.getString("Surname");
                String password = users.getString("Password");
                String username = users.getString("Username");
                pArr[size] = new User(id, password, name, surname, username);
                size++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += pArr[i] + "\n";
        }

        return output;
    }

    public boolean checkUser(String inUsername, String inPassword) {
        for (int i = 0; i < size; i++) {
            if (pArr[i].getUsername().equals(inUsername) && pArr[i].getUserPassword().equals(inPassword)) {
                //gets current user
                currentUser = pArr[i];
                return true;
            }

        }

        return false;
    }

    public int getCurrentUser() {
        int id = currentUser.getUserID();
        return id;
    }

    public void addUser(String name, String surname, String password) throws SQLException {
        //add user to databse
        String query = " INSERT INTO kyrabDB.Users (Name,Surname,Password) VALUES( '" + name + "','" + surname + "','" + password + "')";
        System.out.println(query);
        k.update(query);
        //retrieve generated query
        String getIdquery = "SELECT UserID\n" + "FROM kyrabDB.Users\n" + "WHERE Name='" + name + "' AND Surname='" + surname + "'";
        //move to next line
        ResultSet IDquery = k.query(getIdquery);
        IDquery.next();
        int userId = IDquery.getInt(1);
        //generate username
        String genUsername = "@" + name.charAt(0) + surname.charAt(0) + userId;
        String userUpper = genUsername.toUpperCase();
        //add generated username to db
        String updateQuery = "UPDATE kyrabDB.Users\n" + "SET Username ='" + userUpper + "'  WHERE UserId= '" + userId + "'";
        System.out.println(updateQuery);
        k.update(updateQuery);
        //update array
        pArr[size] = new User(userId, password, name, surname, genUsername);
        currentUser = pArr[size];
        size++;

    }

}
