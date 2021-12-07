package app;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet implements Servlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String usuario= req.getParameter("username");
		String password= req.getParameter("password");
		
		if(password.equals("1234")) {
			req.getSession().setAttribute("username", usuario);;			
			resp.sendRedirect("welcome.jsp");
			}else {
				req.setAttribute("flash", "usuario o contraseña incorrecta");
				RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/Login.jsp");
				dispatcher.forward(req, resp);
				//resp.sendRedirect("Login.jsp");
		}
		//resp.getWriter().append("<p>contraseña " + b+ "</p>");
	}
	
	

}
