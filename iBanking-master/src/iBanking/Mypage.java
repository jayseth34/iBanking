
package iBanking;
import java.util.Calendar;
import java.util.GregorianCalendar;

import java.sql.*;
import javax.swing.JOptionPane;
public class Mypage extends javax.swing.JFrame {

   
    public Mypage() {
        initComponents();
        Calendar();
        Account();
    }
public void Calendar(){
Calendar cal=new GregorianCalendar();
int month=cal.get(Calendar.MONTH);
int year=cal.get(Calendar.YEAR);
int day=cal.get(Calendar.DAY_OF_MONTH);
int hour=cal.get(Calendar.HOUR_OF_DAY);
int min=cal.get(Calendar.MINUTE);
int sec=cal.get(Calendar.SECOND);
date.setText(+day+"-"+(+month+1)+"-"+year);
timee.setText(+hour+"-"+(+min+1)+"-"+sec);

}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        Withdraw = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        u = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        a = new javax.swing.JTextField();
        av = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        t = new javax.swing.JTextField();
        se = new javax.swing.JButton();
        s = new javax.swing.JButton();
        w = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        USER1 = new java.awt.Label();
        u1 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        name1 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jLabel42 = new javax.swing.JLabel();
        label9 = new java.awt.Label();
        ta1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        tr = new javax.swing.JButton();
        sh = new javax.swing.JButton();
        n1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        av1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        ca1 = new javax.swing.JLabel();
        ca2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        roi = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        u2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        n2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        av2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pname = new javax.swing.JPasswordField();
        mnum = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        sate = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        citi = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        dobb = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        timee = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("WELCOME TO iBANKING!!");

        Withdraw.setBackground(new java.awt.Color(51, 0, 51));
        Withdraw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Withdraw.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Withdraw.setName("PROFILE"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("User-ID");

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel34.setText("Name");

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setText("Account No.");

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setText("Available Balance");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Deposit Amount");

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton6.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton6.setText("SHOW DETAILS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Yes,Sure to Deposit");

        jButton7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton7.setText("Total");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton8.setText("DEPOSIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(101, 101, 101)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel36)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(jButton7))
                                .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel34)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel35)
                            .addGap(66, 66, 66)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jButton8))
                        .addComponent(jCheckBox1)))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(20, 20, 20))
        );

        Withdraw.addTab("DEPOSIT", jPanel2);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setText("USER");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("NAME");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("ACCOUNT NO.");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("AVAILABLE BALANCE");

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("AMOUNT");

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel41.setText("TOTAL");

        u.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        n.setEditable(false);
        n.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        a.setEditable(false);
        a.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        av.setEditable(false);
        av.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        am.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        t.setEditable(false);
        t.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        se.setText("SHOW DETAILS");
        se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seActionPerformed(evt);
            }
        });

        s.setText("SHOW");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });

        w.setText("WITHDRAW");
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(n)
                            .addComponent(av)
                            .addComponent(a)
                            .addComponent(am)
                            .addComponent(t))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(se)
                            .addComponent(s)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(w)))
                .addContainerGap(573, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(se))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(av, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s))
                .addGap(18, 18, 18)
                .addComponent(w)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1168, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Withdraw.addTab("WITHDRAWL", jPanel6);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        USER1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        USER1.setText("USER-ID");

        jButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton9.setText("SHOW DETAILS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        name1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name1.setText("NAME");

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("ACCOUNT NO.");

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("AVAILABLE BALANCE");

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("TRANSFER AMOUNT");

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("CREDIT ACCOUNT");

        ta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ta1ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton10.setText("AMOUNT LEFT AFTER DEDUCTION");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        tr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tr.setText("Transfer");
        tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trActionPerformed(evt);
            }
        });

        sh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        sh.setText("CONFIRM");
        sh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shActionPerformed(evt);
            }
        });

        n1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        av1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        a1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        ca1.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        ca1.setForeground(new java.awt.Color(255, 255, 255));

        ca2.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
        ca2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(ca1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(ca2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(tr, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(sh)
                        .addGap(520, 520, 520))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(475, 475, 475)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(av1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(n1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(USER1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(280, 280, 280)
                    .addComponent(jButton9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(av1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(182, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ca1)
                                    .addComponent(ca2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(sh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tr)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(USER1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9))
                    .addGap(32, 32, 32)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(jLabel42)
                    .addGap(33, 33, 33)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        Withdraw.addTab("TRANSFER", jPanel4);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("ACCOUNT NUMBER");

        a2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        a2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("AVAILABLE BALANCE=");

        roi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("USER-ID");

        u2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("NAME");

        n2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel17.setText("RATE OF INTEREST(%)");

        av2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jButton1.setText("SHOW DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel10))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(u2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(n2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel24)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(av2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(503, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(n2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(av2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        Withdraw.addTab("VIEW BALANCE ", jPanel7);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FIRST NAME:");

        fname.setEditable(false);
        fname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        fname.setForeground(new java.awt.Color(0, 0, 0));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });

        uname.setEditable(false);
        uname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        uname.setForeground(new java.awt.Color(0, 0, 0));
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("USER-ID");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("PASSWORD");

        pname.setEditable(false);
        pname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        mnum.setEditable(false);
        mnum.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        mnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumActionPerformed(evt);
            }
        });
        mnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mnumKeyReleased(evt);
            }
        });

        email.setEditable(false);
        email.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });

        lname.setEditable(false);
        lname.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LAST NAME:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Account Number");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MOBILE NUMBER");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("EMAIL ADDRESS");

        edit.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 0, 0));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("ADDRESS");

        add.setEditable(false);
        add.setColumns(20);
        add.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        add.setRows(5);
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(add);

        sate.setEditable(false);
        sate.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        sate.setForeground(new java.awt.Color(0, 0, 0));
        sate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sateKeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("STATE");

        citi.setEditable(false);
        citi.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        citi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                citiKeyReleased(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("CITY");

        acc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        acc.setForeground(new java.awt.Color(0, 0, 0));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("PROFILE EDIT ");

        dobb.setEditable(false);
        dobb.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        dobb.setForeground(new java.awt.Color(0, 0, 0));
        dobb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dobbKeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("DATE OF BIRTH:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addGap(22, 22, 22)))
                    .addComponent(jLabel33)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sate, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(citi, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(167, 167, 167)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dobb, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(edit)
                                .addGap(67, 67, 67)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(acc, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))))
                        .addGap(0, 503, Short.MAX_VALUE)))
                .addGap(106, 106, 106))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(mnum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel30)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(dobb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 46, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edit)
                            .addComponent(jButton2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(citi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Withdraw.addTab("EDIT PROFILE DETAILS", jPanel3);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DATE:");

        date.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TIME:");

        time.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 0));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        timee.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        timee.setForeground(new java.awt.Color(0, 0, 0));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("USER-ID");

        jButton5.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jButton5.setText("SHOW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\freesnippingtool.com_capture_20201209122533.jpg")); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addGap(59, 59, 59)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel25)
                                .addGap(1, 1, 1)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timee, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(Withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)))
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(602, 602, 602)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(time)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(timee, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(Withdraw)
                .addGap(3, 3, 3)
                .addComponent(jButton4))
        );

        Withdraw.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void citiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citiKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_citiKeyReleased

    private void sateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sateKeyReleased

    }//GEN-LAST:event_sateKeyReleased

    private void addKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyReleased

    }//GEN-LAST:event_addKeyReleased

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        fname.setEditable(true);
        lname.setEditable(true);
       
        mnum.setEditable(true);
        email.setEditable(true);
        pname.setEditable(true);
        citi.setEditable(true);
        sate.setEditable(true);
        add.setEditable(true);
    }//GEN-LAST:event_editActionPerformed

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased

    }//GEN-LAST:event_lnameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased

    }//GEN-LAST:event_emailKeyReleased

    private void mnumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnumKeyReleased

    }//GEN-LAST:event_mnumKeyReleased

    private void mnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumActionPerformed

    }//GEN-LAST:event_mnumActionPerformed

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_unameKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased

    }//GEN-LAST:event_fnameKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String sql ="select*from Account where User_Id=?" ;
              
                
                try {
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);

                    st.setString(1, jTextField1.getText());
                    
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        String add0=rs.getString("Account_number");
                       acc.setText(add0);
                       String add1=rs.getString("first_name");
                       fname.setText(add1);
                         String add2=rs.getString("last_name");
                       lname.setText(add2);
                         String add3=rs.getString("User_Id");
                       uname.setText(add3);
                         String add4=rs.getString("password");
                       pname.setText(add4);
                         String add5=rs.getString("email_id");
                       email.setText(add5);
                         String add6=rs.getString("mobile_number");
                       mnum.setText(add6);
                         String add7=rs.getString("Birth_date");
                       dobb.setText(add7);
                         String add8=rs.getString("Address");
                       add.setText(add8);
                         String add9=rs.getString("City");
                       citi.setText(add9);
                         String add10=rs.getString("State");
                       sate.setText(add10);
                       rs.close();
                       st.close();
                       
                    } else {
                        JOptionPane.showMessageDialog(null, " No Account Exists of such ID");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dobbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobbKeyReleased

    }//GEN-LAST:event_dobbKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
       String value1=fname.getText();
       String value2=lname.getText();
       String value3=email.getText();
       String value4=mnum.getText();
       String value5=sate.getText();
       String value6=citi.getText();
       String value7=add.getText();
       String value8=acc.getText();
       
       String sql="Update account set first_name='"+value1+"',last_name='"+value2+"',email_id='"+value3+"',mobile_number='"+value4+"',State='"+value5+"',City='"+value6+"',Address='"+value7+"' where Account_number='"+value8+"'";
       Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                    JOptionPane.showMessageDialog(null,"PROFILE UPDATED");
                    st.execute();
       }
       
       catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
       }
       
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           try {
                        
          if (jCheckBox1.isSelected()){
           String sql="select * from balances where User_Id=?";
           
           
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                   st.setString(1,jTextField3.getText());
                    st.execute();
                  
                    
                    ResultSet rs = st.executeQuery();
                 if(rs.next()){
                 String add1=rs.getString("Name");
                 jLabel13.setText(add1);
                  String add2=rs.getString("Account_number");
                 jLabel18.setText(add2);
                  String add3=rs.getString("balance");
                 jLabel19.setText(add3);
                 rs.close();
                 st.close();
                   JOptionPane.showMessageDialog(null,"KINDLY ENTER THE AMOUNT TO BE DEPOSIT");
                 }
                 else{
                JOptionPane.showMessageDialog(null, "NO Account Exists With Such ID");  
            }
          }
          else{
JOptionPane.showMessageDialog(jButton8, "Accept Terms & condition");
}
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
           
          
         
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 try{
     
            String a1=jTextField5.getText();
            String a2=jLabel19.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jLabel22.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try{
           
            String value1=jTextField3.getText();
            String value2=jLabel22.getText();
            String sql="update Balances set balance='"+value2+"' where User_Id='"+value1+"'";
             Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
            st.execute();
            JOptionPane.showMessageDialog(null,"Deposit successful");
         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seActionPerformed
try {
                       
         
           String sql="select * from balances where User_Id=?";
           
           
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                   st.setString(1,u.getText());
                    st.execute();
                    
                  ResultSet rs = st.executeQuery();
                 if(rs.next()){
                 String add1=rs.getString("Name");
                 n.setText(add1);
                  String add2=rs.getString("Account_number");
                 a.setText(add2);
                  String add3=rs.getString("balance");
                 av.setText(add3);
                 rs.close();
                 st.close();
                  JOptionPane.showMessageDialog(null,"KINDLY SELECT Amount TO Withdraw"); 
                 }
                 else{
         JOptionPane.showMessageDialog(null, "NO Account Exists With Such ID");  
            }
         
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }        
         
           
         
         
        

    }//GEN-LAST:event_seActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
    
        try{
            String a1=av.getText();
            String a2=am.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            t.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_sActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        
        try{
            
            String a1=u.getText();
            String a2=t.getText();
            String sql="update Balances set balance='"+a2+"' where User_Id='"+a1+"'";
             Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
            st.execute();
            st=conn.prepareStatement(sql);
            st.execute();
            JOptionPane.showMessageDialog(null,"Withdraw successful");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_wActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
try {
                       
         
           String sql="select * from balances where User_Id=?";
           
           
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                   st.setString(1,u1.getText());
                    st.execute();
                    
                  ResultSet rs = st.executeQuery();
                 if(rs.next()){
                 String add1=rs.getString("Name");
                 n1.setText(add1);
                  String add2=rs.getString("Account_number");
                 a1.setText(add2);
                  String add3=rs.getString("balance");
                 av1.setText(add3);
                 rs.close();
                 st.close();
                  JOptionPane.showMessageDialog(null,"KINDLY SELECT ACCOUNT TO TRANSFER MONEY"); 
                 }
                 else{
         JOptionPane.showMessageDialog(null, "NO Account Exists With Such ID");  
            }
         
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void ta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ta1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
 try{
     
            String a1=av1.getText();
            String a2=ta1.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jLabel15.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
    }//GEN-LAST:event_jButton10ActionPerformed
public void TransferC(){
try
{
String value1=(String) jTextField2.getText();
String value2=ca2.getText();
String sql="update balances set balance='"+value2+"' where Account_number='"+value1+"'";
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");
                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                    st.execute();
                    JOptionPane.showMessageDialog(null,"SUCCESSFULLY TRANSFERED");  
             
}
catch(Exception e)
{
    
     JOptionPane.showMessageDialog(null," TRANSFERED DENIED ");
}
}
public void TransferD()
{
try
{
String value1=u1.getText();
String value2=jLabel15.getText();
String sql="update balances set balance='"+value2+"' where User_Id='"+value1+"'";
Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");
                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                    st.execute();
                     
             
}
catch(Exception e)
{
      JOptionPane.showMessageDialog(null,e);
}

}


    private void trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trActionPerformed
       TransferD();
       TransferC();
       ca1.setText(" ");
       ca2.setText(" ");
    }//GEN-LAST:event_trActionPerformed

    private void shActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shActionPerformed
try{
    
            String a1=(String) jTextField2.getText();
            String sql ="select *from balances where Account_number=?";
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
            st=conn.prepareStatement(sql);
            st.setString(1,a1);
            ResultSet rs = st.executeQuery();
            rs=st.executeQuery();
            if(rs.next()){
                String add=rs.getString("balance");
                ca1.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e );
        }       
        
        
        
        try{
     
            String a1=ta1.getText();
            String a2=ca1.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            ca2.setText(sum1);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }               
    }//GEN-LAST:event_shActionPerformed
public void Account(){
try
{
    String sql="select* from balances";
    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");
                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                    st.execute();
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                    String account =rs.getString("Account_number");
                    
                    
                    }
}
catch(Exception e)
{
}

}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        new HOMEPAGE();
         dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
                       
         
           String sql="select * from balances where User_Id=?";
           
           
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                   st.setString(1,u2.getText());
                    st.execute();
                    
                  ResultSet rs = st.executeQuery();
                 if(rs.next()){
                 String add1=rs.getString("Name");
                 n2.setText(add1);
                  String add2=rs.getString("Account_number");
                 a2.setText(add2);
                  String add3=rs.getString("balance");
                 av2.setText(add3);
                 rs.close();
                 st.close();
                 roi.setText("4%");
                  JOptionPane.showMessageDialog(null,"Balance Detail Loaded Succesfully"); 
                 }
                 else{
         JOptionPane.showMessageDialog(null, "NO Account Exists With Such ID");  
            }
         
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,e);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
try{
    
            String a1=(String) jTextField2.getText();
            String sql ="select *from balances where Account_number=?";
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
            st=conn.prepareStatement(sql);
            st.setString(1,a1);
            ResultSet rs = st.executeQuery();
            rs=st.executeQuery();
            if(rs.next()){
                String add=rs.getString("balance");
                ca1.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mypage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label USER1;
    private javax.swing.JTabbedPane Withdraw;
    private javax.swing.JTextField a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel acc;
    private javax.swing.JTextArea add;
    private javax.swing.JTextField am;
    private javax.swing.JTextField av;
    private javax.swing.JLabel av1;
    private javax.swing.JLabel av2;
    private javax.swing.JLabel ca1;
    private javax.swing.JLabel ca2;
    private javax.swing.JTextField citi;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dobb;
    private javax.swing.JButton edit;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mnum;
    private javax.swing.JTextField n;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private java.awt.Label name1;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField pname;
    private javax.swing.JLabel roi;
    private javax.swing.JButton s;
    private javax.swing.JTextField sate;
    private javax.swing.JButton se;
    private javax.swing.JButton sh;
    private javax.swing.JTextField t;
    private javax.swing.JTextField ta1;
    private javax.swing.JLabel time;
    private javax.swing.JLabel timee;
    private javax.swing.JButton tr;
    private javax.swing.JTextField u;
    private javax.swing.JTextField u1;
    private javax.swing.JTextField u2;
    private javax.swing.JTextField uname;
    private javax.swing.JButton w;
    // End of variables declaration//GEN-END:variables
}
