
package iBanking;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class HOMEPAGE extends javax.swing.JFrame {

    
    public HOMEPAGE() {
        initComponents();
       Calendar();
        
    }
public void Calendar(){
Calendar cal=new GregorianCalendar();
int month=cal.get(Calendar.MONTH);
int year=cal.get(Calendar.YEAR);
int day=cal.get(Calendar.DAY_OF_MONTH);
date.setText(+day+"-"+(+month+1)+"-"+year);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(204, 255, 204));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("WELCOME TO iBANKING !!!");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 340, 80));

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("CHOOSE YOUR MODE OF LOGIN!!");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, 30));

        jButton3.setBackground(new java.awt.Color(51, 0, 51));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("RUN AS ADMINISTRATOR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, 19));

        jButton4.setBackground(new java.awt.Color(51, 0, 51));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("USER'S LOGIN ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 160, 30));

        jLabel29.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("DATE:");
        panel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        date1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        date1.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 49, -1, -1));

        date.setFont(new java.awt.Font("Arial Black", 3, 11)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 120, 15));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\download.jpg")); // NOI18N
        jLabel3.setToolTipText("");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 1010, 630));

        jLabel5.setText("jLabel5");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 250, 180));

        jLabel6.setText("jLabel6");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jLabel7.setText("Internet Banking Service: \"iBanking Services\" is an online internet banking facility introduced for rendering effective customer service on 24 X 7 basis. ");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 280, 120));

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panel1.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 880, 20));

        jLabel4.setBackground(new java.awt.Color(153, 0, 204));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("iBanking Services Welcomes you !! Kindly Choose  the Mode of Your Login And Proceed Further to Our facilities!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new LOGINEMPLOYEEE();
dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new LOGINADMIN_1();
       
         
                
    }//GEN-LAST:event_jButton3ActionPerformed
 private void jButton3ActionListener(java.awt.event.ActionEvent evt){
        new LOGINADMIN_1().setVisible(true);
 }
 
     
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOMEPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMEPAGE().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
