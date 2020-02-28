

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AddCar.AddCarEntry;

/**
 * Servlet implementation class Car
 */
@WebServlet("/abc")
public class AddCarByAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doPost(req,res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String carNumber=req.getParameter("no");
		
		String color=req.getParameter("color");
		
		String slot=req.getParameter("slot");
		
		String dte=req.getParameter("dte");
	
			int x=AddCarEntry.carEntry(carNumber,color,slot,dte);
			if(x==1)
			{
				pw.println("added");
			}
			else
			{
				pw.println("not");
			}
		
	}
	
	

}
