package service;

import java.sql.SQLException;
import java.util.ArrayList;


import dao.PassageiroDao;
import model.Passageiro;

public class PassageiroService {

	PassageiroDao dao = new PassageiroDao();
	
	public boolean insert(Passageiro passageiro) throws SQLException {
		
		return dao.insert(passageiro);
		
	}
	
	public ArrayList<Passageiro> listarPassageiros(){
		
		return dao.listarPassageiros();
	}
	
}
