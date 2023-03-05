package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateOtpRepository {

	public static int validateOtp()
	{
		int otpInDb = 0;
		Connection con = CreateJdbcConnection.getJdbcConnection();
		try
		{
		
			PreparedStatement pstmt = con.prepareStatement("select * from otp_table");
			ResultSet result = pstmt.executeQuery();
			
			while(result.next())
			otpInDb = result.getInt(1);
			
			return otpInDb;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
