package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.MotoristaDao;
import model.Motorista;

public class MotoristaService {

	MotoristaDao dao = new MotoristaDao();
	
	public boolean insert(Motorista motorista) throws SQLException {
		return dao.insert(motorista);
	}
	
	
	public ArrayList<Motorista> listarMotoristas(){
		return dao.listarMotorista();
	}
	
	public void alterar(Motorista motorista) {
		 dao.alterar(motorista);
	}
	
}
