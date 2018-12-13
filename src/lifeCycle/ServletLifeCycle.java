package lifeCycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifeCycle")
public class ServletLifeCycle extends HttpServlet {
	
	public void init() {
		System.out.println("init metodu çağırıldı");
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		writer.write("Yasam döngüsü");
	
}
	public void destroy() {
		System.out.println("Servlet destroy metodu çağırıldı");
	}


}
