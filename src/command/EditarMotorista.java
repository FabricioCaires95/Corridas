package command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorista;

import service.MotoristaService;

public class EditarMotorista implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		Motorista motorista = new Motorista();		
		motorista.setId(Integer.parseInt(request.getParameter("id")));
		MotoristaService service = new MotoristaService();
		String atual = request.getParameter("status");
		
		
		if (atual.equals("ativo")) {
			motorista.setStatus("inativo");
			
		} else if (atual.equals("inativo")) {
			motorista.setStatus("ativo");
		}
			
		service.alterar(motorista); 
		
		String mensagem = "Status alterado com sucesso !";
		request.setAttribute("sucesso", mensagem);
	
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request, response);
		
	}
	
	


}
