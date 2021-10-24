package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrepareInsertTelevisoreServlet")
public class PrepareInsertTelevisoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrepareInsertTelevisoreServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("nuovoinserimentotelevisore.jsp");
		rd.forward(request, response);
	}


}
