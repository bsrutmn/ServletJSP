package servletNotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="InitParamsWithNotation",urlPatterns= {"/initParamsWithNotation","/params"},
initParams= {@WebInitParam(name="bsrutmn",value="Busra Utmn"),@WebInitParam(name="kbrautmn",value="Kübra Utmn")})
public class InitParamsWithNotation extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		PrintWriter writer =response.getWriter();
		Enumeration<String> initParameterList =getInitParameterNames();
		
		while (initParameterList.hasMoreElements()) {
			String string = (String) initParameterList.nextElement();
			writer.write("<html><body>");
			writer.write(" "+string+"</br>");
			
			
		}
		
		writer.write(" "+ getServletConfig().getInitParameter("bsrutmn")+"</br>");
		writer.write(" "+ getServletConfig().getInitParameter("kbrautmn"));
		writer.write("</body></html>");
	} 	 	

}
