


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ExitFile")
public class DataForReleaseCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter pw=res.getWriter();
	
		
		String k=req.getParameter("id");
		
		pw.println("<h4>Please enter the date of car release<h4>");
				
		 pw.println("<form action=LastPage>");
	     pw.print("<input type=text name=no value="+k+">");
	     pw.print("<input type=date name=dt><br>");
	     
	     pw.println("<input type=submit>");
	     pw.println("</form>");
		
		
		

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}
	
	

}

