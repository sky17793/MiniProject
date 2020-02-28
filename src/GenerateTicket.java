import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.AddCar.DeleteCar;
import com.getticket.GetTicketJDBC;


@WebServlet("/r4")
public class GenerateTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doPost(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String carNumber=req.getParameter("no");
		String color=req.getParameter("color");
		
		String date[]=req.getParameterValues("date1");
		System.out.println(date[0]);
		
	
			int x=GetTicketJDBC.getticket(carNumber,color,date[0]);		
			pw.println("<button><a href=\"index.html\">home</a></button>");
			pw.println("<html> <body>");
			pw.println("<form>");
			pw.println("<h1>parking ticket</h1><br>");
			
			pw.println("<h3>your parking slot is : </h3><input type='text' value='"+x+"'>");
			pw.println("</form></body></html>");
			
			if(x==0)
			{
				pw.println("parking is full");
			}
		
	}
	
	

}



