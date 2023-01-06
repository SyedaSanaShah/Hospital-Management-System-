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

public class Inpatient extends javax.swing.JFrame {

    private int p_id = 0;
    private int d_id = 0;
    public int p_age = 0;
    public int p_room = 0;
    private static Statement st;
    private static ResultSet rs;
    private static Connection con;
    public String p_name = null;
    public String p_gender = null;
    public String p_number = null;
    public String p_address = null;
    public static PreparedStatement stmt;
    public String p_admitdate = null;
    public String p_dischargedate = null;
    private static String tableName = "patient";
    DatabaseConnection dbcon = new DatabaseConnection();

    public Inpatient() {
         super("Inpatient");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        con = dbcon.returnConnectionObject();
        stmt = dbcon.returnPreparedStatementObject();
    }

    public void returnTextFieldValues() {
        p_name = patient_nameTextField.getText();
        p_number = patient_numberTextField.getText();
        p_address = patient_addressTextField.getText();
        d_id = Integer.parseInt(doctor_idTextField.getText());
        p_id = Integer.parseInt(patient_idTextfield.getText());
        p_age = Integer.parseInt(patient_ageTextField.getText());
        p_room = Integer.parseInt(patient_roomTextField.getText());
        p_gender = patient_genderComboBox.getItemAt(patient_genderComboBox.getSelectedIndex());
    }

    private void setAllTextFieldsToNull() {
        doctor_idTextField.setText(" ");
        patient_idTextfield.setText(" ");
        patient_ageTextField.setText(" ");
        patient_roomTextField.setText(" ");
        patient_nameTextField.setText(" ");
        patient_numberTextField.setText(" ");
        patient_addressTextField.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        patient_number = new javax.swing.JLabel();
        patient_gender = new javax.swing.JLabel();
        patient_address = new javax.swing.JLabel();
        patient_age = new javax.swing.JLabel();
        doctor_id = new javax.swing.JLabel();
        patient_idTextfield = new javax.swing.JTextField();
        patient_ageTextField = new javax.swing.JTextField();
        patient_genderComboBox = new javax.swing.JComboBox<>();
        patient_numberTextField = new javax.swing.JTextField();
        patient_addressTextField = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        patient_nameTextField = new javax.swing.JTextField();
        patient_name = new javax.swing.JLabel();
        patient_admitdate = new javax.swing.JLabel();
        inpatient_button = new javax.swing.JButton();
        doctor_idTextField = new javax.swing.JTextField();
        patient_roomTextField = new javax.swing.JTextField();
        patient_room = new javax.swing.JLabel();
        patient_admitdatejDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(220, 220, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 32));

        patient_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_number.setText("phone no:");
        getContentPane().add(patient_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 90, 31));

        patient_gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_gender.setText("Gender");
        getContentPane().add(patient_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 86, 51));

        patient_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_address.setText("Address ");
        getContentPane().add(patient_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 41));

        patient_age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_age.setText("Age");
        getContentPane().add(patient_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 66, 37));

        doctor_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id.setText("Consultant  ID");
        getContentPane().add(doctor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, 31));

        patient_idTextfield.setBackground(new java.awt.Color(222, 222, 240));
        patient_idTextfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_idTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_idTextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(patient_idTextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 180, 30));

        patient_ageTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_ageTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_ageTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patient_ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 175, 30));

        patient_genderComboBox.setBackground(new java.awt.Color(222, 222, 240));
        patient_genderComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer not to say" }));
        getContentPane().add(patient_genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, 38));

        patient_numberTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_numberTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(patient_numberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 180, 30));

        patient_addressTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_addressTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_addressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_addressTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patient_addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 180, 33));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 110, 40));

        patient_nameTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_nameTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patient_nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, 36));

        patient_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_name.setText("Name");
        getContentPane().add(patient_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 90, 32));

        patient_admitdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_admitdate.setText("Admit Date");
        getContentPane().add(patient_admitdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 40));

        inpatient_button.setBackground(new java.awt.Color(222, 222, 240));
        inpatient_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inpatient_button.setText("Inpatient");
        inpatient_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpatient_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(inpatient_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 110, 40));

        doctor_idTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_idTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 180, 30));

        patient_roomTextField.setBackground(new java.awt.Color(222, 222, 240));
        patient_roomTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(patient_roomTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 180, 30));

        patient_room.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        patient_room.setText("Room allocation");
        getContentPane().add(patient_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, 40));

        patient_admitdatejDateChooser.setBackground(new java.awt.Color(222, 222, 240));
        patient_admitdatejDateChooser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(patient_admitdatejDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 180, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 820, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patient_idTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_idTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_idTextfieldActionPerformed

    private void patient_ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_ageTextFieldActionPerformed

    private void patient_addressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_addressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_addressTextFieldActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PatientWindow().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void patient_nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_nameTextFieldActionPerformed

    private void inpatient_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatient_buttonActionPerformed
        returnTextFieldValues();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        p_admitdate = dateFormat.format(patient_admitdatejDateChooser.getDate());
        try {
            stmt = con.prepareStatement("INSERT INTO patient (p_id,d_id,p_name,p_gender,p_age,p_number,p_address,p_room,p_admitdate) " + " VALUES (?,?,?,?,?,?,?,?,?) ");
            stmt.setInt(1, p_id);
            stmt.setInt(2, d_id);
            stmt.setInt(5, p_age);
            stmt.setInt(8, p_room);
            stmt.setString(3, p_name);
            stmt.setString(4, p_gender);
            stmt.setString(6, p_number);
            stmt.setString(7, p_address);
            stmt.setString(9, p_admitdate);
            stmt.executeUpdate();
            rs = stmt.executeQuery("SELECT * FROM patient");
            while (rs.next()) {
                p_id = rs.getInt(1);
            }
            stmt.close();
            con.close();
            setAllTextFieldsToNull();
            JOptionPane.showMessageDialog(null, "Patient ID " + p_id + "is successfully admitted in hospital !");
        } catch (SQLException ex) {
            Logger.getLogger(HireDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inpatient_buttonActionPerformed

    private void doctor_idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_idTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel doctor_id;
    private javax.swing.JTextField doctor_idTextField;
    private javax.swing.JButton inpatient_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel patient_address;
    private javax.swing.JTextField patient_addressTextField;
    private javax.swing.JLabel patient_admitdate;
    private com.toedter.calendar.JDateChooser patient_admitdatejDateChooser;
    private javax.swing.JLabel patient_age;
    private javax.swing.JTextField patient_ageTextField;
    private javax.swing.JLabel patient_gender;
    private javax.swing.JComboBox<String> patient_genderComboBox;
    private javax.swing.JTextField patient_idTextfield;
    private javax.swing.JLabel patient_name;
    private javax.swing.JTextField patient_nameTextField;
    private javax.swing.JLabel patient_number;
    private javax.swing.JTextField patient_numberTextField;
    private javax.swing.JLabel patient_room;
    private javax.swing.JTextField patient_roomTextField;
    // End of variables declaration//GEN-END:variables
}
