package servlet.context.example;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ReadingFileWithServletContext",urlPatterns= {"/ReadingFileWithServletContext"})
public class ReadingFileWithServletContext extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context =getServletContext();
		
		//txt okumak için
		InputStream txtStream= context.getResourceAsStream("/WEB-INF/person.txt");
		
		int content;
		ServletOutputStream servletOutputStream = response.getOutputStream();
		while ((content=txtStream.read())!=-1) {
			servletOutputStream.write(content);
			
		}
		
		
	}

}
