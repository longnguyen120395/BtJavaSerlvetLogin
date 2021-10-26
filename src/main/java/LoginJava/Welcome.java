package LoginJava;

import java.io.IOException;
import java.io.Writer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet (name = "welcomeServlet", urlPatterns = "/welcome")

public class Welcome extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String message = "Welcome to Java Servlet.";
		resp.setContentType("text/html");
		Writer writer = resp.getWriter();
		writer.append(message);
		
		writer.close();
}
}