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


@WebServlet("/ExecuteModificaServlet")
public class ExecuteModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ExecuteModificaServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idDaModificare = Long.parseLong(request.getParameter("id"));
    	TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
    	String marca = request.getParameter("marcaTelevisore");
		String modello = request.getParameter("modelloTelevisore");
		String numeroSeriale = request.getParameter("numeroSerialeTelevisore");
		int prezzo = Integer.parseInt(request.getParameter("prezzoTelevisore"));
		
		Televisore televisoreDaModificare = new Televisore(idDaModificare,marca, modello, numeroSeriale, prezzo);
    	
		if (marca.equals("") && modello.equals("") && numeroSeriale.equals("") && prezzo <0) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare almeno un campo.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			RequestDispatcher rd = request.getRequestDispatcher("searchForm.jsp");
		}else
    	try {
			televisoreServiceInstance.modifica(televisoreDaModificare);
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.lista());
			RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
}


