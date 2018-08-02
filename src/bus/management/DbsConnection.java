/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbsConnection {
   
    
 

    public static Connection getDbsConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_management", "root", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

