package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Corrida;
import model.Motorista;
import model.Passageiro;

public class CorridaDao {

	
	public boolean insert(Corrida corrida) throws SQLException {
		
		String insert = "INSERT INTO corrida (passageiro_id,motorista_id,valor) VALUES (?,?,?)";
		
		try (Connection conn = ConnectionFactory.obtemConexao()){
			conn.setAutoCommit(false);
			
			try(PreparedStatement stm = conn.prepareStatement(insert)) {
				stm.setInt(1, corrida.getPassageiro().getId());
				stm.setInt(2, corrida.getMotorista().getId());
				stm.setString(3, corrida.getValor());
				
				stm.execute();
				conn.commit();
				conn.setAutoCommit(true);
				return true;
				
			} catch(SQLException e) {
				conn.rollback();
				conn.setAutoCommit(true);
				throw e;
			}			
			
		} catch (Exception e ) {
			e.printStackTrace();
			return false;
		}		
	}
	
	
	
	public ArrayList<Corrida> selectCorridas(){
		
		String select = "select passageiro.nome_passageiro , motorista.nome_motorista,  corrida.id, corrida.valor FROM corrida INNER JOIN passageiro ON passageiro.id = corrida.passageiro_id \r\n" + 
				"	INNER JOIN motorista ON motorista.id = corrida.motorista_id;";
		
		ArrayList<Corrida> corridas = new ArrayList<>();
		
		try(Connection conn = ConnectionFactory.obtemConexao(); 
				PreparedStatement stm = conn.prepareStatement(select);){
			
			try(ResultSet rs = stm.executeQuery()){
				
				while (rs.next()) {
					Corrida corrida = new Corrida();
					corrida.setId(rs.getInt("id"));
					corrida.setNomePassageiro(rs.getString("nome_passageiro"));
					corrida.setNomeMotorista(rs.getString("nome_motorista"));
					corrida.setValor(rs.getString("valor"));
					
					corridas.add(corrida);
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		} catch(SQLException e1) {
			e1.printStackTrace();
		}
		
		return corridas;
		
	}
	
	

	
	
	
	
}
