package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB15 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username ="root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            Statement statement = Connection.createStatement();
            String sql = "select*from student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
            System.out.println(rsMetaData.getColumnCount());
            while (results.next()){
                for (int i=1;i<=rsMetaData.getColumnCount();i++){
                    System.out.printf("%s/t",results.getString(i)+" ");
                }
                System.out.println();
            }
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
