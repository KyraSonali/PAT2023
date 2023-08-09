/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

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

    int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public String[][] getCal(int startDay, int numDaysInMonth) {
        String[][] calendar = new String[6][7];
        int currentDay = 1;
        for (int week = 0; week < 7; week++) {
            for (int day = 0; day < 7; day++) {

                calendar[week][day] = currentDay + "";
                currentDay++;
                if (currentDay > numDaysInMonth) {
                    break;
                }

            }
            if (currentDay > numDaysInMonth) {
                break;
            }

        }

        return calendar;

    }

    public HomeScreen() {
        initComponents();

        DefaultTableModel model = new DefaultTableModel(getCal(7, 28), days);
        CalendarTable.setModel(model);
        CalendarTable.setRowHeight(100); // Set the default row height

//        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
//        renderer.setPreferredSize(new Dimension(100, 100)); // Set preferred cell size
//        CalendarTable.setDefaultRenderer(Object.class, renderer);
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
        addMedsLbl = new javax.swing.JLabel();
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
        diaryEntry = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        calendar = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        currentGoalsHeadingLbl1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CalendarTable = new javax.swing.JTable();
        account = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
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
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
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
        stressLevelsLbl.setText("Stress Levels:");
        stressLevelsLbl.setToolTipText("");
        dashboard.add(stressLevelsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 20));
        dashboard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kyra Balliram");
        dashboard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 20));

        addDailyNoteLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addDailyNoteLbl.setText("add act");
        dashboard.add(addDailyNoteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 60, 70));

        addActivityLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        dashboard.add(addActivityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 70));

        addHydrationLevelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addHydrationLevelLbl.setText("add act");
        dashboard.add(addHydrationLevelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 70));

        addMedsLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/neon-notes (1).png"))); // NOI18N
        addMedsLbl.setText("add act");
        dashboard.add(addMedsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 70));

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

        dashboard.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 230));

        jTextArea2.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane2.setViewportView(jTextArea2);

        dashboard.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, 240));

        goalsLbl.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl.setForeground(new java.awt.Color(255, 255, 255));
        goalsLbl.setText("Goals:");
        goalsLbl.setToolTipText("");
        dashboard.add(goalsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 20));

        parentPanel.add(dashboard, "card2");

        diaryEntry.setBackground(new java.awt.Color(78, 81, 140));
        diaryEntry.setMinimumSize(new java.awt.Dimension(514, 550));
        diaryEntry.setPreferredSize(new java.awt.Dimension(514, 550));
        diaryEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(44, 42, 74));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 72, 37));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 240, 37));

        jTextField1.setText("<heading>");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 390, 42));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 222, 255)));
        jScrollPane5.setViewportView(jTextArea3);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 390, 220));

        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 120, -1));

        diaryEntry.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 460, 500));

        parentPanel.add(diaryEntry, "card5");

        calendar.setBackground(new java.awt.Color(78, 81, 140));
        calendar.setMinimumSize(new java.awt.Dimension(514, 550));
        calendar.setPreferredSize(new java.awt.Dimension(514, 550));
        calendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(44, 42, 74));

        currentGoalsHeadingLbl1.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl1.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl1.setText("My Thoughts:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(currentGoalsHeadingLbl1)
                .addGap(201, 201, 201))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentGoalsHeadingLbl1)
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
        CalendarTable.setColumnSelectionAllowed(false);
        CalendarTable.setRowSelectionAllowed(false);
        CalendarTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        CalendarTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalendarTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(CalendarTable);

        calendar.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

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

        jPanel17.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 180));

        jLabel21.setText("<age>");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 160, 30));

        jLabel22.setText("<name and surname>");
        jPanel17.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 30));

        jButton2.setText("Medical History");
        jPanel17.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 40));

        jButton3.setText("Previous activities");
        jPanel17.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, 40));

        jButton4.setText("Water intake history");
        jPanel17.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 170, 40));

        jLabel23.setText("<graph>");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 180));

        account.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 490));

        parentPanel.add(account, "card7");

        goals.setBackground(new java.awt.Color(78, 81, 140));
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

        goals.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 230));

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
        jPanel6.add(iconLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel18.setText("jLabel7");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        goals.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 50));

        addGoalPanel.setBackground(new java.awt.Color(153, 153, 255));
        addGoalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus (1).png"))); // NOI18N
        iconLbl3.setText("jLabel15");
        addGoalPanel.add(iconLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

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

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout awarenessLayout = new javax.swing.GroupLayout(awareness);
        awareness.setLayout(awarenessLayout);
        awarenessLayout.setHorizontalGroup(
            awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awarenessLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        awarenessLayout.setVerticalGroup(
            awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(awarenessLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(awarenessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
       String day = (String) CalendarTable.getValueAt(CalendarTable.getSelectedRow(),CalendarTable.getSelectedColumn());
        System.out.println(day);
    }//GEN-LAST:event_CalendarTableMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
            }
        });
    }

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
    private javax.swing.JLabel addMedsLbl;
    private javax.swing.JPanel awareness;
    private javax.swing.JPanel calendar;
    private javax.swing.JLabel currentGoalsHeadingLbl;
    private javax.swing.JLabel currentGoalsHeadingLbl1;
    private javax.swing.JPanel dashboard;
    private javax.swing.JPanel diaryEntry;
    private javax.swing.JPanel goals;
    private javax.swing.JLabel goalsLbl;
    private javax.swing.JList<String> goalsList;
    private javax.swing.JTextArea goalsPreviewTxtArea;
    private javax.swing.JLabel iconLbl1;
    private javax.swing.JLabel iconLbl2;
    private javax.swing.JLabel iconLbl3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel stressLevelsLbl;
    private javax.swing.JLabel userImage;
    // End of variables declaration//GEN-END:variables

}
