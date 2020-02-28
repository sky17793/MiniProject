package com.AddCar;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class DeleteCar {
	
	public static int  exitEntry(int id,String d)
	{
		int exitEntryStatus=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				Variable.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject","root","root");
		
				Variable.stm=Variable.con.prepareStatement("update car set exitDate=? where carid=? ");
				Variable.stm.setObject(1,d);
				Variable.stm.setObject(2, id);
				exitEntryStatus=Variable.stm.executeUpdate();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				Variable.con.close();
				Variable.stm.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
	}
		return exitEntryStatus;

	}
}
