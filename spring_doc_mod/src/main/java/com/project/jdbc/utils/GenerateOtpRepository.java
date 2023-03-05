package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenerateOtpRepository {

	public static void insertAutogenerateOtp()
	{
		    Connection con = CreateJdbcConnection.getJdbcConnection();
		    try (PreparedStatement prepareStatement = con.prepareStatement("insert into otp_table (remarks) values ('X')"))
		    {
		    	prepareStatement.executeUpdate();
		    	con.close();
		    
		    } 
		    catch (SQLException e) {
				
				e.printStackTrace();
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
	
	public static int getOtp()
	{
		int otp = 0;
		Connection con = CreateJdbcConnection.getJdbcConnection();
		try
		{
			PreparedStatement pstmt = con.prepareStatement("select * from otp_table");
			ResultSet result = pstmt.executeQuery();
			while(result.next())
			{
				otp = result.getInt(1);
			}
			
			return otp;
			
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

