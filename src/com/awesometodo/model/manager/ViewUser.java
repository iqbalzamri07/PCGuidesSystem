package com.awesometodo.model.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewUser {
	public static void main(String[] args) throws Exception {

    String sqlQuery = "select * from user";

    ResultSet rs = st.executeQuery(sqlQuery);
    
    if(rs.first()) {
        String fullName = rs.getString(2);
        String username = rs.getString(3);
        System.out.println("Name: " + fullName + " Username: " + username);
    }
    while (rs.next()) {
      String fullName = rs.getString(2);
      String username = rs.getString(3);
      System.out.println("Name: " + fullName + " Username: " + username);
    }

    rs.close();

  }

  static Connection conn;

  static Statement st;

  static {
    try {
      // Step 1: Load the JDBC driver.
      Class.forName("org.mariadb.jdbc.Driver");
      System.out.println("Driver Loaded.");
      // Step 2: Establish the connection to the database.

      Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pcguide","root","");
      System.out.println("Got Connection.");

      st = conn.createStatement();

    } catch (Exception e) {
      System.err.println("Got an exception! ");
      e.printStackTrace();
      System.exit(0);
    }
  }
}