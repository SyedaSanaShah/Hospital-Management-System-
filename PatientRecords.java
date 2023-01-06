package hospital_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PatientRecords extends javax.swing.JFrame {

    private static Statement st;
    private static ResultSet rs;
    private static Connection con;
    private static PreparedStatement stmt;
    private static String tableName = "patienthistory";
    DatabaseConnection dbcon = new DatabaseConnection();

    public PatientRecords() {
         super("Patients Records");
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        con = dbcon.returnConnectionObject();
        st = dbcon.returnStatementObject();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        show_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(222, 222, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(222, 222, 240));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "p_id", "d_id", "p_name", "p_gender", "p_age", "p_number", "p_address", "p_room", "p_admitdate", "p_dischargedate"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 718, 140));

        show_button.setBackground(new java.awt.Color(222, 222, 240));
        show_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        show_button.setText("Show Record");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(show_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 170, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nasir Abbas Mangrio\\Documents\\NetBeansProjects\\Hospital_Management_System\\src\\Images\\hospital13.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
        try {
            String sql = "SELECT * FROM patienthistory";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                String p_id = String.valueOf(rs.getInt(1));
                String d_id = String.valueOf(rs.getInt(2));
                String p_name = rs.getString(3);
                String p_gender = rs.getString(4);
                String p_age = String.valueOf(rs.getInt(5));
                String p_number = rs.getString(6);
                String p_address = rs.getString(7);
                String p_room = String.valueOf(rs.getInt(8));
                String p_admitdate = rs.getString(9);
                String p_dischargedate = rs.getString(10);
                String obj[] = {p_id, d_id, p_name, p_gender, p_age, p_number, p_address, p_room, p_admitdate, p_dischargedate};
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(obj);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PatientRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_show_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton show_button;
    // End of variables declaration//GEN-END:variables
}
