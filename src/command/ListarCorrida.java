package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Corrida;
import service.CorridaService;

public class ListarCorrida implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		CorridaService service = new CorridaService();
		ArrayList<Corrida> lista = null; 
		
		
		lista = service.selectCorridas();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("listarCorrida.jsp");
		dispacher.forward(request, response);

	}

}
