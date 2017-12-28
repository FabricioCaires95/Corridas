package service;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.CorridaDao;
import model.Corrida;

public class CorridaService {

	
	CorridaDao dao = new CorridaDao();
	
	
	public boolean insert (Corrida corrida) throws SQLException {
		
		return dao.insert(corrida);
	}
	
	
	public ArrayList<Corrida> selectCorridas(){
		
		return dao.selectCorridas();
	}
	
}
