package com.awesometodo.model.manager;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	Connection con = null;
	
	//Established Connection to database
	public Connection getConnection() {
		try {
			//load mysql driver
			Class.forName("org.mariadb.jdbc.Driver");
			
			//established Connection
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/pcguide","root","");
			return con;
		}
		
		catch (Exception e) {
			e.printStackTrace();
			return null; //failed to connect
		}
		
	}
}
