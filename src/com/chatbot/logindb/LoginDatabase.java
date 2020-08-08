package com.chatbot.logindb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDatabase {
	String url = "jdbc:mysql://localhost:3306/login_demo";
	String sql = "select * from user_details where username=? and pass=?";
	public boolean isUserExists(String name, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "pass");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, name);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
