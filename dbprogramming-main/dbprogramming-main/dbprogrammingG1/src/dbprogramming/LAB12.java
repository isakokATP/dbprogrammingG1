package dbprogramming;

import java.sql.*;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LAB12 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username ="root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            String sql = "insert into student (studentID,firstname,lastname,email,deptID)"
                    + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = Connection.prepareStatement(sql);
            preparedStatement.setString(1,"111111");
            preparedStatement.setString(2,"aaaa");
            preparedStatement.setString(3,"bbbb");
            preparedStatement.setString(4,"aaaa@gmail.com");
            preparedStatement.setString(5,"IT");
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
