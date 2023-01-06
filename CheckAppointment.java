package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CheckAppointment extends javax.swing.JFrame {

    private int p_id = 0;
    private int d_id = 0;
    private static Statement st;
    private static ResultSet rs;
    private boolean check = false;
    private static Connection con;
    private String appointment_t = null;
    private static PreparedStatement stmt;
    private String appointment_date = null;
    private static String tableName = "appointment";
    DatabaseConnection dbcon = new DatabaseConnection();

    public CheckAppointment() {
         super("Check Appoinement");
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
        patient_idTextField.setText(" ");
        doctor_idTextField.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        patient_id = new javax.swing.JLabel();
        doctor_id = new javax.swing.JLabel();
        patient_idTextField = new javax.swing.JTextField();
        doctor_idTextField = new javax.swing.JTextField();
        check_appointment = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patient_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_id.setText("Enter Patient ID");
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 175, 120, 33));

        doctor_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id.setText("Enter Doctor ID");
        getContentPane().add(doctor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 35));

        patient_idTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_idTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patient_idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 33));

        doctor_idTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_idTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 35));

        check_appointment.setBackground(new java.awt.Color(222, 222, 240));
        check_appointment.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check_appointment.setText("Check Appointment");
        check_appointment.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        check_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_appointmentActionPerformed(evt);
            }
        });
        getContentPane().add(check_appointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 200, 40));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 140, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patient_idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_idTextFieldActionPerformed

    private void doctor_idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_idTextFieldActionPerformed

    private void check_appointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_appointmentActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM " + tableName;
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(patient_idTextField.getText()) && rs.getInt(4) ==  Integer.parseInt(doctor_idTextField.getText())) {
                    check = true;
                    appointment_date = rs.getString(5);
                    appointment_t = rs.getString(6);
                    break;
                }
            }
            if (check) {
                JOptionPane.showMessageDialog(null, "Appointment Schedule!\n " + appointment_date + " at " + appointment_t + " !");
            } else {
                JOptionPane.showMessageDialog(null, "Appointment of patient_id " + p_id + " is not found !");
            }
            setAllTextFieldsToNull();
        } catch (SQLException ex) {
            Logger.getLogger(CheckAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_check_appointmentActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        setVisible(false);
        new ReceptionistWindow().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton check_appointment;
    private javax.swing.JLabel doctor_id;
    private javax.swing.JTextField doctor_idTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel patient_id;
    private javax.swing.JTextField patient_idTextField;
    // End of variables declaration//GEN-END:variables
}
