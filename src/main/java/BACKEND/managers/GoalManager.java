/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import BACKEND.DB;
import BACKEND.objects.User;
import BACKEND.objects.UserGoals;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyra Balliram
 */
public class GoalManager {
    private UserGoals []goalArr = new UserGoals[100];
    private int size;

    public GoalManager() throws ClassNotFoundException, SQLException {
       //int currentUserID = AppManager.userManager.getCurrentUser().getID();
       size=0;
       
         String query = "SELECT * FROM kyrabDB.goals";
        try {
            ResultSet goals = DB.query(query);
            while (goals.next()) {
                int goalID = goals.getInt("idgoals");
                int userID = goals.getInt("idusers");
                String typeOfGoal = goals.getString("typeOfGoal");
                String specificGoal = goals.getString("specificGoal");
                String stepsToCompleteGoal = goals.getString("stepsToCompleteGoal");
                Date goalStartDate = goals.getDate("startDate");
                Date goalEndDate = goals.getDate("endDate");
                //get goal stuff
                //add to array 
                goalArr[size]= new UserGoals(goalID, userID, typeOfGoal, specificGoal, stepsToCompleteGoal, goalStartDate, goalEndDate);
                size++;
                //size++ 
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addGoal(int inUserID, String inTypeOfGoal , String inSpecificGoal, String inStepsToCompleteGoal, Date inStartDate, Date inEndDate) throws SQLException {
      
        //dd to db using update 
        String updateQuery = "INSERT INTO kyrabDB.goals ( idusers, typeOfGoal, specificGoal, stepsToCompleteGoal, startDate, endDate) VALUES ('" + inUserID + "','" + inTypeOfGoal + "','" + inSpecificGoal + inStepsToCompleteGoal + "','" + inStartDate + "','" + inEndDate + "')";
        System.out.println(updateQuery);
        DB.update(updateQuery);
        //retrieve generated query
        String getIdquery = "SELECT idgoals\n" + "FROM kyrabDB.goals\n" + "WHERE idUsers='" + inUserID +  "'";
        //move to next line
        ResultSet IDquery = DB.query(getIdquery);
        IDquery.next();
        int goalID = IDquery.getInt(1);
        //add to garr
        goalArr[size]= new UserGoals(goalID, inUserID, inTypeOfGoal, inSpecificGoal, inStepsToCompleteGoal, inStartDate, inEndDate);
        //currentvariable
        size++;
        //sizee++
        
        
    }
}
