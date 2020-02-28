package com.AddCar;

import java.sql.*;

//import com.mainM.Variable;

public class AddCarEntry {
	int car_id;
	String carNumber;
	String carColor;
	int slot;
	Date entry_d;
	Date exit_d;
	
	public static  int carEntry(String carNumber,String carColor,String slot,String entryd)   {
		
		
		int status=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Variable.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject","root","root");
				
				
				Variable.stm=Variable.con.prepareStatement("insert into car(carNumber,carColor,slot,entryDate) values(?,?,?,?)");

				Variable.stm.setString(1,carNumber);
				Variable.stm.setString(2,carColor);
				Variable.stm.setObject(3,slot);
				Variable.stm.setObject(4,entryd);
				
				status=Variable.stm.executeUpdate();
				System.out.println(status);
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Add Entry");
		
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
		return status;
	}
	
	
}
