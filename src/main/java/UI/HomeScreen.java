/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyrab
 */
public class HomeScreen extends javax.swing.JFrame {

    String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

    int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    String[][] calendar = new String[7][7];


    public HomeScreen() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        parentPanel = new javax.swing.JPanel();
        cardFive = new javax.swing.JPanel();
        cardFour = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        cardThree = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        currentGoalsHeadingLbl1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        CalendarModel = new javax.swing.JTable();
        cardSix = new javax.swing.JPanel();
        cardOne = new javax.swing.JPanel();
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
        cardTwo = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        P2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        P3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        P5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        P6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        P1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setBackground(new java.awt.Color(44, 42, 74));
        parentPanel.setLayout(new java.awt.CardLayout());

        cardFive.setBackground(new java.awt.Color(153, 153, 255));
        cardFive.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        parentPanel.add(cardFive, "card6");

        cardFour.setBackground(new java.awt.Color(78, 81, 140));
        cardFour.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        cardFour.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 460, 500));

        parentPanel.add(cardFour, "card5");

        cardThree.setBackground(new java.awt.Color(78, 81, 140));
        cardThree.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(44, 42, 74));

        currentGoalsHeadingLbl1.setBackground(new java.awt.Color(102, 255, 255));
        currentGoalsHeadingLbl1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        currentGoalsHeadingLbl1.setForeground(new java.awt.Color(153, 255, 255));
        currentGoalsHeadingLbl1.setText("My Thoughts:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(currentGoalsHeadingLbl1)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentGoalsHeadingLbl1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardThree.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        CalendarModel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(CalendarModel);

        cardThree.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        parentPanel.add(cardThree, "card4");

        cardSix.setBackground(new java.awt.Color(44, 42, 74));

        javax.swing.GroupLayout cardSixLayout = new javax.swing.GroupLayout(cardSix);
        cardSix.setLayout(cardSixLayout);
        cardSixLayout.setHorizontalGroup(
            cardSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        cardSixLayout.setVerticalGroup(
            cardSixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );

        parentPanel.add(cardSix, "card7");

        cardOne.setBackground(new java.awt.Color(78, 81, 140));
        cardOne.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\chakras (1).png")); // NOI18N
        userImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        cardOne.add(userImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("- sleep avg\n- stress avg\n- exercise done\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane1.setViewportView(jTextArea1);

        cardOne.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 280, 110));

        stressLevelsLbl.setBackground(new java.awt.Color(255, 255, 255));
        stressLevelsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        stressLevelsLbl.setForeground(new java.awt.Color(255, 255, 255));
        stressLevelsLbl.setText("Stress Levels:");
        stressLevelsLbl.setToolTipText("");
        cardOne.add(stressLevelsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 90, 20));
        cardOne.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kyra Balliram");
        cardOne.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, 20));

        addDailyNoteLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\neon-notes (1).png")); // NOI18N
        addDailyNoteLbl.setText("add act");
        cardOne.add(addDailyNoteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 60, 70));

        addActivityLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\neon-notes (1).png")); // NOI18N
        cardOne.add(addActivityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 70));

        addHydrationLevelLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\neon-notes (1).png")); // NOI18N
        addHydrationLevelLbl.setText("add act");
        cardOne.add(addHydrationLevelLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 70));

        addMedsLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\neon-notes (1).png")); // NOI18N
        addMedsLbl.setText("add act");
        cardOne.add(addMedsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 60, 70));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("add daily note");
        cardOne.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("add activity");
        cardOne.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("add hydration level");
        cardOne.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, 20));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("add medication");
        cardOne.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 100, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Last 7 days:");
        jLabel14.setToolTipText("");
        cardOne.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 112, 30));

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

        cardOne.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 200, 230));

        jTextArea2.setBackground(new java.awt.Color(44, 42, 74));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(7, 222, 255)));
        jScrollPane2.setViewportView(jTextArea2);

        cardOne.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 190, 240));

        goalsLbl.setBackground(new java.awt.Color(255, 255, 255));
        goalsLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        goalsLbl.setForeground(new java.awt.Color(255, 255, 255));
        goalsLbl.setText("Goals:");
        goalsLbl.setToolTipText("");
        cardOne.add(goalsLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 70, 20));

        parentPanel.add(cardOne, "card2");

        cardTwo.setBackground(new java.awt.Color(78, 81, 140));
        cardTwo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goalsList.setBackground(new java.awt.Color(44, 42, 74));
        goalsList.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        goalsList.setForeground(new java.awt.Color(255, 255, 255));
        goalsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. get an A in math", "2. drinbk more water", "3. help more poeple" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(goalsList);

        cardTwo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 200));

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

        cardTwo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 514, -1));

        goalsPreviewTxtArea.setBackground(new java.awt.Color(44, 42, 74));
        goalsPreviewTxtArea.setColumns(20);
        goalsPreviewTxtArea.setForeground(new java.awt.Color(255, 255, 255));
        goalsPreviewTxtArea.setRows(5);
        goalsPreviewTxtArea.setText("1. be kinder\n2. attend gym consistently\n3. help mom with dinner\n\n\n");
        goalsPreviewTxtArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(125, 239, 255)));
        jScrollPane4.setViewportView(goalsPreviewTxtArea);

        cardTwo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, 230));

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\wall-clock (1).png")); // NOI18N
        iconLbl1.setText("jLabel15");
        jPanel5.add(iconLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        jLabel15.setText("jLabel7");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        cardTwo.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 60));

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\percentage (1).png")); // NOI18N
        iconLbl2.setText("jLabel15");
        jPanel6.add(iconLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel18.setText("jLabel7");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 120, 30));

        cardTwo.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 50));

        addGoalPanel.setBackground(new java.awt.Color(153, 153, 255));
        addGoalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconLbl3.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\plus (1).png")); // NOI18N
        iconLbl3.setText("jLabel15");
        addGoalPanel.add(iconLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        jLabel7.setText("jLabel7");
        addGoalPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 120, 30));

        cardTwo.add(addGoalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(218, 191, 255));
        jLabel17.setText("Current Goals:");
        cardTwo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(218, 191, 255));
        jLabel19.setText("Goals Completed:");
        cardTwo.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\goal (1).png")); // NOI18N
        jLabel20.setText("jLabel20");
        cardTwo.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 200, 190));

        parentPanel.add(cardTwo, "card7");

        jPanel2.setBackground(new java.awt.Color(44, 42, 74));

        P2.setBackground(new java.awt.Color(218, 191, 255));
        P2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P2MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\tree-of-life (1).png")); // NOI18N

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P3.setBackground(new java.awt.Color(218, 191, 255));
        P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P3MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\international-day-of-yoga (1).png")); // NOI18N

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P4.setBackground(new java.awt.Color(218, 191, 255));
        P4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\book (1).png")); // NOI18N

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P5.setBackground(new java.awt.Color(218, 191, 255));
        P5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\website (1).png")); // NOI18N

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P6.setBackground(new java.awt.Color(218, 191, 255));
        P6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P6MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\phone (1).png")); // NOI18N

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        P1.setBackground(new java.awt.Color(218, 191, 255));
        P1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\kyrab\\Documents\\NetBeansProjects\\PAT2023\\data\\meditation (1).png")); // NOI18N

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(P5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 617, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P2MouseClicked

        parentPanel.removeAll();
        parentPanel.add(cardTwo);
        parentPanel.repaint();
        parentPanel.revalidate();


    }//GEN-LAST:event_P2MouseClicked

    private void P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P3MouseClicked
        parentPanel.removeAll();
        parentPanel.add(cardThree);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_P3MouseClicked

    private void P1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P1MouseClicked
        parentPanel.removeAll();
        parentPanel.add(cardOne);
        parentPanel.repaint();
        parentPanel.revalidate();

    }//GEN-LAST:event_P1MouseClicked

    private void P4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4MouseClicked
        parentPanel.removeAll();
        parentPanel.add(cardFour);
        parentPanel.repaint();
        parentPanel.revalidate();


    }//GEN-LAST:event_P4MouseClicked

    private void P5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5MouseClicked
        parentPanel.removeAll();
        parentPanel.add(cardFive);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_P5MouseClicked

    private void P6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P6MouseClicked
        parentPanel.removeAll();
        parentPanel.add(cardSix);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_P6MouseClicked

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
    private javax.swing.JTable CalendarModel;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel P5;
    private javax.swing.JPanel P6;
    private javax.swing.JLabel addActivityLbl;
    private javax.swing.JLabel addDailyNoteLbl;
    private javax.swing.JPanel addGoalPanel;
    private javax.swing.JLabel addHydrationLevelLbl;
    private javax.swing.JLabel addMedsLbl;
    private javax.swing.JPanel cardFive;
    private javax.swing.JPanel cardFour;
    private javax.swing.JPanel cardOne;
    private javax.swing.JPanel cardSix;
    private javax.swing.JPanel cardThree;
    private javax.swing.JPanel cardTwo;
    private javax.swing.JLabel currentGoalsHeadingLbl;
    private javax.swing.JLabel currentGoalsHeadingLbl1;
    private javax.swing.JLabel goalsLbl;
    private javax.swing.JList<String> goalsList;
    private javax.swing.JTextArea goalsPreviewTxtArea;
    private javax.swing.JLabel iconLbl1;
    private javax.swing.JLabel iconLbl2;
    private javax.swing.JLabel iconLbl3;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel stressLevelsLbl;
    private javax.swing.JLabel userImage;
    // End of variables declaration//GEN-END:variables

}
