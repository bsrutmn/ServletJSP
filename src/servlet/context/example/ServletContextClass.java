package servlet.context.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletContextClass extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		ServletContext context = getServletContext();
		String  webSite =context.getInitParameter("website");
		Enumeration<String> parameterNames=context.getInitParameterNames();
		PrintWriter writer=response.getWriter();
		writer.write(webSite+ " ");
		String  githubAddress =context.getInitParameter("githubaddress");
		writer.write(githubAddress + " ");
		
		
		while (parameterNames.hasMoreElements()) {
			String string = (String) parameterNames.nextElement();
			writer.write("  "+string +"  ");
			
		}
		writer.close();
	}
	

}
