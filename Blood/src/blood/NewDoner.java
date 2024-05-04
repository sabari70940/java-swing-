/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class NewDoner extends javax.swing.JFrame {

    /**
     * Creates new form NewDoner
     */
    public NewDoner() {
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

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_dname = new javax.swing.JTextField();
        combo_bgroup = new javax.swing.JComboBox<>();
        txt_age = new javax.swing.JTextField();
        combo_gender = new javax.swing.JComboBox<>();
        txt_mob = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Doner Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 25, 126, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Doner Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 71, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Blood Group");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 70, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 100, 22, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 50, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(350, 160, 44, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Mobile Number");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(312, 274, 87, 16);

        btn_submit.setBackground(new java.awt.Color(102, 255, 102));
        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_submit.setText("submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit);
        btn_submit.setBounds(90, 310, 173, 23);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 380, 173, 23);

        txt_dname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_dname);
        txt_dname.setBounds(100, 100, 178, 22);

        combo_bgroup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combo_bgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(combo_bgroup);
        combo_bgroup.setBounds(100, 160, 72, 22);

        txt_age.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_age);
        txt_age.setBounds(420, 100, 72, 22);

        combo_gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        getContentPane().add(combo_gender);
        combo_gender.setBounds(100, 230, 77, 22);

        txt_mob.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mobActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mob);
        txt_mob.setBounds(419, 271, 178, 22);

        txt_address.setColumns(20);
        txt_address.setRows(5);
        jScrollPane2.setViewportView(txt_address);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(415, 158, 234, 86);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/image-700x600.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 660, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mobActionPerformed
        PreparedStatement pst = null;
    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
                
         try {
        String donername = txt_dname.getText();
        String bloodgroup = (String) combo_bgroup.getSelectedItem();
        String age = txt_age.getText();
        String gender = (String) combo_gender.getSelectedItem();
        String address = txt_address.getText();
        String mobilenumber = txt_mob.getText();
        
    
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-BLBGEHJ;databaseName=blood;TrustServerCertificate=True;user=saba;password=saba");
        System.out.println("connection done");
        String sql = "exec sp_addnewuser ?,?,?,?,?,?";
        
        pst = conn.prepareStatement(sql);
        pst.setString(1, donername);
        pst.setString(2, bloodgroup);
        pst.setString(3, age);
        pst.setString(4, gender);
        pst.setString(5, address);
        pst.setString(6, mobilenumber);
        
        System.out.println("data insert");
        int i = pst.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(null, "data inserted");
        } else {
            JOptionPane.showMessageDialog(null, "data not inserted");
        }
        System.out.println("if else completed");
    } catch (Exception ex) { 
        System.out.println(ex);
        // JOptionPane.showMessageDialog(null,ex.toString());
    }
        
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
      dispose();
        home HOME=new home();
        HOME.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewDoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewDoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewDoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewDoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewDoner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> combo_bgroup;
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_dname;
    private javax.swing.JTextField txt_mob;
    // End of variables declaration//GEN-END:variables
}
