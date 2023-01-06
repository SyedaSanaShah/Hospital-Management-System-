package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DoctorDetail extends javax.swing.JFrame {

    DoctorLogin obj;
    private static Statement st;
    private static ResultSet rs;
    private boolean check = false;
    private static Connection con;
    private static PreparedStatement stmt;
    private static String tableName = "doctor";
    DatabaseConnection dbcon = new DatabaseConnection();

    public DoctorDetail() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        con = dbcon.returnConnectionObject();
        stmt = dbcon.returnPreparedStatementObject();
        st = dbcon.returnStatementObject();
        obj = new DoctorLogin();
        d_idjTextField.setText(String.valueOf(obj.d_id));
        d_number.setText(obj.d_number);
        d_salary.setText(String.valueOf(obj.d_salary));
        d_dept.setText(obj.d_dept);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctor_id = new javax.swing.JLabel();
        doctor_number = new javax.swing.JLabel();
        doctor_salary = new javax.swing.JLabel();
        doctor_department = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        logout_button = new javax.swing.JButton();
        show_button = new javax.swing.JButton();
        patientDetail = new javax.swing.JLabel();
        doctorDetail = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patient_detailjTable = new javax.swing.JTable();
        d_idjTextField = new javax.swing.JLabel();
        d_number = new javax.swing.JLabel();
        d_dept = new javax.swing.JLabel();
        d_salary = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id.setText("ID");
        getContentPane().add(doctor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 112, 45));

        doctor_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_number.setText("Phone number");
        getContentPane().add(doctor_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 112, 34));

        doctor_salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_salary.setText("Salary");
        getContentPane().add(doctor_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 112, 36));

        doctor_department.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_department.setText("Department ");
        getContentPane().add(doctor_department, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 112, 40));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 113, 53));

        logout_button.setBackground(new java.awt.Color(222, 222, 240));
        logout_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout_button.setText("Log out");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(logout_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 113, 53));

        show_button.setBackground(new java.awt.Color(222, 222, 240));
        show_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_button.setText("Show ");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(show_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 113, 53));

        patientDetail.setBackground(new java.awt.Color(222, 222, 240));
        patientDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientDetail.setText("Patient detail");
        getContentPane().add(patientDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 140, 40));

        doctorDetail.setBackground(new java.awt.Color(222, 222, 240));
        doctorDetail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorDetail.setText("Personal detail");
        getContentPane().add(doctorDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 160, 40));

        patient_detailjTable.setBackground(new java.awt.Color(222, 222, 240));
        patient_detailjTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_detailjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "patient id", "patient name", "patient age", "patient number"
            }
        ));
        jScrollPane1.setViewportView(patient_detailjTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 400, 140));

        d_idjTextField.setBackground(new java.awt.Color(222, 222, 240));
        d_idjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(d_idjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 150, 30));

        d_number.setBackground(new java.awt.Color(222, 222, 240));
        d_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(d_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 30));

        d_dept.setBackground(new java.awt.Color(222, 222, 240));
        d_dept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(d_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 30));

        d_salary.setBackground(new java.awt.Color(222, 222, 240));
        d_salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(d_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new DoctorLogin().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StatusTypeWindow().setVisible(true);
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM patient WHERE d_id='" + obj.d_id+ "'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String p_id = String.valueOf(rs.getInt(1));
                String p_name = rs.getString(3);
                String p_age = String.valueOf(rs.getInt(5));
                String p_number = rs.getString(6);
                String obj[] = {p_id, p_name, p_age, p_number};
                DefaultTableModel dtm = (DefaultTableModel) patient_detailjTable.getModel();
                dtm.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoctorDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_show_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel d_dept;
    private javax.swing.JLabel d_idjTextField;
    private javax.swing.JLabel d_number;
    private javax.swing.JLabel d_salary;
    private javax.swing.JLabel doctorDetail;
    private javax.swing.JLabel doctor_department;
    private javax.swing.JLabel doctor_id;
    private javax.swing.JLabel doctor_number;
    private javax.swing.JLabel doctor_salary;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_button;
    private javax.swing.JLabel patientDetail;
    private javax.swing.JTable patient_detailjTable;
    private javax.swing.JButton show_button;
    // End of variables declaration//GEN-END:variables
}
