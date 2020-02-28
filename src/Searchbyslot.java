

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
import com.search.SlotData;
import com.search.SearchBySlotJDBC;

	@WebServlet("/sl")
	public class Searchbyslot  extends HttpServlet{
		private static final long serialVersionUID = 1L;
		
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String slot=req.getParameter("s1");
		
		
		
		
		ArrayList<SlotData> list= new ArrayList();
				list= (ArrayList<SlotData>) SearchBySlotJDBC.displayData(slot);
		
		if ( list.size() == 0 ) {
			pw.println("<h1>  This slot is available for parking<h1>");
		}
		else {
			pw.println("<table border=2 width=50>");
			pw.println("<th>slot Id</th><th>car Number</th><th>rate</th><th>status</th>");
    	for(int i = 0; i <list.size(); i++) {
			pw.println("<tr>");
			SlotData f=list.get(i);
			
			
			     pw.println("<td>"+f.getS()+"</td>");
			     pw.println("<td>"+f.getNo()+"</td>");
			     pw.println("<td>"+f.getR()+"</td>");
			     
			     int flagstatus=f.getFlag();
			     String available="avilable";
			     String reserve="reserve";
			     System.out.println(flagstatus);
			     if(flagstatus==0)
			     {
			    	 pw.println("<td>"+available+"</td>");
			     }
			     else
			     {
			     pw.println("<td>"+reserve+"</td>");
			     }
			  
			     pw.println("</tr>");
			     pw.println("</table>");
			}	
    	
    	}
		
		
			doPost(req,res);
	}
			
			protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
							
			}

	}

	





