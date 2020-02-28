package com.CarParking;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.AddCar.Variable;
import com.carinfo.CarInformation;

public class DisplayAllTheCar {
	 
	
 public static  ArrayList<CarInformation>  DisplayData() {
	 
	 ArrayList<CarInformation> list=new ArrayList<CarInformation>();
			 try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					try {
						Variable.con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject","root","root");
						
						Variable.stm=Variable.con.prepareStatement("select * from car where exitDate is null");
						Variable.rs=Variable.stm.executeQuery();
						
						
						while(Variable.rs.next()) {
						   CarInformation carinfo1= new CarInformation(Variable.rs.getInt("carId"),Variable.rs.getString("carNumber"),Variable.rs.getString("carColor"),Variable.rs.getInt("slot"),Variable.rs.getDate("entryDate"),Variable.rs.getDate("exitDate"));
						   list.add(carinfo1);
						}
						
						
						
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
			return list;
 }
}
