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


@WebServlet("/PreparaDeleteServlet")
public class PreparaDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PreparaDeleteServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametroIdDelTelevisoreDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisoreService abitanteServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		Televisore result = abitanteServiceInstance
				.cercaPerId(Long.parseLong(parametroIdDelTelevisoreDiCuiVoglioIlDettaglio));

		request.setAttribute("televisoreDaInviareAPaginaDettalio", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
		rd.forward(request, response);	
		}


}
