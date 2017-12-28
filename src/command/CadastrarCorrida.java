package command;

/**
 * Este Command recebe o id do passageiro , motorista e o valor da corrida , realizando a inserção no banco 
 * 
 */

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Corrida;
import model.Motorista;
import model.Passageiro;
import service.CorridaService;


public class CadastrarCorrida implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Corrida corrida = new Corrida();
		Passageiro passageiro = new Passageiro();
		Motorista motorista = new Motorista();	
		
		
		HttpSession session = request.getSession();
		session = request.getSession();
		
		String valor = request.getParameter("preco");
		
		passageiro.setId((Integer) session.getAttribute("passageiro"));
		motorista.setId((Integer) session.getAttribute("motorista"));
		corrida.setValor(valor);
		corrida.setPassageiro(passageiro);
		corrida.setMotorista(motorista);
		
		
		CorridaService service = new CorridaService();
						
		
		try {		
			
			
			if (service.insert(corrida)) {
				String mensagem = "Corrida Cadastrada Com Sucesso !";
				request.setAttribute("sucesso", mensagem);
				RequestDispatcher view = request.getRequestDispatcher("index.jsp");
				view.forward(request, response);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		
		

	
	}
		
		
}
