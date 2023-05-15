package dbprogramming;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB14 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username ="root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Connection = DriverManager.getConnection(url,username,password);
            DatabaseMetaData dbMetaData = Connection.getMetaData();
            System.out.println("database URL: " + dbMetaData.getURL());
            System.out.println("database product name: " + dbMetaData.getDatabaseProductName());
            System.out.println("database product version: "+ dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + dbMetaData.getDriverName());
            System.out.println("JDBC driver version: "+dbMetaData.getDriverVersion());
            System.out.println("JDBC driver major version: "+dbMetaData.getDriverMajorVersion());
            System.out.println("JDBC driver minor version: "+ dbMetaData.getDriverMinorVersion());
            System.out.println("Max number of connection: "+ dbMetaData.getMaxConnections());
        } catch (ClassNotFoundException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex){
            Logger.getLogger(dbProgramming.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
