package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorista;
import model.Passageiro;
import service.MotoristaService;
import service.PassageiroService;

public class CorridaListar implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
			PassageiroService service = new PassageiroService();			
		
			
			ArrayList<Passageiro> lista = null;	
			
					
			lista = service.listarPassageiros();		
			
			
			
			request.setAttribute("lista", lista);			
		
		
		
		
			RequestDispatcher dispacher = request.getRequestDispatcher("corrida.jsp");
			dispacher.forward(request, response);
		

	}

}
