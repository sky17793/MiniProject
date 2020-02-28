

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
import com.search.SearchByColorJDBC;

	@WebServlet("/col")
	public class SearchByColor  extends HttpServlet{
		private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
		
		String color=req.getParameter("color1");
		
		ArrayList<CarInformation> list= (ArrayList<CarInformation>) SearchByColorJDBC.displayData(color);

		pw.println("<table border=2 width=50>");
		
		pw.println("<th>Car Id</th><th>car Number</th><th>car Color</th><th>car Slot</th><th>Car Entry date</th><th>Car Exit Date</th>");
    	
		for(int i = 0; i <list.size(); i++)
		{
			pw.println("<tr>");
		
			
			      CarInformation f=(CarInformation) list.get(i);
			     pw.println("<td>"+f.getCarId()+"</td>");
			     pw.println("<td>"+f.getCarNumber()+"</td>");
			     pw.println("<td>"+f.getColor()+"</td>");
			     pw.println("<td>"+f.getSlot()+"</td>");
			     pw.println("<td>"+f.getDateEtry()+"</td>");
			     pw.println("<td>"+f.getExpiryDate()+"</td>");
			     pw.println("</tr>");
			}	
		pw.println("</table>");
 
	
		
			doPost(req,res);
	}
			
			protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
							
			}

	}

	




