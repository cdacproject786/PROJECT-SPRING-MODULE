package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateJdbcConnection {
	
	public static Connection getJdbcConnection() throws SQLException, ClassNotFoundException
	{
		String path = "com.mysql.cj.jdbc.Driver";
		String username = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/project23";
		Class.forName(path);
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
	}

}
