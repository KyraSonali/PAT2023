/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.objects;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author Kyra Balliram
 */
public class UserGoals {
    
    private int goalID;
    private int userID;
    private String typeOfGoal;
    private String specificGoal;
    private String stepsToCompleteGoal;
    private Date startDate;
    private Date endDate;

    public UserGoals(int inGoalID, int inUserId, String inTypeOfGoal , String inSpecificGoal, String inStepsToCompleteGoal, Date inStartDate, Date inEndDate){
        goalID = inGoalID;
        userID = inUserId;
        typeOfGoal= inTypeOfGoal;
        specificGoal= inSpecificGoal;
        stepsToCompleteGoal = inStepsToCompleteGoal;
        startDate = inStartDate;
        endDate = inEndDate;
        
    }

    public int getGoalID() {
        return goalID;
    }

    public int getUserID() {
        return userID;
    }


    public String getTypeOfGoal() {
        return typeOfGoal;
    }


    public String getSpecificGoal() {
        return specificGoal;
    }


    public String getStepsToCompleteGoal() {
        return stepsToCompleteGoal;
    }



    public Date getStartDate() {
        return startDate;
    }



    public Date getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "UserGoals{" + "goalID=" + goalID + ", userID=" + userID + ", typeOfGoal=" + typeOfGoal + ", specificGoal=" + specificGoal + ", stepsToCompleteGoal=" + stepsToCompleteGoal + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

 
    
    
    
}
