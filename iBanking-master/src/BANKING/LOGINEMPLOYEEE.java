
package BANKING;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class LOGINEMPLOYEEE extends javax.swing.JFrame {

    public LOGINEMPLOYEEE() {
        initComponents();
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        login = new javax.swing.JButton();
        pname = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setPreferredSize(new java.awt.Dimension(600, 300));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\Login.png")); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        panel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 100, 40));

        pname.setBackground(new java.awt.Color(255, 255, 255));
        pname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        panel1.add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 190, 30));

        uname.setBackground(new java.awt.Color(255, 255, 255));
        uname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        uname.setActionCommand("<Not Set>");
        panel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 190, 31));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USER-ID");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 123, 31));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PASSWORD");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 123, 31));

        jLabel5.setBackground(new java.awt.Color(153, 0, 153));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\user-login-landing-page_23-2148267061.jpg")); // NOI18N
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 600, 130));

        jButton2.setText("CREATE NEW ACCOUNT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 180, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("WELCOME TO iBANKING!!");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("New to iBanking Service?");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 190, 30));

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\bank.jpg")); // NOI18N
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 50, 30));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\download.png")); // NOI18N
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 40, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Desktop\\bank\\i.jpg")); // NOI18N
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new signup ();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String User_Id = uname.getText();
                String password = pname.getText(); 
                
                try {
                    Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                        "root", "Preet1234");

                    PreparedStatement st = (PreparedStatement) conn
                        .prepareStatement("Select User_Id, password from account where User_Id=? and password=?");

                    st.setString(1, User_Id);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                       ProgressBar ob=new ProgressBar();
                       ob.setUpProgressBar();
                        Mypage ah = new Mypage();
                         dispose();
                        ah.setTitle("Welcome");
                        ah.setVisible(true);
                        JOptionPane.showMessageDialog(login, "You have successfully logged in");
                    } else {
                        JOptionPane.showMessageDialog(login, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
    }//GEN-LAST:event_loginActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGINEMPLOYEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINEMPLOYEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINEMPLOYEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINEMPLOYEEE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINEMPLOYEEE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton login;
    private java.awt.Panel panel1;
    private javax.swing.JPasswordField pname;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
