/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import BACKEND.DB;
import BACKEND.objects.UserGoals;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyra Balliram
 */
public class GoalManager {

    private UserGoals[] goalArr = new UserGoals[100];
    private int size;

    public GoalManager() throws ClassNotFoundException, SQLException {

        size = 0;

        String query = "SELECT * FROM kyrabDB.goals";
        try {
            ResultSet goals = DB.query(query);
            while (goals.next()) {
                int goalID = goals.getInt("idgoals");
                int userID = goals.getInt("idusers");
                String typeOfGoal = goals.getString("typeOfGoal");
                String specificGoal = goals.getString("specificGoal");
                String stepsToCompleteGoal = goals.getString("stepsToCompleteGoal");
                String goalStartDate = goals.getString("startDate");
                String goalEndDate = goals.getString("endDate");
                DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate startDate = LocalDate.parse(goalStartDate, m);

                LocalDate endDate = LocalDate.parse(goalEndDate, m);
                int stepsCompleted = goals.getInt("stepsCompleted");
                goalArr[size] = new UserGoals(goalID, userID, typeOfGoal, specificGoal, stepsToCompleteGoal, startDate, endDate, stepsCompleted);
                size++;

            }

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addGoal(int inUserID, String inTypeOfGoal, String inSpecificGoal, String inStepsToCompleteGoal, LocalDate inStartDate, LocalDate inEndDate, int stepsCompleted) throws SQLException {
        //dd to db using update 
        stepsCompleted = 0;
        String updateQuery = "INSERT INTO kyrabDB.goals (idusers, typeOfGoal, specificGoal, stepsToCompleteGoal, startDate, endDate, stepsCompleted) " + "\n"
                + "VALUES ('" + inUserID + "','" + inTypeOfGoal + "','" + inSpecificGoal + "','" + inStepsToCompleteGoal + "','" + inStartDate + "','" + inEndDate + "','" + stepsCompleted + "');";

        System.out.println(updateQuery);
        DB.update(updateQuery);
        //retrieve generated query
        String getIdquery = "SELECT idgoals\n" + "FROM kyrabDB.goals\n" + "WHERE idUsers=" + inUserID + ";";
        //move to next line
        ResultSet IDquery = DB.query(getIdquery);
        IDquery.next();
        int goalID = IDquery.getInt(1);
        //add to garr
        goalArr[size] = new UserGoals(goalID, inUserID, inTypeOfGoal, inSpecificGoal, inStepsToCompleteGoal, inStartDate, inEndDate, stepsCompleted);
        size++;

    }

    //gets duration of goal
    public String getDurationOfGoal(int currentUserID, String specificGoal) throws SQLException {
        String getStartDateQuery = "SELECT startDate\n"
                + "FROM kyrabDB.goals\n"
                + "WHERE idusers = " + currentUserID + "\n"
                + "AND specificGoal = '" + specificGoal + "'" + ";";

        String getEndDateQuery = "SELECT endDate\n"
                + "FROM kyrabDB.goals\n"
                + "WHERE idusers = " + currentUserID + "\n"
                + "AND specificGoal = '" + specificGoal + "'" + ";";

        ResultSet startDateQuery = DB.query(getStartDateQuery);
        ResultSet endDateQuery = DB.query(getEndDateQuery);
        startDateQuery.next();
        java.sql.Date sqlStartDate = startDateQuery.getDate("startDate");
        LocalDate goalStartDate = sqlStartDate.toLocalDate();
        endDateQuery.next();
        java.sql.Date sqlEndDate = endDateQuery.getDate("endDate");
        LocalDate goalEndDate = sqlEndDate.toLocalDate();

        Period period = Period.between(goalStartDate, goalEndDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        StringBuilder durationStr = new StringBuilder();

        if (years > 0) {
            durationStr.append(years).append(years > 1 ? " years " : " year ");
        }
        if (months > 0) {
            durationStr.append(months).append(months > 1 ? " months " : " month ");
        }
        if (days > 0) {
            durationStr.append(days).append(days > 1 ? " days" : " day");
        }

        if (durationStr.length() == 0) {
            return "0 days";
        }

        return durationStr.toString().trim();
    }

// gets all goals for a users id 
    public ArrayList<String> getGoalsInProgress(int userID) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        String getInProgressGoalsQuery = "SELECT specificGoal "
                + "FROM kyrabDB.goals "
                + "WHERE idusers = " + userID + ";";
        ResultSet inProgressGoalsQuery = DB.query(getInProgressGoalsQuery);

        while (inProgressGoalsQuery.next()) {
            String output = inProgressGoalsQuery.getString("specificGoal");
            list.add(output);
        }
        return list;
    }

    //retrieves goal id
    public int getSelectedGoalID(String specificGoal, int UserID) throws SQLException {
        String getGoalIDquery = "SELECT idgoals \n"
                + "FROM kyrabDB.goals \n"
                + "WHERE specificGoal = '" + specificGoal + "'"
                + "AND idusers = " + UserID + ";";
        ResultSet goalIDquery = DB.query(getGoalIDquery);
        goalIDquery.next();
        int goalID = goalIDquery.getInt("idgoals");
        return goalID;

    }

    //gets all the steps in the db for that goal id
    private String getTotalSteps(int goalID) throws SQLException {
        String getSteps = "SELECT stepsToCompleteGoal "
                + "FROM kyrabDB.goals "
                + "WHERE idgoals = " + goalID + ";";
        ResultSet getStepsQuery = DB.query(getSteps);
        getStepsQuery.next();
        String steps = getStepsQuery.getString("stepsToCompleteGoal");
        return steps;

    }

    //turns steps into a list that can be showcased in the ui
    private ArrayList<String> getStepsOfGoalAsList(int goalID) throws SQLException {
        String stepsString = getTotalSteps(goalID);
        String[] stepsArray = stepsString.split("\n");
        return new ArrayList<>(Arrays.asList(stepsArray));
    }

    public void stepIsCompleted(int goalID) throws SQLException {
        int stepCompleted;
        for (int i = 0; i < size; i++) {
            if (goalArr[i].getGoalID() == goalID) {
                stepCompleted = goalArr[i].getStepsCompleted();
                stepCompleted += 1;
                goalArr[i].setStepsCompleted(stepCompleted);

                String updateCompletedStep = "UPDATE kyrabDB.goals \n"
                        + "SET stepsCompleted = " + stepCompleted + "\n"
                        + "WHERE idgoals = " + goalID + ";";
                DB.update(updateCompletedStep);

            }
        }
    }

    public int getNbrOfsteps(int goalID) throws SQLException {
        String originalStepsString = getTotalSteps(goalID);
        List<String> originalStepsList = Arrays.asList(originalStepsString.split("\n"));
        return originalStepsList.size();
    }

    public List<String> getRemainingSteps(int goalID) throws SQLException {
        List<String> allSteps = getStepsOfGoalAsList(goalID);
        int completedSteps = getStepsCompleted(goalID);

        // Check if there are any steps left to complete
        if (completedSteps >= allSteps.size()) {
            return new ArrayList<>(); // Return an empty list if all steps are completed
        }

        return allSteps.subList(completedSteps, allSteps.size());
    }

    public ArrayList<String> getAllCompletedGoals() throws SQLException {
        ArrayList<String> completedGoals = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int currentGoalID = goalArr[i].getGoalID();
            List<String> allStepsForCurrentGoal = getStepsOfGoalAsList(currentGoalID);
            int completedStepsForCurrentGoal = getStepsCompleted(currentGoalID);

            if (completedStepsForCurrentGoal == allStepsForCurrentGoal.size()) {
                completedGoals.add(goalArr[i].getSpecificGoal());
            }
        }

        return completedGoals;
    }

    public ArrayList<String> getAllcurrentGoals() throws SQLException {
        ArrayList<String> currentGoalsInProgress = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int currentGoalID = goalArr[i].getGoalID();
            List<String> allStepsForCurrentGoal = getStepsOfGoalAsList(currentGoalID);
            int completedStepsForCurrentGoal = getStepsCompleted(currentGoalID);

            // Check if the goal is not completed
            if (completedStepsForCurrentGoal < allStepsForCurrentGoal.size()) {
                currentGoalsInProgress.add(goalArr[i].getSpecificGoal());
            }
        }
        return currentGoalsInProgress;
    }

    private int getStepsCompleted(int goalID) {
        int completedSteps = 0;
        for (int i = 0; i < size; i++) {
            if (goalArr[i].getGoalID() == goalID) {
                completedSteps = goalArr[i].getStepsCompleted();
                break;
            }
        }
        return completedSteps;
    }

    public double calculateCompletionPercentage(int goalID) throws SQLException {

        int totalSteps = getNbrOfsteps(goalID);

        if (totalSteps == 0) {
            return 100.0;
        }

        int completedSteps = getStepsCompleted(goalID);

        return (completedSteps / (double) totalSteps) * 100;
    }

    public ArrayList<String> getGoalsDue(String dateEntered) throws SQLException {
        ArrayList<String> goalsDue = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate enteredDate = LocalDate.parse(dateEntered, formatter);
        ArrayList<String> completedGoalsList = getAllCompletedGoals();

        for (int i = 0; i < size; i++) {
            UserGoals currentGoal = goalArr[i];
            if (currentGoal.getEndDate().isEqual(enteredDate) && !completedGoalsList.contains(currentGoal.getSpecificGoal())) {
                String upcomingGoalsString = currentGoal.getSpecificGoal();
                goalsDue.add(upcomingGoalsString);
            }
        }
        return goalsDue;
    }

    public ArrayList<LocalDate> getGoalDatesForMonth(int month) {
        ArrayList<LocalDate> goalDatesForMonth = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            UserGoals currentGoal = goalArr[i];
            LocalDate endDate = currentGoal.getEndDate();

            if (endDate.getMonthValue() == month) {
                goalDatesForMonth.add(endDate);
            }
        }

        return goalDatesForMonth;
    }

    public ArrayList<String> getUpComingGoals(String dateEntered) throws SQLException {
        ArrayList<String> upcomingGoals = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate enteredDate = LocalDate.parse(dateEntered, formatter);
        ArrayList<String> completedGoalsList = getAllCompletedGoals();

        for (int i = 0; i < size; i++) {
            UserGoals currentGoal = goalArr[i];
            if (currentGoal.getEndDate().isAfter(enteredDate) && !completedGoalsList.contains(currentGoal.getSpecificGoal())) {
                String upcomingGoalsString = currentGoal.getSpecificGoal();
                upcomingGoals.add(upcomingGoalsString);
            }
        }
        return upcomingGoals;
    }

}
