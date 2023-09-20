/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND.managers;

/**
 *
 * @author Kyrab
 */
import BACKEND.DB;
import BACKEND.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BACKEND.objects.User;
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
 

    public UserManager() throws ClassNotFoundException, SQLException {
       
        size = 0;

        String query = "SELECT * FROM kyrabDB.users";
        try {
            ResultSet users = DB.query(query);
            while (users.next()) {
                int id = users.getInt("idusers");
                String firstName = users.getString("firstName");
                String lastName = users.getString("lastName");
                String username = users.getString("username");
                String password = users.getString("password");
                pArr[size] = new User(id, firstName, lastName, username, password);
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

    public void addUser(String firstName, String lastName, String username, String password) throws SQLException {
        //add user to databse
        String query = " INSERT INTO kyrabDB.users (firstName,lastName,username,Password) VALUES( '" + firstName + "','" + lastName + "','" + username + "','" + password + "')";
        System.out.println(query);
        DB.update(query);
        //retrieve generated query
        String getIdquery = "SELECT idusers\n" + "FROM kyrabDB.users\n" + "WHERE firstName='" + firstName + "' AND lastName='" + lastName + "'";
        //move to next line
        ResultSet IDquery = DB.query(getIdquery);
        IDquery.next();
        int userId = IDquery.getInt(1);

        //update array
        pArr[size] = new User(userId, firstName, lastName, username, password);
        currentUser = pArr[size];
        size++;

    }
    
    
    //login
    //sets current user.
    //UI -> AppManager.userManager.login(user, password);

}
