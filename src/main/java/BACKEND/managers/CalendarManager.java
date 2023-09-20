/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND.managers;

import java.util.Calendar;

/**
 *
 * @author Kyrab
 */
public class CalendarManager {

    private final int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int currentMonth;
    private int currentYear;

    public CalendarManager() {
        // Initialize the currentMonth and currentYear
        Calendar cal = Calendar.getInstance();
        this.currentMonth = cal.get(Calendar.MONTH);
        this.currentYear = cal.get(Calendar.YEAR);
    }

    public String[][] getCalendarForMonth(int month, int year) {
        //  leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            numDays[1] = 29;
        } else {
            numDays[1] = 28;
        }

        Calendar cal = Calendar.getInstance();
        cal.set(year, month, 1);
        int startDay = cal.get(Calendar.DAY_OF_WEEK) - 1;

        return generateCalendar(startDay, numDays[month]);
    }

    private String[][] generateCalendar(int startDay, int numDaysInMonth) {
        String[][] calendar = new String[6][7];
        int currentDay = 1;

        // Initialize with empty strings
        for (int week = 0; week < 6; week++) {
            for (int day = 0; day < 7; day++) {
                calendar[week][day] = "";
            }
        }

        // Start filling from the given start day
        for (int week = 0; week < 6; week++) {
            for (int day = startDay; day < 7; day++) {
                if (currentDay > numDaysInMonth) {
                    break;
                }
                calendar[week][day] = Integer.toString(currentDay);
                currentDay++;
            }
            startDay = 0; // Reset start day to Sunday for next week
            if (currentDay > numDaysInMonth) {
                break;
            }
        }
        return calendar;
    }

    public String getCurrentMonthName() {
        return monthNames[currentMonth];
    }

    public String getCurrentYearString() {
        return Integer.toString(this.currentYear);
    }

    public void nextMonth() {
        this.currentMonth++;
        if (currentMonth > 11) {
            this.currentMonth = 0;
            this.currentYear++;
        }
    }

    public void previousMonth() {
        this.currentMonth--;
        if (currentMonth < 0) {
            this.currentMonth = 11;
            this.currentYear--;
        }
    }

    public String[][] getCurrentCalendar() {
        return getCalendarForMonth(currentMonth, currentYear);
    }

}
