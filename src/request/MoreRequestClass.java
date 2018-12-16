package request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name= "MoreRequestMethods",urlPatterns= {"/MoreRequestMethods"})
public class MoreRequestClass extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer= response.getWriter();
		writer.write("<html><body>");
		String serverName =request.getServerName();
		String headerInfo = request.getHeader("host");
		int ServerPort=request.getServerPort();
		int localPort = request.getLocalPort();
		int remotePort = request.getRemotePort();
		String method = request.getMethod();
		String contexPath = request.getContextPath();
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			writer.write("header names:"+string+ "<br/>");
			
		}
		writer.write("serverName: "+ serverName+"<br/>");
		writer.write("headerInfo: "+headerInfo +"<br/>");
		writer.write("ServerPort: "+ ServerPort+"<br/>");
		writer.write("localPort: "+ localPort+"<br/>");
		writer.write("remotePort: "+remotePort+ "<br/>");
		writer.write("method: "+method+ "<br/>");
		writer.write("contexPath: "+ contexPath+"<br/>");
		writer.write("</body></html>");
		writer.close();
		
	}

}
