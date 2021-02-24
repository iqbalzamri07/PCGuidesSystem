package com.awesometodo.model.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.awesometodo.model.UserInfo;

public class UserManager {

	//Register Method
	public boolean register(UserInfo userInfo) throws SQLException {
		
		//get new connection
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		boolean insertStatus = false;
		
		try {
			//prepare statement object
			String sql = "insert into user(full_name, username, email, password, address, money) " + "values (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//set parameters	
			
			ps.setString(1, userInfo.getFullName());
			ps.setString(2, userInfo.getUsername());
			ps.setString(3, userInfo.getEmail());
			ps.setString(4, userInfo.getPassword());
			ps.setString(5, userInfo.getAddress());
			ps.setDouble(6, userInfo.getMoney());
			
			//execute query
			int res = ps.executeUpdate();
			
			//if one record change, that means insert is sucessful
			if (res == 1)
				insertStatus = true;
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
		
		return insertStatus;
		
	}
	
	//login method
	public UserInfo login(String username, String password) throws SQLException {
		
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		
		try {
			String sql = "select * from user where " + "username=? and password=?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			//set parameters
			ps.setString(1, username);
			ps.setString(2, password);
			
			//execute
			ResultSet rs = ps.executeQuery();
			
			//if sql return result, login is succesful
			//get the user info
			
			if(rs.next()) {
				@SuppressWarnings("unused")
				int id = rs.getInt("user_id");
				String fullName = rs.getString("full_name");
				String usernames = rs.getString("username");
				String email = rs.getString("email");
				String passwords = rs.getString("password");
				String address = rs.getString("address");
				double money = rs.getDouble("money");
				
				UserInfo userInfo = new UserInfo(fullName,usernames,email,passwords,address,money);
				return userInfo;
			} //end if
			
		}//end try
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			con.close();
		}
		return null; //failed
	}
	
	
}

