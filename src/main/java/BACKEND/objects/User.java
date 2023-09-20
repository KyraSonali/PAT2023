/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND.objects;

/**
 *
 * @author Kyrab
 */
public class User {

    private int userID;
    private String userFirstname;
    private String userLastName;
    private String username;
    private String userPassword;

    public User(int inUserID,String inFirstname, String inLastName,String inUsername, String inPassword) {
        userID = inUserID;
        userFirstname = inFirstname;
        userLastName = inLastName;
        username = inUsername;
        userPassword = inPassword;

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public void setUserFirstname(String userFirstname) {
        this.userFirstname = userFirstname;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }



    @Override
    public String toString() {
        return "User{" + "username=" + username + ", userPassword=" + userPassword + '}';
    }

}
