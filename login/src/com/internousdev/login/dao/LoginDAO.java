package com.internousdev.login.dao;

import java.sql.ResultSet;

import com.internousdev.login.dto.LoginDTO;

public class LoginDAO {
	public LoginDTO select(String name, String password)throws SQLException{
		LoginDTO dto = new LoginDtO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql = "select * from user where user_name=? and password=?";
	try {
		PreoaredStatement ps = con.prepareStatement(sql);
		ps.setString(1,name);
		ps.setString(2,password);
		ResultSet rs= ps.executeQuery();
		
		if(rs.next()) {
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}
	    }catch
	}

}
