/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BACKEND;

/**
 *
 * @author Kyrab
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarExample {

    private DefaultTableModel tableModel;
    private JTable table;

    public CalendarExample() {
          initComponents();
        setTitle("Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create table model with 7 columns (representing the days of the week) and 6 rows (representing the weeks)
        tableModel = new DefaultTableModel(new Object[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}, 6);
        table = new JTable(tableModel);
        table.setCellSelectionEnabled(true);

        // Populate the table with the calendar data
        populateCalendar();

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    private void populateCalendar() {
        // Get the current year and month
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        // Get the first day of the current month
        LocalDate firstDayOfMonth = YearMonth.of(currentYear, currentMonth).atDay(1);
        int startDay = firstDayOfMonth.getDayOfWeek().getValue(); // 1 = Monday, 7 = Sunday

        // Get the number of days in the current month
        int daysInMonth = YearMonth.of(currentYear, currentMonth).lengthOfMonth();

        // Clear the table
        tableModel.setRowCount(0);

        // Add empty cells for the days before the start of the month
        int row = 0;
        int column = startDay - 1;
        for (int day = 1; day < startDay; day++) {
            tableModel.setValueAt("", row, column);
            column--;
            if (column < 0) {
                column = 6;
                row++;
            }
        }

        // Add the days of the month to the table
        int day = 1;
        while (day <= daysInMonth) {
            tableModel.setValueAt(day, row, column);
            day++;
            column++;
            if (column > 6) {
                column = 0;
                row++;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalendarExample::new);
    }

    private void add(JScrollPane scrollPane, String CENTER) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTitle(String calendar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLayout(BorderLayout borderLayout) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    
    

    
}


