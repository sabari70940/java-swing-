/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class NewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form NewAdmin
     */
    public NewAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_aname = new javax.swing.JTextField();
        txt_auname = new javax.swing.JTextField();
        txt_apwd = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Admin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(142, 23, 99, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(82, 69, 70, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Admin User Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(51, 115, 101, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(56, 163, 91, 16);

        txt_aname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_anameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_aname);
        txt_aname.setBounds(164, 66, 148, 22);

        txt_auname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_auname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aunameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_auname);
        txt_auname.setBounds(164, 112, 148, 22);

        txt_apwd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_apwd);
        txt_apwd.setBounds(165, 160, 148, 22);

        btn_submit.setBackground(new java.awt.Color(0, 255, 0));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_submit.setText("submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit);
        btn_submit.setBounds(102, 223, 72, 23);

        btn_login.setBackground(new java.awt.Color(0, 153, 153));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_login.setText("login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(207, 223, 72, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/redblack (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 390, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_anameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_anameActionPerformed

    private void txt_aunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aunameActionPerformed
       PreparedStatement pst =null;
    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
       try
       {
           String name=txt_aname.getText();
           String uname=txt_auname.getText();
           String apwd=txt_apwd.getText();
           System.out.println("done");
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection conn= DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;"+ "databaseName=gym;"+"TrustServerCertificate=True;user=gym;password=gym");
           System.out.println("connection done");
           String sql="sp_anewuser?,?,?";
           
           pst=conn.prepareStatement(sql);
           pst.setString(1,name );
           pst.setString(2,uname);
           pst.setString(3, apwd);
            System.out.println("data inserted");
       
           int i=pst.executeUpdate();
             System.out.println("Query updated");
           if(i==0)
           {
            JOptionPane.showMessageDialog(null,"data inserted");
          
           }
           else
           {
            JOptionPane.showMessageDialog(null,"data not inserted");
           } 
          
           }
       catch(Exception ex)
           {
            JOptionPane.showMessageDialog(null,"try again");
           }
        
        
        
        
        
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
             dispose();
                login  Login=new login();
                Login.setVisible(true);
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_aname;
    private javax.swing.JTextField txt_apwd;
    private javax.swing.JTextField txt_auname;
    // End of variables declaration//GEN-END:variables
}
