package request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="RequestTutorial",urlPatterns= {"/RequestTutorial"})
public class RequestTutorial extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		writer.write(request.getParameter("firstName")+" ");
		writer.write(request.getParameter("surName") +" ");
		writer.write(request.getParameter("marialStatus")+" ");
		
		String[] parameters=request.getParameterValues("progLang");
		for (int i = 0; i < parameters.length; i++) {
			writer.write(" "+parameters[i]+ " ");
			
		}
	
	}

}
