package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Passageiro;
import service.PassageiroService;

public class ListarPassageiro implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PassageiroService service = new PassageiroService();
		ArrayList<Passageiro> lista = null;
		
		Passageiro passageiro = new Passageiro();
		
		
		
		
		lista = service.listarPassageiros();
		
		
	
		request.setAttribute("lista", lista);
		
		
		RequestDispatcher dispacher = request.getRequestDispatcher("listarPassageiro.jsp");
		dispacher.forward(request, response);
		

	}

}
