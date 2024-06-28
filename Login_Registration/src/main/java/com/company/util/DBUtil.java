package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
   private static final String url = "jdbc:mysql://localhost:3306/db";
   private static final String username = "root";
   private static final String pass = "lulu@2004";
   
   static {
       try {
           // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static Connection getConnection() throws SQLException {
	   System.out.println("Connction ho rahi he:)");
       return DriverManager.getConnection(url, username, pass);
   }
}
