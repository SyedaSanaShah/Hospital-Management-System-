package hospital_management_system;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    private static Statement st;
    private static ResultSet rs;
    private static Connection con;
    private static PreparedStatement stmt;
    private static String userName = "root";
    private static String password = "helloworld#123";
    private static String url = "jdbc:mysql://localhost/Hospital_Management_System";

    public ResultSet returnResultSetObject() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
            st = con.createStatement();
            stmt = con.prepareStatement("");
            rs = st.executeQuery("");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public PreparedStatement returnPreparedStatementObject() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stmt;
    }

    public Statement returnStatementObject() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }

    public Connection returnConnectionObject() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

    }
}
