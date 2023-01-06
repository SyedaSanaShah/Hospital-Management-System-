package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DoctorLogin extends javax.swing.JFrame {

    public static int d_id = 0;
    public static String d_name = " ";
    public static String d_dept = " ";
    public static String d_number = " ";
    public static int d_salary = 0;
    private String d_password = " ";
    private static Statement st;
    private static ResultSet rs;
    private boolean check = false;
    private static Connection con;
    private static PreparedStatement stmt;
    private static String tableName = "doctor";
    DatabaseConnection dbcon = new DatabaseConnection();

    public DoctorLogin() {
         super("Doctor Login");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        con = dbcon.returnConnectionObject();
        stmt = dbcon.returnPreparedStatementObject();
        st = dbcon.returnStatementObject();
    }

    private void setAllTextFieldsToNull() {
        doctor_usernamejTextField.setText("");
        doctor_passwordjPasswordField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctor_username = new javax.swing.JLabel();
        doctor_password = new javax.swing.JLabel();
        doctor_usernamejTextField = new javax.swing.JTextField();
        doctor_passwordjPasswordField = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_username.setText("Username");
        getContentPane().add(doctor_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        doctor_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_password.setText("Password");
        getContentPane().add(doctor_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        doctor_usernamejTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_usernamejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(doctor_usernamejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 113, 150, 37));

        doctor_passwordjPasswordField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_passwordjPasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_passwordjPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_passwordjPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_passwordjPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 202, 150, 40));

        login_button.setBackground(new java.awt.Color(222, 222, 240));
        login_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 120, 50));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 120, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\doctor3-removebg.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 210, 230));

        jLabel5.setBackground(new java.awt.Color(222, 222, 240));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctor_passwordjPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_passwordjPasswordFieldActionPerformed
        // TODO add your handling code here:
        d_password = doctor_passwordjPasswordField.getText();
    }//GEN-LAST:event_doctor_passwordjPasswordFieldActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StatusTypeWindow().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM " + tableName;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                d_name = doctor_usernamejTextField.getText();
                d_password = doctor_passwordjPasswordField.getText();

                if (d_name.equals(rs.getString(2)) && d_password.equals(rs.getString(7))) {
                    JOptionPane.showMessageDialog(null, "Successfull !");
                    d_id = rs.getInt(1);
                    d_name = rs.getString(2);
                    d_salary = rs.getInt(5);
                    d_number = rs.getString(4);
                    d_dept = rs.getString(6);
                    d_password = rs.getString(7);
                    setVisible(false);
                    new DoctorDetail().setVisible(true);
                } else if (d_name.equals("") || d_password.equals("")) {
                    //JOptionPane.showMessageDialog(null, "All fields are mendatory!");
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username, id or password !");
                }
                setAllTextFieldsToNull();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_login_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel doctor_password;
    private javax.swing.JPasswordField doctor_passwordjPasswordField;
    private javax.swing.JLabel doctor_username;
    private javax.swing.JTextField doctor_usernamejTextField;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login_button;
    // End of variables declaration//GEN-END:variables
}
