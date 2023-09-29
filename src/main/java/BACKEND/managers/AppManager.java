/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import BACKEND.ChatGPT;
import BACKEND.DB;
import java.sql.SQLException;

/**
 *
 * @author Kyra Balliram
 */
public class AppManager {

   // public static CalendarManager calendarManger;
    public static GoalManager goalManager;
    public static UserManager userManager;
    public static CalendarManager calendarManager;
    public static ChatGPT bot;
    public static AwarenessManager awarenessManager;
    public static DiaryManager diaryManager;
    public static HealthManager healthManager;
    
    
    public static void init() throws ClassNotFoundException, SQLException {
        DB.connect();
        userManager = new UserManager();
        calendarManager = new CalendarManager();
        goalManager = new GoalManager();
        bot = new ChatGPT();
        awarenessManager=new AwarenessManager();
        diaryManager = new DiaryManager();
        healthManager = new HealthManager();
    }
    
    //getUser
    public static UserManager getUserManager() {
        return userManager;
    }

    //get the goal manager
    public static GoalManager getGoalManager() {
        return goalManager;
    }

    public static void setGoalManager(GoalManager goalManager) {
        AppManager.goalManager = goalManager;
    }
    
    
    
    
    
   
}