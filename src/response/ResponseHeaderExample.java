package response;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/responseHeaderExample"})
public class ResponseHeaderExample extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setHeader("arkadas", "sevgi");
	response.setHeader("arkadas", "merve");
	
	boolean isArkadasAbsent = response.containsHeader("arkadas");
	System.out.println("arkadas header ı var mı:"+isArkadasAbsent);
	
	String arkadas = response.getHeader("arkadas");
	response.addHeader("arkadas", "büşra");
	response.addHeader("arkadas", "elif");
	
	Collection<String> arkadasHeaders = response.getHeaders("arkadas");
	
	for (String string:arkadasHeaders) {
		System.out.println(string);
	}
	response.setIntHeader("yas", 22);
	response.addIntHeader("yil", 2018);
	
	response.setDateHeader("today", System.currentTimeMillis());
	response.addDateHeader("today", 1000000L);
	
	Collection<String> headersName = response.getHeaderNames();
	
	for (String string :headersName) {
		System.out.println(string);
		
	}
	}

}
