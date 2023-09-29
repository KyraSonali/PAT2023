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

 
    public String getUserFirstname() {
        return userFirstname;
    }

   

    public String getUserLastName() {
        return userLastName;
    }


    public String getUsername() {
        return username;
    }



    public String getUserPassword() {
        return userPassword;
    }






}
