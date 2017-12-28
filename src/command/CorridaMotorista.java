package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorista;
import service.MotoristaService;

public class CorridaMotorista implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		MotoristaService service = new MotoristaService();
		
		ArrayList<Motorista> lista = null; 
		
		lista = service.motoristasAtivos();
		
		request.setAttribute("lista", lista);
		
		RequestDispatcher dispacher = request.getRequestDispatcher("corrida1.jsp");
		dispacher.forward(request, response);
		

	}

}
