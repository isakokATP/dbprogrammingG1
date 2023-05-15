package dbprogramming;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB7 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root" ;
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("database connected");
            Statement statement = con.createStatement();
            String sql = "insert in Student values(65130500016,'shisanucha','chengsamo','shisanucha.chen@kmutt.ac.th','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}