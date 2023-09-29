/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND.managers;

import BACKEND.DB;

import BACKEND.objects.UserHealth;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Kyra Balliram
 */
public class HealthManager {

    private UserHealth[] healthArr = new UserHealth[100];
    private int healthArrSize;

    public HealthManager() throws SQLException {

        healthArrSize = 0;
        String query = "SELECT * FROM kyrabDB.physicalHealth";
        ResultSet health = DB.query(query);
        while (health.next()) {
            int physicalHealthID = health.getInt("idphysicalHealth");
            int userID = health.getInt("idUser");
            int hydrationLvl = health.getInt("hydrationLevel");
            int amountOfSleep = health.getInt("sleepAmount");
            String physicalActivities = health.getString("physicalActivities");
            double weight = health.getDouble("weight");
            String dateString = health.getString("dateEntered");
            DateTimeFormatter m = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dateEntered = LocalDate.parse(dateString, m);

            healthArr[healthArrSize] = new UserHealth(physicalHealthID, userID, hydrationLvl, amountOfSleep, physicalActivities, weight, dateEntered);
            healthArrSize++;
        }

    }

    //adds health form to db
    public void addHealth(int inUserID, int inHydrationLevel, int inSleepAmount, String inPhysicalActivities, double inWeight, LocalDate dateEntered) throws SQLException {
        String updateQuery = "INSERT INTO kyrabDB.physicalHealth ( idUser,hydrationLevel, sleepAmount, physicalActivities, weight, dateEntered) \n"
                + "VALUES ('" + inUserID + "','" + inHydrationLevel + "','" + inSleepAmount + "','" + inPhysicalActivities + "','" + inWeight + "','" + dateEntered + "');";
        System.out.println(updateQuery);
        DB.update(updateQuery);
        String getIdquery = "SELECT idphysicalHealth\n" + "FROM kyrabDB.physicalHealth\n" + "WHERE idUser=" + inUserID + ";";
        ResultSet IDquery = DB.query(getIdquery);
        IDquery.next();
        int idPhysicalHealth = IDquery.getInt(1);
        healthArr[healthArrSize] = new UserHealth(idPhysicalHealth, inUserID, inHydrationLevel, inSleepAmount, inPhysicalActivities, inWeight, dateEntered);
        healthArrSize++;

    }

    public String getPhysicalActivities(int userID, String entryDate) throws SQLException {
        String query = "SELECT physicalActivities\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser =" + userID + "\n"
                + "AND dateEntered = '" + entryDate + "'" + ";";
        ResultSet physicalActivities = DB.query(query);
        physicalActivities.next();
        String activitiesList = physicalActivities.getString("physicalActivities");
        return activitiesList;

    }

    public int getSleepAmount(int userID, String entryDate) throws SQLException {
        String query = "SELECT sleepAmount\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser =" + userID + "\n"
                + "AND dateEntered = '" + entryDate + "'" + ";";

        ResultSet sleepAmount = DB.query(query);
        int sleepValue = 0;
        while (sleepAmount.next()) {
            sleepValue = sleepAmount.getInt("sleepAmount");
        }
        
        return sleepValue;

    }

    //getHydration
    public int getHydration(int userID, String entryDate) throws SQLException {
        String query = "SELECT hydrationLevel\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser =" + userID + "\n"
                + "AND dateEntered = '" + entryDate + "'" + ";";

        ResultSet hydrationLevel = DB.query(query);
        int hydrationLvl = 0;
        while (hydrationLevel.next()) {
            hydrationLvl = hydrationLevel.getInt("hydrationLevel");
        }
        return hydrationLvl;
    }

    //getWeight
    public double getWeight(int userID, String entryDate) throws SQLException {
        String query = "SELECT weight\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser =" + userID + "\n"
                + "AND dateEntered = '" + entryDate + "'" + ";";

        ResultSet weight = DB.query(query);
        double weightValue = 0;
        while (weight.next()) {
            weightValue = weight.getDouble("weight");
        }
        return weightValue;
    }

    public void generateWeightOverTime(int userID, int inMonth) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //line graphs
        String weight = "weight";
        String query = "SELECT dateEntered, weight\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser= '" + userID + "'\n"
                + "AND MONTH(dateEntered) = '" + inMonth + "'\n"; // Changed 'like' to '='
        try {
            ResultSet data = DB.query(query);
            while (data.next()) {
                //get values
                LocalDate date = data.getDate("dateEntered").toLocalDate();
                double getWeight = data.getDouble("weight");

                //add in loop
                dataset.addValue(getWeight, weight, date.toString());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in loading graph");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex); // Changed 'UserManager' to 'HealthManager'
        }
        //build chart
        JFreeChart chart = ChartFactory.createLineChart("Weight vs Time ", "Date", "weight", dataset, PlotOrientation.VERTICAL, true, true, true);
        ChartFrame frm = new ChartFrame("Pattern", chart);
        frm.setVisible(true);
        frm.setSize(600, 600);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void generateActivitiesOverTime(int userID, int inMonth) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        String activitiesLabel = "Physical Activities";

        String query = "SELECT dateEntered, COUNT(physicalActivities) as activityCount\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser= '" + userID + "'\n"
                + "AND MONTH(dateEntered) = '" + inMonth + "'\n"
                + "GROUP BY dateEntered\n"
                + "ORDER BY dateEntered;";

        try {
            ResultSet data = DB.query(query);
            while (data.next()) {
                LocalDate date = data.getDate("dateEntered").toLocalDate();
                int activityCount = data.getInt("activityCount");
                dataset.addValue((double) activityCount, activitiesLabel, date.toString());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in loading graph");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        JFreeChart chart = ChartFactory.createLineChart(
                "Number of Physical Activities Over Time",
                "Date",
                "Number of Activities",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, true);

        // Configure the y-axis to use integers and set the range from 0 to 20
        CategoryPlot plot = chart.getCategoryPlot();
        NumberAxis yAxis = (NumberAxis) plot.getRangeAxis();
        yAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        yAxis.setRange(0, 20);

        ChartFrame frm = new ChartFrame("Physical Activities Over Time", chart);
        frm.setVisible(true);
        frm.setSize(600, 600);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void generateMoodVsSleepGraph(int userID, int inMonth) {
        XYSeries series = new XYSeries("Mood vs Sleep");

        String query = "SELECT diary.moodRating, physicalHealth.sleepAmount "
                + "FROM kyrabDB.diary "
                + "JOIN kyrabDB.physicalHealth ON diary.idUser = physicalHealth.idUser "
                + "WHERE diary.idUser = " + userID + " "
                + "AND MONTH(diary.entryDate) = '" + inMonth + "' "
                + "AND MONTH(physicalHealth.dateEntered) = '" + inMonth + "'";

        try {
            ResultSet data = DB.query(query);
            while (data.next()) {
                int moodRating = data.getInt("moodRating");
                int amountOfSleep = data.getInt("sleepAmount");
                series.add(amountOfSleep, moodRating);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in loading graph");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        XYSeriesCollection dataset = new XYSeriesCollection(series);
        JFreeChart chart = ChartFactory.createScatterPlot(
                "Mood vs Sleep",
                "Amount of Sleep",
                "Mood Rating",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void generateWaterOverTime(int userID, int inMonth) {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        String waterLevel = "water level(mm)";
        String query = "SELECT dateEntered, hydrationLevel\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser= '" + userID + "'\n"
                + "AND MONTH(dateEntered) = '" + inMonth + "'\n";
        try {
            ResultSet data = DB.query(query);
            while (data.next()) {

                LocalDate date = data.getDate("dateEntered").toLocalDate();
                int getHydrationLvl = data.getInt("hydrationLevel");
                dataset.addValue(getHydrationLvl, waterLevel, date.toString());

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in loading graph");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        //build chart
        JFreeChart chart = ChartFactory.createLineChart("Hydration vs Time ", "Date", "hydration", dataset, PlotOrientation.VERTICAL, true, true, true);
        ChartFrame frm = new ChartFrame("Pattern", chart);
        frm.setVisible(true);
        frm.setSize(600, 600);
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public String calculateAverages(int userID, int inMonth) {
        StringBuilder result = new StringBuilder();

        String query = "SELECT AVG(sleepAmount) as avgSleep, AVG(hydrationLevel) as avgHydration, "
                + "AVG(physicalActivities) as avgPhysicalActivity, AVG(weight) as avgWeight "
                + "FROM kyrabDB.physicalHealth "
                + "WHERE idUser = " + userID
                + " AND MONTH(dateEntered) = " + inMonth;

        try {
            ResultSet data = DB.query(query);
            while (data.next()) {
                int avgSleep = data.getInt("avgSleep");
                int avgHydration = data.getInt("avgHydration");

                int avgWeight = data.getInt("avgWeight");

                result.append("Average Sleep: ").append(avgSleep).append("\n");
                result.append("Average Hydration: ").append(avgHydration).append("\n");

                result.append("Average Weight: ").append(avgWeight).append("\n");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in calculating averages");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        String queryMood = "SELECT AVG(moodRating) as avgMoodRating "
                + "FROM kyrabDB.diary "
                + "WHERE idUser = " + userID
                + " AND MONTH(entryDate) = " + inMonth;

        try {
            ResultSet data = DB.query(queryMood);
            while (data.next()) {
                int avgMoodRating = data.getInt("avgMoodRating");
                result.append("Average Mood Rating: ").append(avgMoodRating).append("\n");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in calculating average mood rating");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return result.toString();
    }

    public double calculate7DayAverage(int userId, String columnName) {
        double average = 0.0;

        LocalDate sevenDaysAgo = LocalDate.now().minusDays(7);
        String query = "SELECT " + columnName + "\n"
                + "FROM kyrabDB.physicalHealth\n"
                + "WHERE idUser = " + userId + "\n"
                + "AND dateEntered >= '" + sevenDaysAgo + "'";
        try {
            ResultSet data = DB.query(query);
            double sum = 0.0;
            int count = 0;
            while (data.next()) {
                sum += data.getDouble(columnName);
                count++;
            }

            if (count > 0) {
                average = sum / count;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in calculating average");
            Logger.getLogger(HealthManager.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return average;
    }

}
