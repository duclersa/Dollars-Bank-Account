//This is the code to connect to the database
package com.dollarsbank.connectionfactory;

import com.mysql.jdbc.Driver;   
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.dollarsbank.model.*;

public class ConnectionFactory {
    public static final String URL = "jdbc:mysql://localhost:3306/accountbankdb";
    public static final String USER = "root";
    public static final String PASS = "root";
    public static Connection getConnection()
    {
    	Connection conn = null;
      try {
          DriverManager.registerDriver(new Driver());
             return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }
}


