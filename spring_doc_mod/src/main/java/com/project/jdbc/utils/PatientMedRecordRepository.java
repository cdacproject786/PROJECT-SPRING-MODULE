package com.project.jdbc.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.project.entity.proxy.PatientMedRecordForDisplay;

public class PatientMedRecordRepository {
	
	public static PatientMedRecordForDisplay getPatientMedRecord(String abhaaNumber) throws SQLException
	{
		System.out.println(abhaaNumber);
		Connection con =  CreateJdbcConnection.getJdbcConnection();
		PatientMedRecordForDisplay display = new PatientMedRecordForDisplay();
		try
		{
			
			PreparedStatement statement = con.prepareStatement("select BLOOD_PRESSURE, WEIGHT, SUGAR_LEVEL, BLOOD_GROUP from patient_med_record where ABHA_NUMBER = ?");
			statement.setString(1, abhaaNumber);
			
			ResultSet result = statement.executeQuery();
		
			 while(result.next())
			 {
				display.setBloodPressure(result.getString(1));
				
				display.setWeight(result.getDouble(2));
				display.setSugarLevel(result.getString(3));
				display.setBloodGroup(result.getString(4));
			 }
			 
			 System.out.println(display);
			 return display;
			
		}
		
		catch (Exception e)
		{
			return null;
		}
		finally
		{
			con.close();
		}
			
	}

}
