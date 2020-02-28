

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.ArrayList;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import com.CarParking.DisplayAllTheCar;
	import com.available.StatusOfSlotJDBC;
import com.carinfo.CarInformation;

	@WebServlet("/pqr")
	public class SlotStatus extends HttpServlet{
		private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		pw.println("<button><a href=\"index.html\">home</a></button><br><br>");
		pw.println("<br>");
		pw.println("<table border=2 width=50>");
		pw.println("<th>available</th><th>reserve</th>");
		ArrayList<Integer> al=StatusOfSlotJDBC.getticket();
		int avilable=al.get(0);
		int park=al.get(1);
		pw.println("<tr>");
		pw.println("<td>"+avilable+"</td>");
		pw.println("<td>"+park+"</td>");
	
		pw.println("<tr>");
		pw.println("</table>");
		
			doPost(req,res);
	}
			
			protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
							
			}

	}

	


