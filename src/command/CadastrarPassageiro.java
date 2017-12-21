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



import model.Passageiro;
import service.PassageiroService;

public class CadastrarPassageiro implements Command {

	@Override
	public void executar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		Passageiro passageiro = new Passageiro();
		SimpleDateFormat formatar = new SimpleDateFormat("yyyy-MM-dd");
		passageiro.setNome(request.getParameter("nome"));
		passageiro.setCpf(request.getParameter("cpf"));
		passageiro.setSexo(request.getParameter("sexo"));
		
		try {
			String nasc = request.getParameter("nascimento");
			Date date = formatar.parse(nasc);
			java.sql.Date sqlData = new java.sql.Date(date.getTime());
			passageiro.setNascimento(sqlData);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		
		PassageiroService service = new PassageiroService();
		
		try {
			if (service.insert(passageiro)) {
				String mensagem = "Passageiro Cadastrado com sucesso !";
				request.setAttribute("sucesso", mensagem);
				RequestDispatcher view = request.getRequestDispatcher("index.jsp");
				view.forward(request, response);
			} else {
				String mensagem = "Erro ao cadastrar , favor verifique os campos !";
				request.setAttribute("mensagem", mensagem);
				RequestDispatcher view = request.getRequestDispatcher("passageiro.jsp");
				view.forward(request, response);
			}			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
