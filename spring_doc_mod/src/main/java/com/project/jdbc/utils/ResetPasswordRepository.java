package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.entity.proxy.ResetPasswordProxy;

public class ResetPasswordRepository {
	
	public static void changePassword(String email,String pwd) throws SQLException
	{
		Connection connection = CreateJdbcConnection.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement("update doctor_primary set pwd = ? where email = ?");
		statement.setString(1, pwd);
		statement.setString(2, email);
		statement.executeUpdate();
		connection.close();
	}

}
