/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.Calendar;
import BACKEND.managers.CalendarManager;
import BACKEND.managers.UserManager;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyrab
 */
public class HomeScreen extends javax.swing.JFrame {

    String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    private CalendarManager calendarManager = new CalendarManager();
    private UserManager m;

    public HomeScreen(UserManager inManager) {
        initComponents();
        m = inManager;
        // Get current month and year
        Calendar cal = Calendar.getInstance();
        int currentMonth = cal.get(Calendar.MONTH);
        int currentYear = cal.get(Calendar.YEAR);

        // Get calendar data for the current month
        String[][] calendarData = calendarManager.getCalendarForMonth(currentMonth, currentYear);

        // Create and set the table model
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);

        //set month
        currentMonthLbl.setText(calendarManager.getCurrentMonthName());
        currentYearLbl.setText(calendarManager.getCurrentYearString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parentPanel = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        userImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        stressLevelsLbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addDailyNoteLbl = new javax.swing.JLabel();
        addActivityLbl = new javax.swing.JLabel();
        addHydrationLevelLbl = new javax.swing.JLabel();
        addSleepLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        goalsLbl = new javax.swing.JLabel();
        goalsLbl1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        diaryEntry = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        currentGoalsHeadingLbl2 = new javax.swing.JLabel();
        calendar = new javax.swing.JPanel();
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
        jTextArea4 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton12 = new javax.swing.JButton();
        goals = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        goalsList = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        currentGoalsHeadingLbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        goalsPreviewTxtArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        iconLbl1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        iconLbl2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        addGoalPanel = new javax.swing.JPanel();
        iconLbl3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        awareness = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        currentGoalsHeadingLbl3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        P2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        P5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        P6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        dashboard.add(userImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 80));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("- sleep avg\n- stress avg\n- exercise done\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane1.setViewportView(jTextArea1);

        dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, 110));

        stressLevelsLbl.setBackground(new java.awt.Color(255, 255, 255));
        stressLevelsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        stressLevelsLbl.setForeground(new java.awt.Color(255, 255, 255));
        stressLevelsLbl.setText("Daily Notes");
        stressLevelsLbl.setToolTipText("");
        dashboard.add(stressLevelsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 20));
        dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kyra Balliram");
        dashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 20));

        addDailyNoteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addDailyNoteLbl.setText("add act");
        addDailyNoteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDailyNoteLblMouseClicked(evt);
            }
        });
        dashboard.add(addDailyNoteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 60, 70));

        addActivityLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addActivityLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addActivityLblMouseClicked(evt);
            }
        });
        dashboard.add(addActivityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 70));

        addHydrationLevelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addHydrationLevelLbl.setText("add act");
        addHydrationLevelLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addHydrationLevelLblMouseClicked(evt);
            }
        });
        dashboard.add(addHydrationLevelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 70));

        addSleepLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addSleepLbl.setText("add act");
        addSleepLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSleepLblMouseClicked(evt);
            }
        });
        dashboard.add(addSleepLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 70));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("add daily note");
        dashboard.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("add activity");
        dashboard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("add hydration level");
        dashboard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("add medication");
        dashboard.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Last 7 days:");
        jLabel14.setToolTipText("");
        dashboard.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 112, 30));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox3.setForeground(new java.awt.Color(44, 42, 74));
        jCheckBox3.setText("jCheckBox1");
        jPanel3.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 10, -1, -1));

        jCheckBox4.setForeground(new java.awt.Color(44, 42, 74));
        jCheckBox4.setText("jCheckBox1");
        jPanel3.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jCheckBox6.setForeground(new java.awt.Color(44, 42, 74));
        jCheckBox6.setText("jCheckBox1");
        jPanel3.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        dashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 130));

        jTextArea2.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane2.setViewportView(jTextArea2);

        dashboard.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 190, 230));

        goalsLbl.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl.setForeground(new java.awt.Color(255, 255, 255));
        goalsLbl.setText("Hydration Level:");
        goalsLbl.setToolTipText("");
        dashboard.add(goalsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 20));

        goalsLbl1.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl1.setForeground(new java.awt.Color(255, 255, 255));
        goalsLbl1.setText("Goals:");
        goalsLbl1.setToolTipText("");
        dashboard.add(goalsLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 20));
        dashboard.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        parentPanel.add(dashboard, "card2");

        diaryEntry.setBackground(new java.awt.Color(78, 81, 140));
        diaryEntry.setMinimumSize(new java.awt.Dimension(514, 550));
        diaryEntry.setPreferredSize(new java.awt.Dimension(514, 550));
        diaryEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(44, 42, 74));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 72, 37));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 240, 37));

        jTextField1.setText("<heading>");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 390, 42));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 222, 255)));
        jScrollPane5.setViewportView(jTextArea3);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, 220));

        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(218, 191, 255)));
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 120, -1));

        jLabel24.setBackground(new java.awt.Color(7, 222, 255));
        jLabel24.setForeground(new java.awt.Color(218, 191, 255));
        jLabel24.setText("How do you feel:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 20));

        jLabel25.setForeground(new java.awt.Color(218, 191, 255));
        jLabel25.setText("Date of Entry:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 40));
        jPanel8.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 40));

        jLabel26.setForeground(new java.awt.Color(218, 191, 255));
        jLabel26.setText("Mood:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        diaryEntry.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 460, 500));

        currentGoalsHeadingLbl2.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl2.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl2.setText("Capture A Thought:");
        diaryEntry.add(currentGoalsHeadingLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        parentPanel.add(diaryEntry, "card5");

        calendar.setBackground(new java.awt.Color(78, 81, 140));
        calendar.setMinimumSize(new java.awt.Dimension(514, 550));
        calendar.setPreferredSize(new java.awt.Dimension(514, 550));
        calendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        });
        jScrollPane6.setViewportView(CalendarTable);

        calendar.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        currentMonthLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
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

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane7.setViewportView(jTextArea4);

        jPanel17.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 200, 160));

        jButton2.setText("Sleep Patterns");
        jPanel17.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 170, 40));

        jButton3.setText("Previous activities");
        jPanel17.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 40));

        jButton4.setText("mood trends");
        jPanel17.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 170, 40));

        jLabel23.setText("<graph>");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 190, 160));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("<personal details>\n");
        jScrollPane8.setViewportView(jTextArea5);

        jPanel17.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 280, 90));

        jButton12.setText("Water intake history");
        jPanel17.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 170, 40));

        account.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 490));

        parentPanel.add(account, "card7");

        goals.setBackground(new java.awt.Color(78, 81, 140));
        goals.setPreferredSize(new java.awt.Dimension(514, 550));
        goals.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goalsList.setBackground(new java.awt.Color(44, 42, 74));
        goalsList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        goalsList.setForeground(new java.awt.Color(255, 255, 255));
        goalsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. get an A in math", "2. drinbk more water", "3. help more poeple" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(goalsList);

        goals.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 200));

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

        goalsPreviewTxtArea.setBackground(new java.awt.Color(44, 42, 74));
        goalsPreviewTxtArea.setColumns(20);
        goalsPreviewTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        goalsPreviewTxtArea.setRows(5);
        goalsPreviewTxtArea.setText("1. be kinder\n2. attend gym consistently\n3. help mom with dinner\n\n\n");
        goalsPreviewTxtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        jScrollPane4.setViewportView(goalsPreviewTxtArea);

        goals.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 220, 230));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stopwatch (1).png"))); // NOI18N
        iconLbl1.setText("jLabel15");
        jPanel5.add(iconLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel15.setText("jLabel7");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        goals.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 60));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/percentage (1).png"))); // NOI18N
        iconLbl2.setText("jLabel15");
        jPanel6.add(iconLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel18.setText("jLabel7");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        goals.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 50));

        addGoalPanel.setBackground(new java.awt.Color(153, 153, 255));
        addGoalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus (1).png"))); // NOI18N
        iconLbl3.setText("jLabel15");
        iconLbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLbl3MouseClicked(evt);
            }
        });
        addGoalPanel.add(iconLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel7.setText("jLabel7");
        addGoalPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 120, 30));

        goals.add(addGoalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(218, 191, 255));
        jLabel17.setText("Current Goals:");
        goals.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(218, 191, 255));
        jLabel19.setText("Goals Completed:");
        goals.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/goal (1).png"))); // NOI18N
        jLabel20.setText("jLabel20");
        goals.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 200, 190));

        parentPanel.add(goals, "card7");

        awareness.setBackground(new java.awt.Color(78, 81, 140));
        awareness.setMinimumSize(new java.awt.Dimension(514, 550));
        awareness.setPreferredSize(new java.awt.Dimension(514, 550));
        awareness.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye (1).png"))); // NOI18N
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 81));

        awareness.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 130));

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));

        jLabel34.setText("jLabel30");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        awareness.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 130));

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));

        jLabel33.setText("jLabel30");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 59, Short.MAX_VALUE))
        );

        awareness.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));

        jLabel35.setText("jLabel30");

        jButton9.setText("view");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton9))
        );

        awareness.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/web (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel32)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        awareness.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/love (1).png"))); // NOI18N

        jButton11.setText("view");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel31)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton11))
        );

        awareness.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 150, 140));

        jPanel11.setBackground(new java.awt.Color(44, 42, 74));

        currentGoalsHeadingLbl3.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl3.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl3.setText("Learn Something New");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(197, Short.MAX_VALUE)
                .addComponent(currentGoalsHeadingLbl3)
                .addGap(170, 170, 170))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentGoalsHeadingLbl3)
                .addContainerGap())
        );

        awareness.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        jButton5.setText("view");
        awareness.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 150, -1));

        jButton6.setText("view");
        awareness.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, -1));

        jButton7.setText("view");
        awareness.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, -1));

        jButton8.setText("jButton5");
        awareness.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, -1));

        jButton10.setText("view");
        awareness.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 150, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tree-of-life (1).png"))); // NOI18N

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 80, 80));

        P3.setBackground(new java.awt.Color(218, 191, 255));
        P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/international-day-of-yoga (1).png"))); // NOI18N

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 186, 80, 80));

        P4.setBackground(new java.awt.Color(218, 191, 255));
        P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/website (1).png"))); // NOI18N

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, 80, 80));

        P5.setBackground(new java.awt.Color(218, 191, 255));
        P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book (1).png"))); // NOI18N

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel2.add(P5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, 80));

        P6.setBackground(new java.awt.Color(218, 191, 255));
        P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone (1).png"))); // NOI18N

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(P6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 80, 90));

        P1.setBackground(new java.awt.Color(218, 191, 255));
        P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meditation (1).png"))); // NOI18N

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

        parentPanel.removeAll();
        parentPanel.add(goals);
        parentPanel.repaint();
        parentPanel.revalidate();


    }//GEN-LAST:event_P2MouseClicked

    private void P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3MouseClicked
        parentPanel.removeAll();
        parentPanel.add(calendar);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_P3MouseClicked

    private void P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MouseClicked
        parentPanel.removeAll();
        parentPanel.add(dashboard);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_P1MouseClicked

    private void P4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4MouseClicked
        parentPanel.removeAll();
        parentPanel.add(diaryEntry);
        parentPanel.repaint();
        parentPanel.revalidate();


    }//GEN-LAST:event_P4MouseClicked

    private void P5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5MouseClicked
        parentPanel.removeAll();
        parentPanel.add(awareness);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_P5MouseClicked

    private void P6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6MouseClicked
        parentPanel.removeAll();
        parentPanel.add(account);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_P6MouseClicked

    private void CalendarTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalendarTableMouseClicked
        String day = (String) CalendarTable.getValueAt(CalendarTable.getSelectedRow(), CalendarTable.getSelectedColumn());
        System.out.println(day);
        
    }//GEN-LAST:event_CalendarTableMouseClicked

    private void addHydrationLevelLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addHydrationLevelLblMouseClicked
        dispose();
        new healthForms(m).setVisible(true);
    }//GEN-LAST:event_addHydrationLevelLblMouseClicked

    private void nextMonthlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMonthlblMouseClicked

        calendarManager.nextMonth();
        String[][] calendarData = calendarManager.getCurrentCalendar();
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);
        currentMonthLbl.setText(calendarManager.getCurrentMonthName());
        currentYearLbl.setText(calendarManager.getCurrentYearString());
    }//GEN-LAST:event_nextMonthlblMouseClicked

    private void previousMonthLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMonthLblMouseClicked
        calendarManager.previousMonth();
        String[][] calendarData = calendarManager.getCurrentCalendar();
        DefaultTableModel model = new DefaultTableModel(calendarData, days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100);
        currentMonthLbl.setText(calendarManager.getCurrentMonthName());
        currentYearLbl.setText(calendarManager.getCurrentYearString());
    }//GEN-LAST:event_previousMonthLblMouseClicked

    private void addActivityLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addActivityLblMouseClicked
        dispose();
        new healthForms(m).setVisible(true);
    }//GEN-LAST:event_addActivityLblMouseClicked

    private void addSleepLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSleepLblMouseClicked
        dispose();
        new healthForms(m).setVisible(true);
    }//GEN-LAST:event_addSleepLblMouseClicked

    private void addDailyNoteLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDailyNoteLblMouseClicked
        dispose();
        new healthForms(m).setVisible(true);
    }//GEN-LAST:event_addDailyNoteLblMouseClicked

    private void iconLbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLbl3MouseClicked
        dispose();
        new GoalSection(m).setVisible(true);
    }//GEN-LAST:event_iconLbl3MouseClicked

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
    private javax.swing.JLabel addActivityLbl;
    private javax.swing.JLabel addDailyNoteLbl;
    private javax.swing.JPanel addGoalPanel;
    private javax.swing.JLabel addHydrationLevelLbl;
    private javax.swing.JLabel addSleepLbl;
    private javax.swing.JPanel awareness;
    private javax.swing.JPanel calendar;
    private javax.swing.JLabel currentGoalsHeadingLbl;
    private javax.swing.JLabel currentGoalsHeadingLbl2;
    private javax.swing.JLabel currentGoalsHeadingLbl3;
    private javax.swing.JLabel currentMonthLbl;
    private javax.swing.JLabel currentYearLbl;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel diaryEntry;
    private javax.swing.JPanel goals;
    private javax.swing.JLabel goalsLbl;
    private javax.swing.JLabel goalsLbl1;
    private javax.swing.JList<String> goalsList;
    private javax.swing.JTextArea goalsPreviewTxtArea;
    private javax.swing.JLabel iconLbl1;
    private javax.swing.JLabel iconLbl2;
    private javax.swing.JLabel iconLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel nextMonthlbl;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel previousMonthLbl;
    private javax.swing.JLabel stressLevelsLbl;
    private javax.swing.JLabel userImage;
    // End of variables declaration//GEN-END:variables

}
