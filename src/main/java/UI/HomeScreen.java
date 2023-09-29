/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import BACKEND.managers.AppManager;
import java.util.Calendar;
import java.awt.Frame;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyrab
 */
public class HomeScreen extends javax.swing.JFrame {

    String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static int currentMonth;

    public static int currentGoalID;
    public static String diaryDateSelected;

    public int getRow(LocalDate date) {
        LocalDate firstDayOfMonth = LocalDate.of(date.getYear(), date.getMonth(), 1);
        int firstDayOfMonthWeekday = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        int dayOfMonth = date.getDayOfMonth();
        int position = firstDayOfMonthWeekday + dayOfMonth - 1;
        return position / 7;

    }

    public static int getColumn(LocalDate date) {

        LocalDate firstDayOfMonth = LocalDate.of(date.getYear(), date.getMonth(), 1);
        int firstDayOfMonthWeekday = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        int dayOfMonth = date.getDayOfMonth();
        int position = firstDayOfMonthWeekday + dayOfMonth - 1;
        return position % 7;
    }
    

    public HomeScreen() throws SQLException {
        initComponents();
        //set calendar
        // Get current month and year
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        int currentYear = cal.get(Calendar.YEAR);

        // Get calendar data for the current month
        String[][] calendarData = AppManager.calendarManager.getCalendarForMonth(currentMonth, currentYear);

        // Create and set the table model
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);

        //setCellColour(currentMonth, currentYear);
        //set month
        currentMonthLbl.setText(AppManager.calendarManager.getCurrentMonthName());
        currentYearLbl.setText(AppManager.calendarManager.getCurrentYearString());

        ArrayList<String> completedGoals = AppManager.goalManager.getAllCompletedGoals();
        completedGoalsList.setEnabled(false);
        DefaultListModel b = new DefaultListModel();
        b.addAll(completedGoals);
        completedGoalsList.setModel(b);

        ArrayList<String> goalsInProgress = AppManager.goalManager.getAllcurrentGoals();
        DefaultListModel a = new DefaultListModel();
        a.addAll(goalsInProgress);
        currentGoalsList.setModel(a);

        //account section: avg month stats
        String avgs = AppManager.healthManager.calculateAverages(AppManager.userManager.getCurrentUserID(), 9);
        avergaesTxtArea.setText(avgs);

        //user details
        String userDetails = AppManager.userManager.getUserDetails(AppManager.userManager.getCurrentUserID());
        userDetailsTxt.setText(userDetails);

        //home screen -awareness list
        ArrayList<String> awarenessTopics = new ArrayList<>();
        awarenessTopics.add("Stress and how you can manage it");
        awarenessTopics.add("what is imposter syndrome");
        awarenessTopics.add("types of anxiety disorders");
        awarenessTopics.add("what is fear and where does is start");
        awarenessTopics.add("what is love");
        awarenessTopics.add("what is laziness");

        DefaultListModel x = new DefaultListModel();
        x.addAll(awarenessTopics);
        awarenessTopicList.setModel(x);

        //hydrationLvlBar
        int hydrationAvg = (int) (AppManager.healthManager.calculate7DayAverage(AppManager.userManager.getCurrentUserID(), "hydrationLevel"));
        hydrationLvlBar.setMinimum(0);
        hydrationLvlBar.setMaximum(2000);
        hydrationLvlBar.setValue(hydrationAvg);
        hydrationLvlBar.setStringPainted(true);

        //upcoming goals
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        ArrayList<String> upcomingGoals = AppManager.goalManager.getUpComingGoals(formattedDate);
        DefaultListModel c = new DefaultListModel();
        c.addAll(upcomingGoals);
        upcomingGoalsList.setModel(c);

        //last 7 days
        StringBuilder last7daysStats = new StringBuilder();
        double sleepAvg = AppManager.healthManager.calculate7DayAverage(AppManager.userManager.getCurrentUserID(), "sleepAmount");
        double weightAvg = AppManager.healthManager.calculate7DayAverage(AppManager.userManager.getCurrentUserID(), "weight");
        last7daysStats.append("Average Sleep Amount over the last 7 days: ").append(sleepAvg).append(" hours\n");
        last7daysStats.append("Average Weight over the last 7 days: ").append(weightAvg).append(" kg\n");

        String statsString = last7daysStats.toString();
        last7DaysStatsTxt.setText(statsString);

        //set name
        String name = AppManager.userManager.getFullName(AppManager.userManager.getCurrentUserID());
        nameOfUser.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parentPanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        userImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        last7DaysStatsTxt = new javax.swing.JTextArea();
        stressLevelsLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nameOfUser = new javax.swing.JLabel();
        addActivityLbl = new javax.swing.JLabel();
        addHydrationLevelLbl = new javax.swing.JLabel();
        addDiaryEntry = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        goalsLbl = new javax.swing.JLabel();
        goalsLbl1 = new javax.swing.JLabel();
        hydrationLvlBar = new javax.swing.JProgressBar();
        addSleepLbl1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        awarenessTopicList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        upcomingGoalsList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        diaryEntry = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        moodFeelingComboBox = new javax.swing.JComboBox<>();
        diaryHealingTxt = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        diaryContentTxt = new javax.swing.JTextArea();
        submitBttn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        diaryEntryChooser = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        moodRatingSpinner = new javax.swing.JSpinner();
        currentGoalsHeadingLbl2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        calendar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        currentYearLbl = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CalendarTable = new javax.swing.JTable();
        currentMonthLbl = new javax.swing.JLabel();
        previousMonthLbl = new javax.swing.JLabel();
        nextMonthlbl = new javax.swing.JLabel();
        account = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        avergaesTxtArea = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        userDetailsTxt = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        helpLbl2 = new javax.swing.JLabel();
        goals = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        currentGoalsList = new javax.swing.JList<>();
        helpLbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        currentGoalsHeadingLbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        iconLbl1 = new javax.swing.JLabel();
        durationOfGoalLbl = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        iconLbl3 = new javax.swing.JLabel();
        addGoalPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        addNewGoalLbl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        completedGoalsList = new javax.swing.JList<>();
        jPanel12 = new javax.swing.JPanel();
        iconLbl4 = new javax.swing.JLabel();
        percentageOfCompletionLbl1 = new javax.swing.JLabel();
        awareness = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        website5Bttn = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        website6Bttn = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        website2Bttn = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        website3Bttn = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        helpLbl1 = new javax.swing.JLabel();
        currentGoalsHeadingLbl3 = new javax.swing.JLabel();
        website4Bttn = new javax.swing.JButton();
        website1Bttn = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        P2 = new javax.swing.JPanel();
        goalPanel = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        calendarPanel = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        awarenessPanel = new javax.swing.JLabel();
        P5 = new javax.swing.JPanel();
        diaryEntryPanel = new javax.swing.JLabel();
        P6 = new javax.swing.JPanel();
        accountPanel = new javax.swing.JLabel();
        P1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        parentPanel.setBackground(new java.awt.Color(44, 42, 74));
        parentPanel.setLayout(new java.awt.CardLayout());

        dashboard.setBackground(new java.awt.Color(78, 81, 140));
        dashboard.setMinimumSize(new java.awt.Dimension(514, 550));
        dashboard.setPreferredSize(new java.awt.Dimension(514, 550));
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chakras (1).png"))); // NOI18N
        userImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        dashboard.add(userImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 80, 80));

        last7DaysStatsTxt.setEditable(false);
        last7DaysStatsTxt.setBackground(new java.awt.Color(44, 42, 74));
        last7DaysStatsTxt.setColumns(20);
        last7DaysStatsTxt.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        last7DaysStatsTxt.setForeground(new java.awt.Color(255, 255, 255));
        last7DaysStatsTxt.setRows(5);
        last7DaysStatsTxt.setText("\n");
        last7DaysStatsTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane1.setViewportView(last7DaysStatsTxt);

        dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 110));

        stressLevelsLbl.setBackground(new java.awt.Color(255, 255, 255));
        stressLevelsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        stressLevelsLbl.setForeground(new java.awt.Color(181, 229, 237));
        stressLevelsLbl.setText("Learn something new:");
        stressLevelsLbl.setToolTipText("");
        dashboard.add(stressLevelsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 130, 20));
        dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        nameOfUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        nameOfUser.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.add(nameOfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 20));

        addActivityLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addActivityLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addActivityLblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addActivityLblMousePressed(evt);
            }
        });
        dashboard.add(addActivityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 70));

        addHydrationLevelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addHydrationLevelLbl.setText("add act");
        addHydrationLevelLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addHydrationLevelLblMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addHydrationLevelLblMousePressed(evt);
            }
        });
        dashboard.add(addHydrationLevelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 70));

        addDiaryEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addDiaryEntry.setText("add act");
        addDiaryEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDiaryEntryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addDiaryEntryMousePressed(evt);
            }
        });
        dashboard.add(addDiaryEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 60, 70));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(181, 229, 237));
        jLabel11.setText("add activity");
        dashboard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(181, 229, 237));
        jLabel12.setText("add hydration level");
        dashboard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(181, 229, 237));
        jLabel13.setText("add diary entry");
        dashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 100, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(181, 229, 237));
        jLabel14.setText("Last 7 days:");
        jLabel14.setToolTipText("");
        dashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 112, 30));

        goalsLbl.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl.setForeground(new java.awt.Color(181, 229, 237));
        goalsLbl.setText("Hydration over the last 7 days:");
        goalsLbl.setToolTipText("");
        dashboard.add(goalsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 210, 20));

        goalsLbl1.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl1.setForeground(new java.awt.Color(181, 229, 237));
        goalsLbl1.setText("Upcoming goals");
        goalsLbl1.setToolTipText("");
        dashboard.add(goalsLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, 20));
        dashboard.add(hydrationLvlBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        addSleepLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addSleepLbl1.setText("add act");
        addSleepLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSleepLbl1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addSleepLbl1MousePressed(evt);
            }
        });
        dashboard.add(addSleepLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 70));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(181, 229, 237));
        jLabel22.setText("add amount of sleep");
        dashboard.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 130, -1));

        awarenessTopicList.setBackground(new java.awt.Color(44, 42, 74));
        awarenessTopicList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        awarenessTopicList.setForeground(new java.awt.Color(255, 255, 255));
        awarenessTopicList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        awarenessTopicList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                awarenessTopicListMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(awarenessTopicList);

        dashboard.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 200, 220));

        upcomingGoalsList.setBackground(new java.awt.Color(153, 153, 255));
        upcomingGoalsList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(44, 42, 74)));
        upcomingGoalsList.setForeground(new java.awt.Color(44, 42, 74));
        upcomingGoalsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        upcomingGoalsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upcomingGoalsListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upcomingGoalsListMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(upcomingGoalsList);

        dashboard.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 110));

        jLabel2.setText("Help");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        dashboard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        parentPanel.add(dashboard, "card2");

        diaryEntry.setBackground(new java.awt.Color(78, 81, 140));
        diaryEntry.setMinimumSize(new java.awt.Dimension(514, 550));
        diaryEntry.setPreferredSize(new java.awt.Dimension(514, 550));
        diaryEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(44, 42, 74));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moodFeelingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "sad", "anxious", "stressed", "neutral", "excited", "happy", "angry" }));
        moodFeelingComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(moodFeelingComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 240, 37));

        diaryHealingTxt.setText("<heading>");
        diaryHealingTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(diaryHealingTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 390, 42));

        diaryContentTxt.setColumns(20);
        diaryContentTxt.setRows(5);
        diaryContentTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 222, 255)));
        jScrollPane5.setViewportView(diaryContentTxt);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, 220));

        submitBttn.setText("Submit");
        submitBttn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(218, 191, 255)));
        submitBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBttnActionPerformed(evt);
            }
        });
        jPanel8.add(submitBttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 120, -1));

        jLabel24.setBackground(new java.awt.Color(7, 222, 255));
        jLabel24.setForeground(new java.awt.Color(218, 191, 255));
        jLabel24.setText("How do you feel:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 20));

        jLabel25.setForeground(new java.awt.Color(218, 191, 255));
        jLabel25.setText("Date of Entry:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 40));
        jPanel8.add(diaryEntryChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 40));

        jLabel26.setForeground(new java.awt.Color(218, 191, 255));
        jLabel26.setText("Mood:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        moodRatingSpinner.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        moodRatingSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                moodRatingSpinnerStateChanged(evt);
            }
        });
        jPanel8.add(moodRatingSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 40));

        diaryEntry.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 460, 500));

        currentGoalsHeadingLbl2.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl2.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl2.setText("Capture A Thought:");
        diaryEntry.add(currentGoalsHeadingLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Help");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        diaryEntry.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        parentPanel.add(diaryEntry, "card5");

        calendar.setBackground(new java.awt.Color(78, 81, 140));
        calendar.setMinimumSize(new java.awt.Dimension(514, 550));
        calendar.setPreferredSize(new java.awt.Dimension(514, 550));
        calendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Help");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        calendar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jPanel7.setBackground(new java.awt.Color(44, 42, 74));

        currentYearLbl.setBackground(new java.awt.Color(102, 255, 255));
        currentYearLbl.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentYearLbl.setForeground(new java.awt.Color(153, 255, 255));
        currentYearLbl.setText("My Year");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(currentYearLbl)
                .addGap(222, 222, 222))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentYearLbl)
                .addContainerGap())
        );

        calendar.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        CalendarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        CalendarTable.setRowSelectionAllowed(false);
        CalendarTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        CalendarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CalendarTableMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(CalendarTable);

        calendar.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        currentMonthLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        currentMonthLbl.setForeground(new java.awt.Color(153, 255, 255));
        currentMonthLbl.setText("<month>");
        calendar.add(currentMonthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 80, 20));

        previousMonthLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/angle-left (2).png"))); // NOI18N
        previousMonthLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMonthLblMouseClicked(evt);
            }
        });
        calendar.add(previousMonthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 40, 40));

        nextMonthlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/angle-right (2).png"))); // NOI18N
        nextMonthlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMonthlblMouseClicked(evt);
            }
        });
        calendar.add(nextMonthlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 40));

        parentPanel.add(calendar, "card4");

        account.setBackground(new java.awt.Color(44, 42, 74));
        account.setMinimumSize(new java.awt.Dimension(514, 550));
        account.setPreferredSize(new java.awt.Dimension(514, 550));
        account.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(153, 153, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chakras (1).png"))); // NOI18N
        jPanel17.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 90));

        avergaesTxtArea.setEditable(false);
        avergaesTxtArea.setColumns(20);
        avergaesTxtArea.setRows(5);
        avergaesTxtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane7.setViewportView(avergaesTxtArea);

        jPanel17.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 160));

        jButton2.setBackground(new java.awt.Color(44, 42, 74));
        jButton2.setForeground(new java.awt.Color(153, 153, 255));
        jButton2.setText("Sleep vs Mood patterns");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, 40));

        jButton3.setBackground(new java.awt.Color(44, 42, 74));
        jButton3.setForeground(new java.awt.Color(153, 153, 255));
        jButton3.setText("How active are you this month");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 190, 40));

        jButton4.setBackground(new java.awt.Color(44, 42, 74));
        jButton4.setForeground(new java.awt.Color(153, 153, 255));
        jButton4.setText("mood vs Time patterns");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 180, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mental-health (1).png"))); // NOI18N
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 190, 160));

        userDetailsTxt.setEditable(false);
        userDetailsTxt.setColumns(20);
        userDetailsTxt.setRows(5);
        userDetailsTxt.setText("\n");
        userDetailsTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane8.setViewportView(userDetailsTxt);

        jPanel17.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 90));

        jButton12.setBackground(new java.awt.Color(44, 42, 74));
        jButton12.setForeground(new java.awt.Color(153, 153, 255));
        jButton12.setText("Water intake history");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel17.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 190, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(44, 42, 74));
        jLabel10.setText("Account Details:");
        jPanel17.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 150, 20));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(44, 42, 74));
        jLabel18.setText("Averages for this month:");
        jPanel17.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 150, -1));

        account.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 490));

        helpLbl2.setForeground(new java.awt.Color(255, 255, 255));
        helpLbl2.setText("Help");
        helpLbl2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        helpLbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpLbl2MousePressed(evt);
            }
        });
        account.add(helpLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        parentPanel.add(account, "card7");

        goals.setBackground(new java.awt.Color(78, 81, 140));
        goals.setPreferredSize(new java.awt.Dimension(514, 550));
        goals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currentGoalsList.setBackground(new java.awt.Color(44, 42, 74));
        currentGoalsList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        currentGoalsList.setForeground(new java.awt.Color(255, 255, 255));
        currentGoalsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        currentGoalsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                currentGoalsListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(currentGoalsList);

        goals.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 200));

        helpLbl.setForeground(new java.awt.Color(255, 255, 255));
        helpLbl.setText("Help");
        helpLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        helpLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpLblMousePressed(evt);
            }
        });
        goals.add(helpLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jPanel4.setBackground(new java.awt.Color(44, 42, 74));

        currentGoalsHeadingLbl.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl.setText("Goals");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(currentGoalsHeadingLbl)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentGoalsHeadingLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        goals.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setForeground(new java.awt.Color(44, 42, 74));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hourglass (1) (1).png"))); // NOI18N
        iconLbl1.setText("jLabel15");
        jPanel5.add(iconLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        durationOfGoalLbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        durationOfGoalLbl.setForeground(new java.awt.Color(44, 42, 74));
        jPanel5.add(durationOfGoalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 30));

        goals.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 60));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(44, 42, 74));
        jLabel15.setText("STEPS");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 20));

        iconLbl3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\src\\main\\resources\\images\\success (1).png")); // NOI18N
        iconLbl3.setText("jLabel15");
        iconLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLbl3MouseClicked(evt);
            }
        });
        jPanel6.add(iconLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        goals.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 200, 50));

        addGoalPanel.setBackground(new java.awt.Color(153, 153, 255));
        addGoalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("jLabel7");
        addGoalPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 120, 30));

        jLabel21.setBackground(new java.awt.Color(44, 42, 74));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(44, 42, 74));
        jLabel21.setText("ADD NEW GOAL");
        addGoalPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 30));

        addNewGoalLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add (1) (1).png"))); // NOI18N
        addNewGoalLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNewGoalLblMouseClicked(evt);
            }
        });
        addGoalPanel.add(addNewGoalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        goals.add(addGoalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(218, 191, 255));
        jLabel17.setText("Current Goals:");
        goals.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(218, 191, 255));
        jLabel19.setText("Goals Completed:");
        goals.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/goal (1).png"))); // NOI18N
        goals.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 180, 200));

        completedGoalsList.setBackground(new java.awt.Color(44, 42, 74));
        completedGoalsList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        completedGoalsList.setForeground(new java.awt.Color(255, 255, 255));
        completedGoalsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(completedGoalsList);

        goals.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, 200));

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/percentage (1) (1).png"))); // NOI18N
        iconLbl4.setText("jLabel15");
        jPanel12.add(iconLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        percentageOfCompletionLbl1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        percentageOfCompletionLbl1.setForeground(new java.awt.Color(44, 42, 74));
        jPanel12.add(percentageOfCompletionLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, 30));

        goals.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 50));

        parentPanel.add(goals, "card7");

        awareness.setBackground(new java.awt.Color(78, 81, 140));
        awareness.setMinimumSize(new java.awt.Dimension(514, 550));
        awareness.setPreferredSize(new java.awt.Dimension(514, 550));
        awareness.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kyra Balliram\\OneDrive\\Documents\\NetBeansProjects\\PAT2023\\src\\main\\resources\\images\\eye (1) (1).png")); // NOI18N
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel37.setText("Imposter ");
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 60, 30));

        jLabel38.setText("Syndrome ");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 20));

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea6.setColumns(20);
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setRows(5);
        jTextArea6.setText("This syndrome occurs in 70%\nof individuals. Learn about the\ncauses,affects and resolutions");
        jScrollPane4.setViewportView(jTextArea6);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 60));

        awareness.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 130));

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paranoia (1).png"))); // NOI18N
        jLabel34.setText("jLabel30");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel39.setText("Stress");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 60, 42));

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea7.setColumns(20);
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setRows(5);
        jTextArea7.setText("Stress is our body's natural \nresponse to a perceived \nthreat. Learn how to understand\nand manage your stress.\n");
        jScrollPane10.setViewportView(jTextArea7);

        jPanel10.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 70));

        awareness.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 150, 130));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fear (1).png"))); // NOI18N
        jLabel33.setText("jLabel30");
        jPanel13.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 67, 75));

        jLabel40.setText("Fear  Begins");
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 80, 27));

        website5Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website5Bttn.setText("view");
        website5Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website5BttnActionPerformed(evt);
            }
        });
        jPanel13.add(website5Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, -1));

        jTextArea10.setEditable(false);
        jTextArea10.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea10.setColumns(20);
        jTextArea10.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea10.setRows(5);
        jTextArea10.setText("This article highlights why we\nfeel fear, the symptoms,\ncauses and treatments of the \nemotion that influences greatly");
        jScrollPane13.setViewportView(jTextArea10);

        jPanel13.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, -1));

        awareness.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, 160));

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/depression (1).png"))); // NOI18N
        jLabel35.setText("jLabel30");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        website6Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website6Bttn.setText("view");
        website6Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website6BttnActionPerformed(evt);
            }
        });
        jPanel14.add(website6Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, -1));

        jLabel42.setText("Laziness");
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 20));

        jTextArea11.setEditable(false);
        jTextArea11.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea11.setColumns(20);
        jTextArea11.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea11.setRows(5);
        jTextArea11.setText("Find out what being 'lazy'\nactually is. This article highlights\nthe causes and remediations.");
        jScrollPane14.setViewportView(jTextArea11);

        jPanel14.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 50));

        awareness.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 150, -1));

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        website2Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website2Bttn.setText("view");
        website2Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website2BttnActionPerformed(evt);
            }
        });
        jPanel15.add(website2Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/web (1) (1).png"))); // NOI18N
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        jLabel43.setText("Anxiety");
        jPanel15.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 50, 20));

        jLabel44.setText("Disorders");
        jPanel15.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 50, -1));

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea8.setColumns(20);
        jTextArea8.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea8.setRows(5);
        jTextArea8.setText("Chronic anxiety is common\nand can sometimes develop\ninto a disorder. Find out the \nthe signs of this.");
        jScrollPane11.setViewportView(jTextArea8);

        jPanel15.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 150, 70));

        awareness.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 150, 160));

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/love (2).png"))); // NOI18N
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 71));

        website3Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website3Bttn.setText("view");
        website3Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website3BttnActionPerformed(evt);
            }
        });
        jPanel16.add(website3Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, -1));

        jLabel41.setText("What is love");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 20));

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea9.setColumns(20);
        jTextArea9.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea9.setRows(5);
        jTextArea9.setText("Learn how to acknowledge \nyour love for someone and \nmanage realtionnships with\nvarious people you love.");
        jScrollPane12.setViewportView(jTextArea9);

        jPanel16.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 70));

        awareness.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 140));

        jPanel11.setBackground(new java.awt.Color(44, 42, 74));

        helpLbl1.setForeground(new java.awt.Color(255, 255, 255));
        helpLbl1.setText("Help");
        helpLbl1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(181, 229, 237)));
        helpLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpLbl1MousePressed(evt);
            }
        });

        currentGoalsHeadingLbl3.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl3.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl3.setText("Learn Something New");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(currentGoalsHeadingLbl3)
                .addGap(170, 170, 170))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentGoalsHeadingLbl3)
                    .addComponent(helpLbl1))
                .addContainerGap())
        );

        awareness.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        website4Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website4Bttn.setText("view");
        website4Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website4BttnActionPerformed(evt);
            }
        });
        awareness.add(website4Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, -1));

        website1Bttn.setBackground(new java.awt.Color(44, 42, 74));
        website1Bttn.setText("view");
        website1Bttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                website1BttnActionPerformed(evt);
            }
        });
        awareness.add(website1Bttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, -1));

        jButton8.setText("jButton5");
        awareness.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, -1));

        parentPanel.add(awareness, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(44, 42, 74));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P2.setBackground(new java.awt.Color(218, 191, 255));
        P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2MouseClicked(evt);
            }
        });

        goalPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tree-of-life (1).png"))); // NOI18N
        goalPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goalPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goalPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addComponent(goalPanel)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(goalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 80, 80));

        P3.setBackground(new java.awt.Color(218, 191, 255));
        P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3MouseClicked(evt);
            }
        });

        calendarPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/international-day-of-yoga (1).png"))); // NOI18N
        calendarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                calendarPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, 80, 80));

        P4.setBackground(new java.awt.Color(218, 191, 255));
        P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4MouseClicked(evt);
            }
        });

        awarenessPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/website (1).png"))); // NOI18N
        awarenessPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                awarenessPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addComponent(awarenessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(awarenessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, 80, 80));

        P5.setBackground(new java.awt.Color(218, 191, 255));
        P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5MouseClicked(evt);
            }
        });

        diaryEntryPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book (1).png"))); // NOI18N
        diaryEntryPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                diaryEntryPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(diaryEntryPanel))
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(diaryEntryPanel))
        );

        jPanel2.add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 80));

        P6.setBackground(new java.awt.Color(218, 191, 255));
        P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6MouseClicked(evt);
            }
        });

        accountPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone (1).png"))); // NOI18N
        accountPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                accountPanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P6Layout.createSequentialGroup()
                .addComponent(accountPanel)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel2.add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, 80));

        P1.setBackground(new java.awt.Color(218, 191, 255));
        P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meditation (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 515, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 117, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void P2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MouseClicked

    }//GEN-LAST:event_P2MouseClicked

    private void P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3MouseClicked


    }//GEN-LAST:event_P3MouseClicked

    private void P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MouseClicked

    }//GEN-LAST:event_P1MouseClicked

    private void P4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4MouseClicked


    }//GEN-LAST:event_P4MouseClicked

    private void P5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5MouseClicked

    }//GEN-LAST:event_P5MouseClicked

    private void P6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6MouseClicked

    }//GEN-LAST:event_P6MouseClicked

    private void CalendarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarTableMouseClicked


    }//GEN-LAST:event_CalendarTableMouseClicked

    private void addHydrationLevelLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHydrationLevelLblMouseClicked
        dispose();
        new healthForms().setVisible(true);
    }//GEN-LAST:event_addHydrationLevelLblMouseClicked

    private void nextMonthlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMonthlblMouseClicked

        AppManager.calendarManager.nextMonth();
        String[][] calendarData = AppManager.calendarManager.getCurrentCalendar();
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);
        currentMonthLbl.setText(AppManager.calendarManager.getCurrentMonthName());
        currentYearLbl.setText(AppManager.calendarManager.getCurrentYearString());
    }//GEN-LAST:event_nextMonthlblMouseClicked

    private void previousMonthLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMonthLblMouseClicked
        AppManager.calendarManager.previousMonth();
        String[][] calendarData = AppManager.calendarManager.getCurrentCalendar();
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);
        currentMonthLbl.setText(AppManager.calendarManager.getCurrentMonthName());
        currentYearLbl.setText(AppManager.calendarManager.getCurrentYearString());
    }//GEN-LAST:event_previousMonthLblMouseClicked

    private void addActivityLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addActivityLblMouseClicked

    }//GEN-LAST:event_addActivityLblMouseClicked

    private void addDiaryEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDiaryEntryMouseClicked

    }//GEN-LAST:event_addDiaryEntryMouseClicked

    private void iconLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLbl3MouseClicked
        try {
            dispose();
            new GoalProgress().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iconLbl3MouseClicked

    private void currentGoalsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_currentGoalsListMouseClicked
        try {
            String currentGoal = currentGoalsList.getSelectedValue();
            int currentUserID = AppManager.userManager.getCurrentUserID();
            currentGoalID = AppManager.goalManager.getSelectedGoalID(currentGoal, currentUserID);

            try {
                durationOfGoalLbl.setText(AppManager.goalManager.getDurationOfGoal(currentUserID, currentGoal));
                double percentage = AppManager.goalManager.calculateCompletionPercentage(currentGoalID);
                String percentageStr = String.format("%.2f", percentage);
                percentageOfCompletionLbl1.setText(percentageStr + "%"); // Outputs: 123.456000
            } catch (SQLException ex) {
                Logger.getLogger(HomeScreen.class
                        .getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_currentGoalsListMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked


    }//GEN-LAST:event_jPanel6MouseClicked

    private void website5BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website5BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.verywellmind.com/the-psychology-of-fear-2671696");
    }//GEN-LAST:event_website5BttnActionPerformed

    private void website1BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website1BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.verywellmind.com/imposter-syndrome-and-social-anxiety-disorder-4156469");

    }//GEN-LAST:event_website1BttnActionPerformed

    private void website3BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website3BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.verywellmind.com/what-is-love-2795343");
    }//GEN-LAST:event_website3BttnActionPerformed

    private void website6BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website6BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.everydayhealth.com/emotional-health/all-about-laziness-what-causes-it-and-what-to-do-about-it/");
    }//GEN-LAST:event_website6BttnActionPerformed

    private void addNewGoalLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNewGoalLblMouseClicked
        dispose();
        new GoalSection().setVisible(true);
    }//GEN-LAST:event_addNewGoalLblMouseClicked

    private void website2BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website2BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.betterhealth.vic.gov.au/health/conditionsandtreatments/anxiety-disorders");
    }//GEN-LAST:event_website2BttnActionPerformed

    private void website4BttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_website4BttnActionPerformed
        AppManager.awarenessManager.OpenWebsite("https://www.mereka.my/blog/how-to-understand-and-manage-your-stress?gclid=Cj0KCQjwvL-oBhCxARIsAHkOiu01_QT8NBWqcUkz0HkwX1etj2A4VFXIRIlS3a-mm-SrkMrorTGtwS8aAlDfEALw_wcB");
    }//GEN-LAST:event_website4BttnActionPerformed

    private void submitBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBttnActionPerformed
        JFrame frame = new JFrame();
        java.util.Date entryDate = diaryEntryChooser.getDate();
        LocalDate diaryEntryDate = entryDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int moodRating = (int) moodRatingSpinner.getValue();
        String moodFeeling = (String) moodFeelingComboBox.getSelectedItem();
        String diaryHeading = diaryHealingTxt.getText();
        String diaryContent = diaryContentTxt.getText();
        try {
           AppManager.diaryManager.addDiaryEntry(AppManager.userManager.getCurrentUserID(), moodRating, moodFeeling, diaryEntryDate, diaryHeading, diaryContent);
           JOptionPane.showMessageDialog(frame, "sucessfully added");
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(frame, "could not be added");
            
        }
    }//GEN-LAST:event_submitBttnActionPerformed

    private void CalendarTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarTableMousePressed
        String day = (String) CalendarTable.getValueAt(CalendarTable.getSelectedRow(), CalendarTable.getSelectedColumn());
        String month = currentMonthLbl.getText();
        String year = currentYearLbl.getText();
        String monthSelected = "";
        switch (month) {

            case "January":
                monthSelected = "01";
                break;
            case "February":
                monthSelected = "02";
                break;
            case "March":
                monthSelected = "03";
                break;
            case "April":
                monthSelected = "04";
                break;
            case "May":
                monthSelected = "05";
                break;
            case "June":
                monthSelected = "06";
                break;
            case "July":
                monthSelected = "07";
                break;
            case "August":
                monthSelected = "08";
                break;
            case "September":
                monthSelected = "09";
                break;
            case "October":
                monthSelected = "10";
                break;
            case "November":
                monthSelected = "11";
                break;
            case "December":
                monthSelected = "12";
                break;

        }

        if (day.length() == 1) {
            day = "0" + day;
        }

        diaryDateSelected = year + "-" + monthSelected + "-" + day;

        System.out.println(diaryDateSelected);
        dispose();
        try {
            new dailyTracker().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class
                    .getName()).log(Level.SEVERE, null, ex);
            try {
                new dailyTracker().setVisible(true);
            } catch (SQLException ex1) {
                try {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex1);
                    Frame frm = new Frame();
                    JOptionPane.showMessageDialog(frm, "no data entered for this day");
                    new HomeScreen().setVisible(true);
                } catch (SQLException ex2) {
                    Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex2);
                }

            }
        }


    }//GEN-LAST:event_CalendarTableMousePressed

    private void moodRatingSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_moodRatingSpinnerStateChanged
        int min = 0;
        int max = 10;
        int moodRatingValue = (int) moodRatingSpinner.getValue();

        if (moodRatingValue < min) {
            moodRatingSpinner.setValue(min);

        } else if (moodRatingValue > max) {
            moodRatingSpinner.setValue(max);
        }

    }//GEN-LAST:event_moodRatingSpinnerStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfCurrentMonth = currentDate.withDayOfMonth(1);
        int currentMonth = firstDayOfCurrentMonth.getMonthValue();

        AppManager.healthManager.generateWeightOverTime(AppManager.userManager.getCurrentUserID(), currentMonth);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfCurrentMonth = currentDate.withDayOfMonth(1);
        int currentMonth = firstDayOfCurrentMonth.getMonthValue();

        AppManager.healthManager.generateActivitiesOverTime(AppManager.userManager.getCurrentUserID(), currentMonth);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfCurrentMonth = currentDate.withDayOfMonth(1);
        int currentMonth = firstDayOfCurrentMonth.getMonthValue();
        AppManager.healthManager.generateMoodVsSleepGraph(AppManager.userManager.getCurrentUserID(), currentMonth);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfCurrentMonth = currentDate.withDayOfMonth(1);
        int currentMonth = firstDayOfCurrentMonth.getMonthValue();
        AppManager.healthManager.generateWaterOverTime(AppManager.userManager.getCurrentUserID(), currentMonth);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void addSleepLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSleepLbl1MouseClicked

    }//GEN-LAST:event_addSleepLbl1MouseClicked

    private void addDiaryEntryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDiaryEntryMousePressed
        parentPanel.removeAll();
        parentPanel.add(diaryEntry);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_addDiaryEntryMousePressed

    private void addSleepLbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSleepLbl1MousePressed
        dispose();
        new healthForms().setVisible(true);


    }//GEN-LAST:event_addSleepLbl1MousePressed

    private void addHydrationLevelLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHydrationLevelLblMousePressed
        dispose();
        new healthForms().setVisible(true);
    }//GEN-LAST:event_addHydrationLevelLblMousePressed

    private void addActivityLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addActivityLblMousePressed
        dispose();
        new healthForms().setVisible(true);
    }//GEN-LAST:event_addActivityLblMousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        parentPanel.removeAll();
        parentPanel.add(dashboard);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_jLabel1MousePressed

    private void goalPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goalPanelMouseClicked

    }//GEN-LAST:event_goalPanelMouseClicked

    private void calendarPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calendarPanelMousePressed
        parentPanel.removeAll();
        parentPanel.add(calendar);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_calendarPanelMousePressed

    private void awarenessPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awarenessPanelMousePressed
        parentPanel.removeAll();
        parentPanel.add(awareness);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_awarenessPanelMousePressed

    private void diaryEntryPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaryEntryPanelMousePressed
        parentPanel.removeAll();
        parentPanel.add(diaryEntry);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_diaryEntryPanelMousePressed

    private void accountPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountPanelMousePressed
        parentPanel.removeAll();
        parentPanel.add(account);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_accountPanelMousePressed

    private void goalPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goalPanelMousePressed
        parentPanel.removeAll();
        parentPanel.add(goals);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_goalPanelMousePressed

    private void awarenessTopicListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_awarenessTopicListMouseClicked
        parentPanel.removeAll();
        parentPanel.add(awareness);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_awarenessTopicListMouseClicked

    private void upcomingGoalsListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upcomingGoalsListMousePressed

    }//GEN-LAST:event_upcomingGoalsListMousePressed

    private void upcomingGoalsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upcomingGoalsListMouseClicked
        String currentGoal = upcomingGoalsList.getSelectedValue();
        int currentUserID = AppManager.userManager.getCurrentUserID();
        try {
            currentGoalID = AppManager.goalManager.getSelectedGoalID(currentGoal, currentUserID);
            dispose();
            new GoalProgress().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_upcomingGoalsListMouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "Welcome to Journey! This is your dashboard that  highlights important tasks and statistics we want you to keep in mind.\n On the right hand side you can see a list of pictures that will direct you to other sections of the app.");
    }//GEN-LAST:event_jLabel2MousePressed

    private void helpLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLblMousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "In this section you can add tasks as 'goals' and set end dates for them.\n On the right hand side you can view the duration of your tasks.\n The steps you need to take to complete your task and the percentage left for you to complete");
    }//GEN-LAST:event_helpLblMousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "This is your calendar. Once you click on a date you can access past information of that day.\nYour calendar also indicates when goals are due.");
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "This is your personal diary. You can input how you feel and why you feel that way. Journey values privacy and your content is highly secured!");
    }//GEN-LAST:event_jLabel4MousePressed

    private void helpLbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLbl1MousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "In this section Journey shares with you some valuable resources that will expand your knowledge of why you feel certain emotions.\n Just press the view button to read some interesting articles.");
    }//GEN-LAST:event_helpLbl1MousePressed

    private void helpLbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLbl2MousePressed
        JFrame helpMenu = new JFrame();
        JOptionPane.showMessageDialog(helpMenu, "Here you can access personla details and statistics of yourself. These statistics are made in order for you to identify your patterns of behaviour.\n Press the buttons to view graphs of your accumulated information.");
    }//GEN-LAST:event_helpLbl2MousePressed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HomeScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CalendarTable;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel P5;
    private javax.swing.JPanel P6;
    private javax.swing.JPanel account;
    private javax.swing.JLabel accountPanel;
    private javax.swing.JLabel addActivityLbl;
    private javax.swing.JLabel addDiaryEntry;
    private javax.swing.JPanel addGoalPanel;
    private javax.swing.JLabel addHydrationLevelLbl;
    private javax.swing.JLabel addNewGoalLbl;
    private javax.swing.JLabel addSleepLbl1;
    private javax.swing.JTextArea avergaesTxtArea;
    private javax.swing.JPanel awareness;
    private javax.swing.JLabel awarenessPanel;
    private javax.swing.JList<String> awarenessTopicList;
    private javax.swing.JPanel calendar;
    private javax.swing.JLabel calendarPanel;
    private javax.swing.JList<String> completedGoalsList;
    private javax.swing.JLabel currentGoalsHeadingLbl;
    private javax.swing.JLabel currentGoalsHeadingLbl2;
    private javax.swing.JLabel currentGoalsHeadingLbl3;
    private javax.swing.JList<String> currentGoalsList;
    private javax.swing.JLabel currentMonthLbl;
    private javax.swing.JLabel currentYearLbl;
    private javax.swing.JPanel dashboard;
    private javax.swing.JTextArea diaryContentTxt;
    private javax.swing.JPanel diaryEntry;
    private com.toedter.calendar.JDateChooser diaryEntryChooser;
    private javax.swing.JLabel diaryEntryPanel;
    private javax.swing.JTextField diaryHealingTxt;
    private javax.swing.JLabel durationOfGoalLbl;
    private javax.swing.JLabel goalPanel;
    private javax.swing.JPanel goals;
    private javax.swing.JLabel goalsLbl;
    private javax.swing.JLabel goalsLbl1;
    private javax.swing.JLabel helpLbl;
    private javax.swing.JLabel helpLbl1;
    private javax.swing.JLabel helpLbl2;
    private javax.swing.JProgressBar hydrationLvlBar;
    private javax.swing.JLabel iconLbl1;
    private javax.swing.JLabel iconLbl3;
    private javax.swing.JLabel iconLbl4;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextArea last7DaysStatsTxt;
    private javax.swing.JComboBox<String> moodFeelingComboBox;
    private javax.swing.JSpinner moodRatingSpinner;
    private javax.swing.JLabel nameOfUser;
    private javax.swing.JLabel nextMonthlbl;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel percentageOfCompletionLbl1;
    private javax.swing.JLabel previousMonthLbl;
    private javax.swing.JLabel stressLevelsLbl;
    private javax.swing.JButton submitBttn;
    private javax.swing.JList<String> upcomingGoalsList;
    private javax.swing.JTextArea userDetailsTxt;
    private javax.swing.JLabel userImage;
    private javax.swing.JButton website1Bttn;
    private javax.swing.JButton website2Bttn;
    private javax.swing.JButton website3Bttn;
    private javax.swing.JButton website4Bttn;
    private javax.swing.JButton website5Bttn;
    private javax.swing.JButton website6Bttn;
    // End of variables declaration//GEN-END:variables

}
