
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.CarParking.DisplayAllTheCar;
import com.carinfo.CarInformation;

@WebServlet("/xyz")
public class ShowDetailsOfCar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		ArrayList list = DisplayAllTheCar.DisplayData();

		pw.println("<table border=1 width=800>");
		pw.println(
				"<tr><th>Car Id</th><th>car Number</th><th>car Color</th><th>car Slot</th><th>Car Entry date</th><th>Car Exit Date</th><th>Action</th></tr>");
		for (int i = 0; i < list.size(); i++) {
			pw.println("<tr>");

			CarInformation f = (CarInformation) list.get(i);

			pw.println("<td>" + f.getCarId() + "</td>");
			pw.println("<td>" + f.getCarNumber() + "</td>");
			pw.println("<td>" + f.getColor() + "</td>");
			pw.println("<td>" + f.getSlot() + "</td>");
			pw.println("<td>" + f.getDateEtry() + "</td>");
			pw.println("<td>" + f.getExpiryDate() + "</td>");

			if (f.getExpiryDate() == null) {
				pw.println("<td><button><a href=" + "ExitFile?id=" + f.getCarId() + ">relese</a><button></td>");
			}

			pw.println("</tr>");
		}

		pw.println("</table>");

	}

}
