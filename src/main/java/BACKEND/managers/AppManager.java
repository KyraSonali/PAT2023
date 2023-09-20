/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

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

    public static void init() throws ClassNotFoundException, SQLException {
        DB.connect();
        userManager = new UserManager();
        //calendarManger = new CalendarManager();
        goalManager = new GoalManager();

    }
}
