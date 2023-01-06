package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Outpatient extends javax.swing.JFrame {

    private int p_id = 0;
    private int d_id = 0;
    private int p_age = 0;
    private int p_room = 0;
    private static Statement st;
    private static ResultSet rs;
    private static Connection con;
    private String p_name = null;
    private String p_gender = null;
    private String p_number = null;
    private String p_address = null;
    private static PreparedStatement stmt;
    private String p_admitdate = null;
    private String p_dischargedate = null;
    private static String tableName = "patient";
    DatabaseConnection dbcon = new DatabaseConnection();

    public Outpatient() {
         super("Outpatient");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        outpatient.setEnabled(false);
        con = dbcon.returnConnectionObject();
        stmt = dbcon.returnPreparedStatementObject();
    }

    private void returnTextFieldValues() {
        p_name = patient_namejTextField.getText();
        d_id = Integer.parseInt(doctor_idjTextField.getText());
        p_id = Integer.parseInt(patient_idjTextField.getText());
    }

    private void setAllTextFieldsToNull() {
        patient_idjTextField.setText(" ");
        patient_namejTextField.setText(" ");
        doctor_idjTextField.setText(" ");
    }

    private void copyPatientDataMiddlePhase() {
        try {
            rs = stmt.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                if (rs.getInt(1) == Integer.parseInt(patient_idjTextField.getText()) && rs.getInt(2) == Integer.parseInt(doctor_idjTextField.getText())) {
                    p_id = rs.getInt(1);
                    d_id = rs.getInt(2);
                    p_name = rs.getString(3);
                    p_gender = rs.getString(4);
                    p_age = rs.getInt(5);
                    p_number = rs.getString(6);
                    p_address = rs.getString(7);
                    p_room = rs.getInt(8);
                    p_admitdate = rs.getString(9);
                    p_dischargedate = rs.getString(10);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Outpatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void copyPatientDataForHistoryOfPatients() {
        copyPatientDataMiddlePhase();
        try {
            stmt = con.prepareStatement("INSERT INTO patienthistory (p_id,d_id,p_name,p_gender,p_age,p_number,p_address,p_room,p_admitdate,p_dischargedate) " + " VALUES (?,?,?,?,?,?,?,?,?,?) ");
            stmt.setInt(1, p_id);
            stmt.setInt(2, d_id);
            stmt.setInt(5, p_age);
            stmt.setInt(8, p_room);
            stmt.setString(3, p_name);
            stmt.setString(4, p_gender);
            stmt.setString(6, p_number);
            stmt.setString(7, p_address);
            stmt.setString(9, p_admitdate);
            stmt.setString(10, p_dischargedate);
            stmt.executeUpdate();
            //stmt.close();
            //con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Outpatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteDichargedPatientRecord() {
        try {
            stmt = con.prepareStatement("DELETE FROM " + tableName + " WHERE p_id = " + p_id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Outpatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patient_name = new javax.swing.JLabel();
        discharge_date = new javax.swing.JLabel();
        doctor_id = new javax.swing.JLabel();
        patient_id = new javax.swing.JLabel();
        outpatient = new javax.swing.JButton();
        patient_idjTextField = new javax.swing.JTextField();
        patient_namejTextField = new javax.swing.JTextField();
        doctor_idjTextField = new javax.swing.JTextField();
        generate_bill = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        discharge_datejDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patient_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_name.setText("Patient's name");
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 131, 45));

        discharge_date.setBackground(new java.awt.Color(222, 222, 240));
        discharge_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        discharge_date.setText("Discharge Date");
        getContentPane().add(discharge_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 131, 37));

        doctor_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id.setText("Doctor's ID");
        getContentPane().add(doctor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 131, 33));

        patient_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_id.setText("Patient's ID");
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 112, 33));

        outpatient.setBackground(new java.awt.Color(222, 222, 240));
        outpatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        outpatient.setText("Outpatient");
        outpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outpatientActionPerformed(evt);
            }
        });
        getContentPane().add(outpatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 110, 60));

        patient_idjTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_idjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(patient_idjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, 40));

        patient_namejTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_namejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(patient_namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 110, 150, 40));

        doctor_idjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_idjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_idjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_idjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_idjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, 40));

        generate_bill.setBackground(new java.awt.Color(222, 222, 240));
        generate_bill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        generate_bill.setText("Generate Bill");
        generate_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_billActionPerformed(evt);
            }
        });
        getContentPane().add(generate_bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, 60));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 110, 60));

        discharge_datejDateChooser.setDateFormatString(" yyyy, MM, dd");
        getContentPane().add(discharge_datejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 150, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctor_idjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_idjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_idjTextFieldActionPerformed

    private void generate_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_billActionPerformed
        JOptionPane.showMessageDialog(null, "Bill is generated !:");
        outpatient.setEnabled(true);
    }//GEN-LAST:event_generate_billActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PatientWindow().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void outpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outpatientActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        p_dischargedate = dateFormat.format(discharge_datejDateChooser.getDate());
        try {
            returnTextFieldValues();
            String sql = "UPDATE patient SET p_dischargedate= '" + p_dischargedate + "' WHERE p_id= '" + p_id + "' AND d_id= '" + d_id + "'";
            stmt = con.prepareStatement(sql);
            stmt.execute();
            copyPatientDataForHistoryOfPatients();
            deleteDichargedPatientRecord();
            setAllTextFieldsToNull();
            stmt.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Patient is successfully discharged !:");
        } catch (SQLException ex) {
            Logger.getLogger(Outpatient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_outpatientActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Outpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel discharge_date;
    private com.toedter.calendar.JDateChooser discharge_datejDateChooser;
    private javax.swing.JLabel doctor_id;
    private javax.swing.JTextField doctor_idjTextField;
    private javax.swing.JButton generate_bill;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton outpatient;
    private javax.swing.JLabel patient_id;
    private javax.swing.JTextField patient_idjTextField;
    private javax.swing.JLabel patient_name;
    private javax.swing.JTextField patient_namejTextField;
    // End of variables declaration//GEN-END:variables
}
