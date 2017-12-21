package command;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Motorista;
import service.MotoristaService;

public class CadastrarMotorista implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Motorista motorista = new Motorista();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
		motorista.setNome(request.getParameter("nome"));
		motorista.setCpf(request.getParameter("cpf"));
		motorista.setSexo(request.getParameter("sexo"));
		motorista.setModeloCarro(request.getParameter("modelo"));
		motorista.setStatus(request.getParameter("status"));
		
		try {
			String nasc = request.getParameter("nascimento");
			Date date = formatar.parse(nasc);
			java.sql.Date sqlData = new java.sql.Date(date.getTime());
			motorista.setNascimento(sqlData);
		} catch (ParseException e ) {
			e.printStackTrace();
		}
		
		
		MotoristaService service = new MotoristaService();
		
		try {
			if(service.insert(motorista)) {
				request.setAttribute("motorista cadastrado", "Motorista cadastrado com sucesso");
				RequestDispatcher view = request.getRequestDispatcher("index.jsp");
				view.forward(request, response);
			} else {
				String mensagem = "Erro ao cadastrar , favor verifique os campos !";
				request.setAttribute("mensagem", mensagem);
				RequestDispatcher view = request.getRequestDispatcher("motorista.jsp");
				view.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
