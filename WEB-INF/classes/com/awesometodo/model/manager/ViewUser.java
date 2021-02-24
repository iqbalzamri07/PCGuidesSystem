package com.awesometodo.model.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.awesometodo.model.UserInfo;

public class ViewUser {
	public ArrayList<UserInfo> getAllUser() {

		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();

		ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();

		try {

			String sqlQuery = "select * from user";

			PreparedStatement ps = con.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();

			if (rs.first()) {

				int userId = rs.getInt(1);
				String fullName = rs.getString(2);
				String username = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String address = rs.getString(6);
				int money = rs.getInt(7);

				System.out.println("user ID: " + userId + "Name: " + fullName + " Username: " + username + "email: " + email + "password: "
						+ password + "address: " + address + "money: " + money);

				UserInfo ui = new UserInfo(userId, fullName, username, email, password, address, money);
				userInfo.add(ui);
			}
			while (rs.next()) {
				int userId = rs.getInt(1);
				String fullName = rs.getString(2);
				String username = rs.getString(3);
				String email = rs.getString(4);
				String password = rs.getString(5);
				String address = rs.getString(6);
				int money = rs.getInt(7);

				System.out.println("user ID: " + userId + "Name: " + fullName + " Username: " + username + "email: " + email + "password: "
						+ password + "address: " + address + "money: " + money);
				UserInfo ui = new UserInfo(userId, fullName, username, email, password, address, money);
				userInfo.add(ui);
			}

		} // end try
		
		catch (Exception e) {
			e.printStackTrace();
		} //end catch

		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //end finally
		
		return userInfo;
	}
}