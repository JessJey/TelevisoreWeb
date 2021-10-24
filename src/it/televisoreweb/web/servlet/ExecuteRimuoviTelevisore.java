package it.televisoreweb.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisoreweb.servic.MyServiceFactory;
import it.televisoreweb.service.televisore.TelevisoreService;


@WebServlet("/ExecuteRimuoviTelevisore")
public class ExecuteRimuoviTelevisore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExecuteRimuoviTelevisore() {
        super();
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long idDaRimuovere = Long.parseLong(request.getParameter("id"));
    	TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
    
    	try {
			televisoreServiceInstance.rimuovi(televisoreServiceInstance.cercaPerId(idDaRimuovere));
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.lista());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
		
	}

}
