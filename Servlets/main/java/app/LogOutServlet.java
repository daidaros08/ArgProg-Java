package app;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet implements Servlet {
	
	private static final long serialVersionUID = -4174563849713817321L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().removeAttribute("username");
		req.setAttribute("flash", "hasta pronto!");
		RequestDispatcher dispatcher =getServletContext().getRequestDispatcher("/Login.jsp");
		dispatcher.forward(req, resp);
		
	}

}
