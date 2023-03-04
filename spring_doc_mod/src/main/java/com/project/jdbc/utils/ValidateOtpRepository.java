package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateOtpRepository {

	public static int validateOtp()
	{
		int otpInDb = 0;
		Connection con = CreateJdbcConnection.getJdbcConnection();
		try
		{
			//Statement statement = con.createStatement();
			//ResultSet result = statement.executeQuery("select otp from OTP_Table where OTP=(select last_insert_id())");
			 
			PreparedStatement pstmt = con.prepareStatement("select * from otp_table");
			ResultSet result = pstmt.executeQuery();
			while(result.next())
			{
				otpInDb = result.getInt(1);
			}
			
			return otpInDb;
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return 0;
		}
	}
}
