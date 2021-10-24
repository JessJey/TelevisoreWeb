package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisoreweb.servic.MyServiceFactory;


@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = null;

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");

		if (marcaDaPagina.equals("") && modelloDaPagina.equals("")) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare almeno un campo.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "searchForm.jsp";
		} else {
			request.setAttribute("listTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
			destinazione = "results.jsp";
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
