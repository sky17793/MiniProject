package com.search;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.AddCar.Variable;
import com.carinfo.CarInformation;

public class SearchBySlotJDBC {

	public static ArrayList<SlotData> displayData(String slot) {
		ArrayList<SlotData> list = new ArrayList<SlotData>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Variable.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingproject", "root",
						"root");
				int islot = Integer.parseInt(slot);
				Variable.stm = Variable.con.prepareStatement(
						"select c.slot , c.carNumber, s.rate , s.flag from slotdata s , car c where c.slot = s.slot and c.slot = ? and exitDate is null ");
				Variable.stm.setInt(1, islot);
				Variable.rs = Variable.stm.executeQuery();

				while (Variable.rs.next()) {

					int s = Variable.rs.getInt(1);
					int a = Integer.parseInt(slot);

					if (a == s) {
						SlotData sd = new SlotData(Variable.rs.getInt(1), Variable.rs.getString(2),
								Variable.rs.getInt(3), Variable.rs.getInt(4));
						list.add(sd);
					}
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
