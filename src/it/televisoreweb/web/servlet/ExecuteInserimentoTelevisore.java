package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisoreweb.model.Televisore;
import it.televisoreweb.servic.MyServiceFactory;
import it.televisoreweb.service.televisore.TelevisoreService;

@WebServlet("/ExecuteInserimentoTelevisore")
public class ExecuteInserimentoTelevisore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteInserimentoTelevisore() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String marca = request.getParameter("marcaInput");
		String modello = request.getParameter("modelloInput");
		String numeroSeriale = request.getParameter("numeroSerialeInput");
		int prezzo = Integer.parseInt(request.getParameter("prezzoInput"));
		Televisore televisoreDaInserire = new Televisore(marca, modello, numeroSeriale, prezzo);

		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		try {
			televisoreServiceInstance.inserimento(televisoreDaInserire);
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.lista());
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);

	}

}
