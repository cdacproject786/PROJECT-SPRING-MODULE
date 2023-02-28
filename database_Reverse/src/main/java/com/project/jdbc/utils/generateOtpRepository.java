package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class generateOtpRepository {

	public static void insertAutogenerateOtp()
	{
		    Connection con = CreateJdbcConnection.getJdbcConnection();
		    try (PreparedStatement prepareStatement = con.prepareStatement("insert into otp_table (remark) values ('X')"))
		    {
		    	prepareStatement.executeUpdate();
		    	con.close();
		    
		    } 
		    catch (SQLException e) {
				
				e.printStackTrace();
			}
	}
	
	public static int getOtp()
	{
		int otp = 0;
		Connection con = CreateJdbcConnection.getJdbcConnection();
		try
		{
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery("select otp from otp_table where otp = (SELECT LAST_INSERT_ID()");
			while(result.next())
			{
				otp = result.getInt(1);
				break;
			}
			
			return otp;
			
		}
		catch (Exception e)
		{
			return 0;
		}
	}
		
			

		
		
	}

