 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Admin
 */
public class Trainer extends javax.swing.JFrame {

    private PreparedStatement notnull;

    /**
     * Creates new form Trainer
     */
    public Trainer() {
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

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cname = new javax.swing.JTextField();
        txt_pnumber = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainer_table = new javax.swing.JTable();
        txt_add = new javax.swing.JButton();
        txt_exit = new javax.swing.JButton();
        txt_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_fetch = new javax.swing.JButton();
        combo_gender = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_address = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_delete1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/black-2560X1600-wallpaper-4p1ao5qbp1t2gwg7.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Trainers");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 10, 192, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Coach Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 80, 69, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 80, 84, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Age");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(680, 80, 22, 16);

        txt_cname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cnameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cname);
        txt_cname.setBounds(150, 110, 150, 22);

        txt_pnumber.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_pnumber);
        txt_pnumber.setBounds(390, 110, 150, 22);

        txt_age.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });
        getContentPane().add(txt_age);
        txt_age.setBounds(630, 110, 150, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 200, 44, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(491, 158, 42, 16);

        trainer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Coach name", "Coach Number", "Age", "Address", "Gender", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(trainer_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 733, 340);

        txt_add.setBackground(new java.awt.Color(0, 204, 255));
        txt_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_add.setText("Add");
        txt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addActionPerformed(evt);
            }
        });
        getContentPane().add(txt_add);
        txt_add.setBounds(210, 280, 132, 23);

        txt_exit.setBackground(new java.awt.Color(255, 153, 255));
        txt_exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_exit.setText("Edit");
        txt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_exitActionPerformed(evt);
            }
        });
        getContentPane().add(txt_exit);
        txt_exit.setBounds(430, 280, 132, 23);

        txt_delete.setBackground(new java.awt.Color(255, 102, 102));
        txt_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_delete.setText("Delete");
        txt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_delete);
        txt_delete.setBounds(620, 280, 132, 23);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Coach List");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 330, 101, 25);

        txt_fetch.setBackground(new java.awt.Color(51, 51, 255));
        txt_fetch.setText("fetch");
        txt_fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fetchActionPerformed(evt);
            }
        });
        getContentPane().add(txt_fetch);
        txt_fetch.setBounds(20, 280, 132, 23);

        combo_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", " " }));
        getContentPane().add(combo_gender);
        combo_gender.setBounds(491, 186, 77, 22);

        txt_address.setColumns(20);
        txt_address.setRows(5);
        jScrollPane2.setViewportView(txt_address);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(170, 170, 234, 86);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 80, 13, 16);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(20, 110, 64, 22);

        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(590, 70, 43, 16);

        txt_delete1.setBackground(new java.awt.Color(255, 102, 102));
        txt_delete1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_delete1.setText("x");
        txt_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_delete1);
        txt_delete1.setBounds(752, 0, 60, 39);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gym/black-2560X1600-wallpaper-4p1ao5qbp1t2gwg7.jpeg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 810, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cnameActionPerformed

    private void txt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addActionPerformed
        // TODO add your handling code here:
       
        try {
            String trainer_id = txt_id.getText();
            String cname = txt_cname.getText();
            String cnumber = txt_pnumber.getText();
            String age = txt_age.getText();
            String address = txt_address.getText();
            String gender = (String) combo_gender.getSelectedItem();
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-BLBGEHJ;databaseName=gym;TrustServerCertificate=True;user=gym;password=gym");
            String sql = "sp_addtrainer ?,?,?,?,?,?";
                PreparedStatement pst = null;
            pst = conn.prepareStatement(sql);
            pst.setString(1, trainer_id);
            pst.setString(2, cname);
            pst.setString(3, cnumber);
            pst.setString(4, age);
            pst.setString(5, address);
            pst.setString(6, gender);

            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "data inserted");
            } else {
                JOptionPane.showMessageDialog(null, "data not inserted");
            }
            System.out.println("if else completed");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "try again");

        }


    }//GEN-LAST:event_txt_addActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fetchActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-BLBGEHJ;databaseName=gym;TrustServerCertificate=True;user=gym;password=gym");
            String sql = "sp_fetchtrainer";
            PreparedStatement pst = null;
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            trainer_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_txt_fetchActionPerformed

    private void txt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_exitActionPerformed
        // TODO add your handling code here:
        try {
    String trainer_id = txt_id.getText();
    String cname = txt_cname.getText();
    String cnumber = txt_pnumber.getText();
    String age = txt_age.getText();
    String address = txt_address.getText();
    String gender = (String) combo_gender.getSelectedItem();

    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-BLBGEHJ;databaseName=gym;TrustServerCertificate=True;user=gym;password=gym");

    String sql = "exec sp_updatetrainer ?,?,?,?,?,?";
    PreparedStatement pst = conn.prepareStatement(sql); // Initialize PreparedStatement here

    pst.setString(1, trainer_id);
    pst.setString(2, cname);
    pst.setString(3, cnumber);
    pst.setString(4, age);
    pst.setString(5, address);
    pst.setString(6, gender);

    int i = pst.executeUpdate();
    if (i == 0) {
        JOptionPane.showMessageDialog(null, "Data not inserted");
    } else {
        JOptionPane.showMessageDialog(null, "Data inserted successfully");
    }
} catch (Exception ex) {
  //  JOptionPane.showMessageDialog(null, ex);
                System.out.println(ex);
    
}


    }//GEN-LAST:event_txt_exitActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_deleteActionPerformed

        try {
            String trainer_id = txt_id.getText();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-BLBGEHJ;databaseName=gym;TrustServerCertificate=True;user=gym;password=gym");
            String sql = "exec sp_trainerdelete ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, trainer_id);

           int i=pst.executeUpdate(); 
           JOptionPane.showMessageDialog(null, "deleted Successful !", "Success", JOptionPane.DEFAULT_OPTION);
    
        }catch(Exception e)
        {
                        
            System.out.print(e);

        }
    }//GEN-LAST:event_txt_deleteActionPerformed

    private void txt_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_delete1ActionPerformed
        // TODO add your handling code here:
          dispose();
                home Home=new home();
                Home.setVisible(true);
    }//GEN-LAST:event_txt_delete1ActionPerformed

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
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable trainer_table;
    private javax.swing.JButton txt_add;
    private javax.swing.JTextArea txt_address;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_cname;
    private javax.swing.JButton txt_delete;
    private javax.swing.JButton txt_delete1;
    private javax.swing.JButton txt_exit;
    private javax.swing.JButton txt_fetch;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_pnumber;
    // End of variables declaration//GEN-END:variables
}
