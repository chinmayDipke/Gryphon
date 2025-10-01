import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*; 
 

public class PRP_Backend extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//int i = req.getParameter("num1");
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
	
		int k = i + j;
		System.out.println("Result: "+k);

		int a = Integer.parseInt(req.getParameter("num3"));
		int b = Integer.parseInt(req.getParameter("num4"));
		
		int c = a - b;
		System.out.println("Result: "+c);
		
		PrintWriter out =  res.getWriter();
		out.println("Add: "+k);
		out.println("Sub: "+c);
	}
}
