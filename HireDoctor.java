package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HireDoctor extends javax.swing.JFrame {

    private int d_id = 0;
    private int d_salary = 0;
    private static Statement st;
    private static ResultSet rs;
    private String d_dept = null;
    private String d_name = null;
    private static Connection con;
    private String d_gender = null;
    private String d_number = null;
    private String d_password = null;
    private static PreparedStatement stmt;
    private static String tableName = "doctor";
    DatabaseConnection dbcon = new DatabaseConnection();

    public HireDoctor() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        con = dbcon.returnConnectionObject();
        stmt = dbcon.returnPreparedStatementObject();
    }

    private void returnTextFieldValues() {
        d_dept = doctor_deptjTextField.getText();
        d_name = doctor_namejTextField.getText();
        d_number = doctor_numberjTextField.getText();
        d_gender = doctor_genderjTextField.getText();
        d_password = doctor_passwordjTextField.getText();
        d_salary = Integer.parseInt(doctor_salaryjTextField.getText());
    }

    private void setAllTextFieldsToNull() {
        doctor_namejTextField.setText(" ");
        doctor_idjTextField.setText(" ");
        doctor_genderjTextField.setText(" ");
        doctor_numberjTextField.setText(" ");
        doctor_salaryjTextField.setText(" ");
        doctor_deptjTextField.setText(" ");
        doctor_passwordjTextField.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        doctor_id = new javax.swing.JLabel();
        doctor_gender = new javax.swing.JLabel();
        doctor_name = new javax.swing.JLabel();
        doctor_dept = new javax.swing.JLabel();
        doctor_salary = new javax.swing.JLabel();
        doctor_number = new javax.swing.JLabel();
        doctor_namejTextField = new javax.swing.JTextField();
        doctor_idjTextField = new javax.swing.JTextField();
        doctor_genderjTextField = new javax.swing.JTextField();
        doctor_numberjTextField = new javax.swing.JTextField();
        doctor_salaryjTextField = new javax.swing.JTextField();
        doctor_deptjTextField = new javax.swing.JTextField();
        back_button = new javax.swing.JButton();
        selectjComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dismiss_button = new javax.swing.JButton();
        hire_button = new javax.swing.JButton();
        doctor_password = new javax.swing.JLabel();
        doctor_passwordjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctor_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_id.setText("Doctor ID");
        getContentPane().add(doctor_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 32));

        doctor_gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_gender.setText("Gender");
        getContentPane().add(doctor_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 32));

        doctor_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_name.setText("Name");
        getContentPane().add(doctor_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 32));

        doctor_dept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_dept.setText("Department");
        getContentPane().add(doctor_dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 90, 32));

        doctor_salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_salary.setText("Salary");
        getContentPane().add(doctor_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 90, 32));

        doctor_number.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_number.setText("Phone no:");
        getContentPane().add(doctor_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 32));

        doctor_namejTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_namejTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_namejTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 32));

        doctor_idjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_idjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_idjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_idjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_idjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 32));

        doctor_genderjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_genderjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_genderjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_genderjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_genderjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 32));

        doctor_numberjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_numberjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_numberjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_numberjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_numberjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, 32));

        doctor_salaryjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_salaryjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_salaryjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_salaryjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_salaryjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 32));

        doctor_deptjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_deptjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_deptjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor_deptjTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctor_deptjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 140, 32));

        back_button.setBackground(new java.awt.Color(222, 222, 240));
        back_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 120, 40));

        selectjComboBox.setBackground(new java.awt.Color(222, 222, 240));
        selectjComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hire Doctor", "Dismiss Doctor" }));
        selectjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectjComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(selectjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 140, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 90, 40));

        dismiss_button.setBackground(new java.awt.Color(222, 222, 240));
        dismiss_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dismiss_button.setText("Dismiss");
        dismiss_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dismiss_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(dismiss_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 120, 40));

        hire_button.setBackground(new java.awt.Color(222, 222, 240));
        hire_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hire_button.setText("Hire");
        hire_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(hire_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 120, 40));

        doctor_password.setBackground(new java.awt.Color(222, 222, 240));
        doctor_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctor_password.setText("Password");
        getContentPane().add(doctor_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 90, 30));

        doctor_passwordjTextField.setBackground(new java.awt.Color(222, 222, 240));
        doctor_passwordjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(doctor_passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctor_namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_namejTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_doctor_namejTextFieldActionPerformed

    private void doctor_numberjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_numberjTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_doctor_numberjTextFieldActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ReceptionistWindow().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void selectjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectjComboBoxActionPerformed
        // TODO add your handling code here:
        if (selectjComboBox.getItemAt(selectjComboBox.getSelectedIndex()).equals("Hire Doctor")) {
            doctor_idjTextField.setEditable(false);
            dismiss_button.setEnabled(false);
        }
        if (selectjComboBox.getItemAt(selectjComboBox.getSelectedIndex()).equals("Dismiss Doctor")) {
            dismiss_button.setEnabled(true);
            hire_button.setEnabled(false);
            doctor_idjTextField.setEditable(true);
        }
    }//GEN-LAST:event_selectjComboBoxActionPerformed

    private void doctor_idjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_idjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor_idjTextFieldActionPerformed

    private void doctor_genderjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_genderjTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_doctor_genderjTextFieldActionPerformed

    private void doctor_salaryjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_salaryjTextFieldActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_doctor_salaryjTextFieldActionPerformed

    private void doctor_deptjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor_deptjTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_doctor_deptjTextFieldActionPerformed


    private void dismiss_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dismiss_buttonActionPerformed
        try {
            int id = Integer.parseInt(doctor_idjTextField.getText());
            stmt = con.prepareStatement("DELETE FROM " + tableName + " WHERE d_id = " + id);
            stmt.executeUpdate();
            stmt.close();
            con.close();
            setAllTextFieldsToNull();
            JOptionPane.showMessageDialog(null, "Successfull !\n Doctor with DoctorID:" + id + " has been dismissed");
        } catch (SQLException ex) {
            Logger.getLogger(HireDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dismiss_buttonActionPerformed

    private void hire_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_buttonActionPerformed
        try {
            returnTextFieldValues();
            stmt = con.prepareStatement("INSERT INTO doctor (d_name,d_gender,d_number,d_salary,d_dept,d_password) " + " VALUES (?,?,?,?,?,?) ");
            stmt.setString(1, d_name);
            stmt.setString(2, d_gender);
            stmt.setString(3, d_number);
            stmt.setInt(4, d_salary);
            stmt.setString(5, d_dept);
            stmt.setString(6, d_password);
            stmt.executeUpdate();
            rs = stmt.executeQuery("SELECT * FROM doctor");
            while (rs.next()) {
                d_id = rs.getInt(1);
            }
            stmt.close();
            con.close();
            setAllTextFieldsToNull();
            JOptionPane.showMessageDialog(null, "Congratulations you are hired !\n Doctor ID:" + d_id + "\n Password= " + d_password);
        } catch (SQLException ex) {
            Logger.getLogger(HireDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hire_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HireDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton dismiss_button;
    private javax.swing.JLabel doctor_dept;
    private javax.swing.JTextField doctor_deptjTextField;
    private javax.swing.JLabel doctor_gender;
    private javax.swing.JTextField doctor_genderjTextField;
    private javax.swing.JLabel doctor_id;
    private javax.swing.JTextField doctor_idjTextField;
    private javax.swing.JLabel doctor_name;
    private javax.swing.JTextField doctor_namejTextField;
    private javax.swing.JLabel doctor_number;
    private javax.swing.JTextField doctor_numberjTextField;
    private javax.swing.JLabel doctor_password;
    private javax.swing.JTextField doctor_passwordjTextField;
    private javax.swing.JLabel doctor_salary;
    private javax.swing.JTextField doctor_salaryjTextField;
    private javax.swing.JButton hire_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JComboBox<String> selectjComboBox;
    // End of variables declaration//GEN-END:variables

}
