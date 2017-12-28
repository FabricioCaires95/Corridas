package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Motorista;
import service.MotoristaService;

public class GuardarDado implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		HttpSession session = request.getSession();
		session = request.getSession();
		String proxPag = null;
		
		int pagina = Integer.parseInt(request.getParameter("pagina"));
		
		
		if (pagina == 1 ) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			session.setAttribute("passageiro", id);
			
			proxPag = "/corrida1.jsp";
			
		} else if (pagina == 2 ) {
			
			int id = Integer.parseInt(request.getParameter("id"));
			session.setAttribute("motorista", id);
			proxPag = "/valor.jsp";
			
		} 
		
		
		request.getRequestDispatcher(proxPag).forward(request, response);
		
		

	}

}
