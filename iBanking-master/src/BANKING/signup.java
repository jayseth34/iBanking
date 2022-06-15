
package BANKING;

import java.util.regex.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Random;

import javax.swing.JOptionPane;
public class signup extends javax.swing.JFrame {

   
    public signup() {
        initComponents();
        setVisible(true);
        RandomAcc();
    }
    
   public void Bal() {
       try{
  
           
        String name=fastname.getText();
        String Account_number =acc.getText();
        String balance=am.getText();
        String User_Id = userid.getText();
   Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");
    
    String sql = "INSERT INTO balances values('" + name + "','" + Account_number + "','" + balance +"','" + User_Id + "')";
     
     PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement(sql);
                    st.execute();
                    
                 
                  st.close();
                          
       }
       catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
       }
       }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailadd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fastname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        pass = new javax.swing.JPasswordField();
        ival = new javax.swing.JLabel();
        ival1 = new javax.swing.JLabel();
        ival2 = new javax.swing.JLabel();
        ival3 = new javax.swing.JLabel();
        ival4 = new javax.swing.JLabel();
        ival5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dobb = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        citi = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        sate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        Dob = new javax.swing.JLabel();
        ival6 = new javax.swing.JLabel();
        ival7 = new javax.swing.JLabel();
        ival8 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        ival9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("NEW USER REGISTERATION FORM!!");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FIRST NAME:");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 206, 78, -1));

        emailadd.setForeground(new java.awt.Color(0, 0, 0));
        emailadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailaddKeyReleased(evt);
            }
        });
        panel1.add(emailadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 297, 184, 31));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("LAST NAME:");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 253, -1, -1));

        fastname.setForeground(new java.awt.Color(0, 0, 0));
        fastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastnameActionPerformed(evt);
            }
        });
        fastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fastnameKeyReleased(evt);
            }
        });
        panel1.add(fastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 200, 184, 27));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("EMAIL ADDRESS:");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 305, 97, -1));

        lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastnameKeyReleased(evt);
            }
        });
        panel1.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 245, 184, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("WELCOME TO iBANKING");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, 337, 44));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*ALL FIELDS ARE COMPULSORY !!");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 81, 207, 25));

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("APPLICATION FORM");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 112, 138, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 573, 118, 76));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("USER-ID");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 206, 78, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("MOBILE NUMBER");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 299, -1, -1));

        userid.setForeground(new java.awt.Color(0, 0, 0));
        userid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                useridKeyReleased(evt);
            }
        });
        panel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 196, 211, 31));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("PASSWORD");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 254, -1, -1));

        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        mob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobKeyReleased(evt);
            }
        });
        panel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 291, 211, 32));

        jCheckBox1.setText("All Details are true best with respect of my knowledge");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 532, 353, -1));

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        panel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 245, 211, 34));

        ival.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival.setForeground(new java.awt.Color(255, 0, 0));
        panel1.add(ival, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 200, 128, 23));

        ival1.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival1.setForeground(new java.awt.Color(255, 0, 0));
        panel1.add(ival1, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 245, 128, 23));

        ival2.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival2.setForeground(new java.awt.Color(204, 0, 0));
        panel1.add(ival2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 402, 137, 26));

        ival3.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival3.setForeground(new java.awt.Color(255, 0, 0));
        panel1.add(ival3, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 196, 146, 26));

        ival4.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival4.setForeground(new java.awt.Color(255, 0, 0));
        ival4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ival4KeyReleased(evt);
            }
        });
        panel1.add(ival4, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 245, 146, 26));

        ival5.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival5.setForeground(new java.awt.Color(255, 0, 0));
        ival5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ival5KeyReleased(evt);
            }
        });
        panel1.add(ival5, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 297, 173, 26));

        jButton3.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 599, 105, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 599, 84, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Account Number");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 140, -1, -1));

        acc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        acc.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 134, 127, 25));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("DATE OF BIRTH:");
        panel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 374, -1, -1));

        dobb.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        dobb.setForeground(new java.awt.Color(0, 0, 0));
        dobb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dobbKeyReleased(evt);
            }
        });
        panel1.add(dobb, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 366, 184, 30));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("ADDRESS");
        panel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 374, 67, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("CITY");
        panel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 473, -1, -1));

        citi.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        citi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                citiKeyReleased(evt);
            }
        });
        panel1.add(citi, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 468, 82, 25));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("STATE");
        panel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 473, -1, -1));

        sate.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        sate.setForeground(new java.awt.Color(0, 0, 0));
        sate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sateKeyReleased(evt);
            }
        });
        panel1.add(sate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 468, 97, 25));

        add.setColumns(20);
        add.setRows(5);
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(add);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 366, 203, -1));

        Dob.setFont(new java.awt.Font("Dialog", 3, 10)); // NOI18N
        Dob.setForeground(new java.awt.Color(255, 0, 0));
        Dob.setText("Atleast 18 years of AGE ");
        panel1.add(Dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 375, 128, -1));

        ival6.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival6.setForeground(new java.awt.Color(204, 0, 0));
        ival6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ival6KeyReleased(evt);
            }
        });
        panel1.add(ival6, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 499, 132, 26));

        ival7.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival7.setForeground(new java.awt.Color(204, 0, 0));
        ival7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ival7KeyReleased(evt);
            }
        });
        panel1.add(ival7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 499, 205, 26));

        ival8.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival8.setForeground(new java.awt.Color(255, 0, 0));
        ival8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ival8KeyReleased(evt);
            }
        });
        panel1.add(ival8, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 382, 146, 31));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(153, 0, 0));
        jLabel32.setText("Format:-YYYY-MM-DD");
        panel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 402, -1, 10));

        ival9.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        ival9.setForeground(new java.awt.Color(204, 0, 0));
        panel1.add(ival9, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 310, 400, 26));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("AMOUNT");
        panel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 473, -1, -1));

        am.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        am.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(am, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 471, 55, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 0));
        jLabel13.setText("MINIMUM INR 500 MONEY SHOULD BE DEPOSITED AT TIME OF ACCOUNT CREATION");
        panel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 473, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\i.jpg")); // NOI18N
        panel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 650));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\freesnippingtool.com_capture_20201209122526.jpg")); // NOI18N
        panel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 100, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new LOGINEMPLOYEEE ();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        fastname.setText("");
        lastname.setText("");
        userid.setText("");
        emailadd.setText("");
        pass.setText("");
        mob.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ival5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ival5KeyReleased

    }//GEN-LAST:event_ival5KeyReleased

    private void ival4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ival4KeyReleased

    }//GEN-LAST:event_ival4KeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        String PATTERN="^[a-zA-Z0-9]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(pass.getText());
        if(!match.matches()){
            ival4.setText("Password Format incorrect");
        }
        else{ival4.setText(null);}
    }//GEN-LAST:event_passKeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void mobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobKeyReleased
        String PATTERN="^[0-9]{0,10}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(mob.getText());
        if(!match.matches()){
            ival5.setText("Mobile number Format incorrect");
        }
        else{ival5.setText(null); }
    }//GEN-LAST:event_mobKeyReleased

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed

    }//GEN-LAST:event_mobActionPerformed

    private void useridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useridKeyReleased
        String PATTERN="^[a-zA-Z0-9]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(userid.getText());
        if(!match.matches()){
            ival3.setText("UserName Format incorrect");
        }
        else{ival3.setText(null); }        // TODO add your handling code here:
    }//GEN-LAST:event_useridKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String first_name=fastname.getText();
        String last_name = lastname.getText();
        String email_id = emailadd.getText();
        String User_Id = userid.getText();
        String mobile_number = mob.getText();
        String Password = pass.getText();
        String Account_number =acc.getText();
        String Address = add.getText();
        String Birth_date = dobb.getText();
        String City = citi.getText();
        String State = sate.getText();
        
        
        
if (jCheckBox1.isSelected()){
        if(fastname.getText().trim().isEmpty())
        {
            ival.setText("Name is empty");
        }
        if(lastname.getText().trim().isEmpty())
        {
            ival1.setText("Lastname is empty");
        }
        if(emailadd.getText().trim().isEmpty())
        {
            ival9.setText("Email is empty");
        }
        if(userid.getText().trim().isEmpty())
        {
            ival3.setText("Username is empty");
        }
        if(pass.getText().trim().isEmpty())
        {
            ival4.setText("Password is empty");
        }
        if(mob.getText().trim().isEmpty())
        {
            ival5.setText("Mobile Number is empty ");
        }
        if(sate.getText().trim().isEmpty())
        {
            ival6.setText("State is empty ");
        }
        if(citi.getText().trim().isEmpty())
        {
            ival7.setText("City is empty ");
        }
         if(add.getText().trim().isEmpty())
        {
            ival8.setText("Address is empty ");
        }
       
         
         

        else {
            try {
                String msg = "" + first_name;
                msg += " \n";
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "Preet1234");

                String query = "INSERT INTO account values('" + Account_number + "','" + first_name + "','" + last_name + "','" + User_Id + "','" + Password + "','" + email_id + "','" + mobile_number + "','" + Birth_date + "','" + Address + "','" + City + "','" + State + "')";

              
                Statement sta = conn.createStatement();
                
           
                int x = sta.executeUpdate(query);
                if (x == 0) {
                    JOptionPane.showMessageDialog(jButton1, "This is already exist");
                } else {
                    JOptionPane.showMessageDialog(jButton1,
                        "Welcome, " + msg + "Registeration done successfully!! Proceed to login.");
                }
                conn.close();
                Bal();
            } catch (Exception exception) {
                
                JOptionPane.showMessageDialog( jButton1, "Account Already Exists With same Credentials");
            new LOGINEMPLOYEEE();
                           this.dispose();

            }
            

        }}
else{
JOptionPane.showMessageDialog(jButton1, "Accept Terms & condition");
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastnameKeyReleased
        String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(lastname.getText());
        if(!match.matches()){
            ival1.setText("LastName Format incorrect");
        }
        else{ival1.setText(null); }
    }//GEN-LAST:event_lastnameKeyReleased

    private void fastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fastnameKeyReleased
        String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(fastname.getText());
        if(!match.matches()){
            ival.setText("Naming Format incorrect");
        }
        else{ival.setText(null); }
    }//GEN-LAST:event_fastnameKeyReleased

    private void fastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastnameActionPerformed

    }//GEN-LAST:event_fastnameActionPerformed

    private void emailaddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailaddKeyReleased
        String PATTERN="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(emailadd.getText());
        if(!match.matches()){
            ival9.setText("Email Format incorrect");
        }
        else{ival9.setText(null); }
    }//GEN-LAST:event_emailaddKeyReleased

    private void ival6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ival6KeyReleased
        
    }//GEN-LAST:event_ival6KeyReleased

    private void ival7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ival7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ival7KeyReleased

    private void ival8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ival8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ival8KeyReleased

    private void addKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyReleased
 String PATTERN="^[a-zA-Z0-9 ,/]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(add.getText());
        if(!match.matches()){
            ival8.setText("Address Format incorrect");
        }
        else{ival8.setText(null); }
        
     
    }//GEN-LAST:event_addKeyReleased

    private void citiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citiKeyReleased
 String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(citi.getText());
        if(!match.matches()){
            ival7.setText("City Format incorrect");
        }
        else{ival7.setText(null); }         // TODO add your handling code here:
    }//GEN-LAST:event_citiKeyReleased

    private void sateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sateKeyReleased
         String PATTERN="^[a-zA-Z]{3,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(sate.getText());
        if(!match.matches()){
            ival6.setText("State Format incorrect");
        }
        else{ival6.setText(null); } 
    }//GEN-LAST:event_sateKeyReleased

    private void dobbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobbKeyReleased
 

	
    }//GEN-LAST:event_dobbKeyReleased

    
    public void RandomAcc(){
Random ra=new Random();
acc.setText(""+ra.nextInt(100000000+1));


}
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dob;
    private javax.swing.JLabel acc;
    private javax.swing.JTextArea add;
    private javax.swing.JTextField am;
    private javax.swing.JTextField citi;
    private javax.swing.JTextField dobb;
    private javax.swing.JTextField emailadd;
    private javax.swing.JTextField fastname;
    private javax.swing.JLabel ival;
    private javax.swing.JLabel ival1;
    private javax.swing.JLabel ival2;
    private javax.swing.JLabel ival3;
    private javax.swing.JLabel ival4;
    private javax.swing.JLabel ival5;
    private javax.swing.JLabel ival6;
    private javax.swing.JLabel ival7;
    private javax.swing.JLabel ival8;
    private javax.swing.JLabel ival9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mob;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField sate;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
