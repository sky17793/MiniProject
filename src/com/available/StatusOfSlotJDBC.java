package com.available;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.*;
import java.sql.Date;

import com.AddCar.Variable;
import com.carinfo.CarInformation;


public class StatusOfSlotJDBC {
	
	public static ArrayList<Integer>  getticket()
	{
		int c = 0,c1=0;
		ArrayList<Integer> l=new ArrayList();
	     
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Variable.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject","root","root");
				
				Variable.stm=Variable.con.prepareStatement("select * from slotdata");
				Variable.rs=Variable.stm.executeQuery();
				
				
				while(Variable.rs.next()) {
					if(Variable.rs.getInt(3)==0)
					{
						c++;
					}
					else
					{
						c1++;
					}
				   
				}
				
				l.add(c);
				l.add(c1);
				
				int status = Variable.stm.executeUpdate();
				
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Add Entry");
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
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
		return l;
		
	}

}

