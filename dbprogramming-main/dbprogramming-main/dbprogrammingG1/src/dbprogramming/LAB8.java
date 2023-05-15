package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB8 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username ="root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            Statement statement = Connection.createStatement();
            String sql = "insert into student (studentID,firstname,lastname,email,deptID)"
                    + "values('11111','AAAA','BBBB','AAAAA@gmail.com','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
