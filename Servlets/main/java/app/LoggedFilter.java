package app;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("*.do")
public class LoggedFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String user = (String) ((HttpServletRequest) request).getSession().getAttribute("username");
		
		if (user != null && user != "") {
			chain.doFilter(request, response);
		}
		else {
			request.setAttribute("flash", "por favor ingresa para ver el contenido");
			RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
		}

	}

}
