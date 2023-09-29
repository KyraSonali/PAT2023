/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.objects;


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
    private LocalDate startDate;
    private LocalDate endDate;
    private int stepsCompleted;

    public UserGoals(int inGoalID, int inUserId, String inTypeOfGoal , String inSpecificGoal, String inStepsToCompleteGoal, LocalDate inStartDate, LocalDate inEndDate,int inStepsCompleted){
        goalID = inGoalID;
        userID = inUserId;
        typeOfGoal= inTypeOfGoal;
        specificGoal= inSpecificGoal;
        stepsToCompleteGoal = inStepsToCompleteGoal;
        startDate = inStartDate;
        endDate = inEndDate;
       stepsCompleted= inStepsCompleted;
        
    }

    public void setStepsCompleted(int stepsCompleted) {
        this.stepsCompleted = stepsCompleted;
    }

    public int getStepsCompleted() {
        return stepsCompleted;
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



    public LocalDate getStartDate() {
        return startDate;
    }



    public LocalDate getEndDate() {
        return endDate;
    }

   

 
 
    
    
    
}
