/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BACKEND;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author Kyrab
 */
public class CalenderExample extends javax.swing.JFrame {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel tableModel;

    public CalenderExample() {
        frame = new JFrame();
        frame.setTitle("Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Assuming you have an existing table
        table = new JTable();
        tableModel = (DefaultTableModel) table.getModel();
        table.setCellSelectionEnabled(true);

        // Populate the table with the calendar data
        populateCalendar();

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void populateCalendar() {
        // Get the current year and month
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int currentMonth = currentDate.getMonthValue();

        // Get the first day of the current month
        LocalDate firstDayOfMonth = YearMonth.of(currentYear, currentMonth).atDay(1);
        DayOfWeek startDayOfWeek = firstDayOfMonth.getDayOfWeek(); // e.g., MONDAY

        // Get the number of days in the current month
        int daysInMonth = YearMonth.of(currentYear, currentMonth).lengthOfMonth();

        // Clear the table
        tableModel.setRowCount(0);
        tableModel.setColumnCount(0);

        // Set the weekday names as column headers
        for (int i = 0; i < 7; i++) {
            DayOfWeek dayOfWeek = DayOfWeek.of((i + 1) % 7 + 1); // Adjusts the weekday values to start from Monday
            String weekday = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault());
            tableModel.addColumn(weekday);
        }

        // Add the month name as a row at the top of the table
        String monthName = YearMonth.of(currentYear, currentMonth)
                .getMonth()
                .getDisplayName(TextStyle.FULL, Locale.getDefault());
        tableModel.addRow(new Object[]{monthName});

        // Add the days of the month to the table
        int day = 1;
        for (int i = 0; i < 6; i++) {
            Object[] rowData = new Object[7];
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && j < startDayOfWeek.getValue() - 1) || day > daysInMonth) {
                    rowData[j] = "";
                } else {
                    rowData[j] = day;
                    day++;
                }
            }
            tableModel.addRow(rowData);
            if (day > daysInMonth) {
                break;
            }
        }
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(CalendarExample::new);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalenderExample().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
