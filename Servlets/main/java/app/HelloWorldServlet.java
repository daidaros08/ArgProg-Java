package app;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet implements Servlet {
       

	private static final long serialVersionUID = 1496403630343293260L;

	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletResponse response2= (HttpServletResponse)response;
		response2.getWriter()
		.append("<h1>")
		.append("¡Hola, Mundo!")
		.append("<h1>")
		.append("<p>")
		.append(new java.util.Date().toString())
		.append("</p>");
	}

}
