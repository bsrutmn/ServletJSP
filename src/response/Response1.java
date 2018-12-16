package response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/response1")
public class Response1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer =response.getWriter();
			
			response.setContentType("text/html;charset=UTF-8");
			writer.write("<html>");
			writer.write("<head><meta charset='UTF-8'></head>");
			writer.write("<body>");
			writer.write("<p>Bugün hava çok güzel Büşra<p>");
			writer.write("</body></html>");
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}

}
