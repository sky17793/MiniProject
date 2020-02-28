package com.getticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.sql.Date;

import com.AddCar.Variable;


public class GetTicketJDBC {
	
	public static int  getticket(String carNumber,String color,String d)
	{
		int slotticket = 0;
		String s[]=d.split("-");
		String s2=s[2]+"-"+s[1]+"-"+s[0];
		System.out.println(s2);
		System.out.println(d);
	
			java.sql.Date dd = Date.valueOf(d) ;
			System.out.println(dd);
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Variable.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject","root","root");
				Variable.stm1=Variable.con.prepareStatement("SELECT slot FROM parkingproject.slotdata where slot not in (SELECT slot FROM parkingproject.car where exitDate is null) order by slot limit 1");
				Variable.rs=Variable.stm1.executeQuery();
				Variable.rs.first();
				Variable.stm=Variable.con.prepareStatement("insert into car(carNumber,carColor,slot,entryDate) values(?,?,?,?)");
				//Variable.stm.setInt(1,3);
				Variable.stm.setString(1,carNumber);
				Variable.stm.setString(2,color);
				Variable.stm.setInt(3,Variable.rs.getInt(1));
			    //Variable.stm.setDate(4, s2);
				Variable.stm.setObject(4,dd);
				
				slotticket=Variable.rs.getInt(1);
				System.out.println(slotticket);
				
				int status = Variable.stm.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return slotticket;
		
	}

}
