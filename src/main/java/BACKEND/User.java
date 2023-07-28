/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author Kyrab
 */
public class User {

    private int userID;
    private String userFirstname;
    private String userSurname;
    private String userPassword;
    private String username;

    public User(int inUserID, String inPassword, String inUserFirstname, String inUserSurname, String genName) {
        userID = inUserID;
        userPassword = inPassword;
        userFirstname = inUserFirstname;
        userSurname = inUserSurname;
        username = genName;

    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", userPassword=" + userPassword + '}';
    }

}
