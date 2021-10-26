package LoginJava;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet (name="loginServlet", urlPatterns = "/loginadmin")

public class LoginServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html");
		
		String loginForm = "<html lang=\"en\">\r\n"
				+ "  <body>\r\n"
				+ "    <h3>Đăng nhập</h3>\r\n"
				+ "    <form action=\"\" method=\"post\">\r\n"
				+ "      <label>Username: </label>\r\n"
				+ "      <input type=\"text\" name=\"username\" />\r\n"
				+ "      <br>\r\n"
				+ "      <label>Password: </label>\r\n"
				+ "      <input type=\"password\" name=\"password\" />\r\n"
				+ "      <br>\r\n"
				+ "      <input type=\"submit\" value=\"Đăng nhập\" />\r\n"
				+ "    </form>\r\n"
				+ "  </body>\r\n"
				+ "</html>";
		resp.getWriter().append(loginForm);
	}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			resp.setCharacterEncoding("UTF-8");
			req.setCharacterEncoding("UTF-8");
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			
			System.out.println(username);
			System.out.println(password);
			
			if("admin123456".equals(username + password)) {
				resp.sendRedirect(req.getContextPath() +"/welcome");
			} else {
				this.doGet(req,resp);
			}
	}
		
}	
