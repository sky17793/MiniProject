

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AddCar.DeleteCar;


@WebServlet("/LastPage")
public class GetRelease extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		int cid=Integer.parseInt(request.getParameter("no"));
		
		String subdate=request.getParameter("dt");
		
		int x=DeleteCar.exitEntry(cid, subdate);
		if(x!=0)
		{
			
			pw.println("car has released");
		}
		
	}

}
