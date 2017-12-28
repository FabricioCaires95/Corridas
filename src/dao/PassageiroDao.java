package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Passageiro;

public class PassageiroDao {

	
	public boolean insert (Passageiro passageiro) throws SQLException {
		
		String insert = "INSERT INTO passageiro (nome_passageiro,cpf,sexo,nascimento) VALUES (?,?,?,?)";
		
		try (Connection conn = ConnectionFactory.obtemConexao()){
			conn.setAutoCommit(false);
			
			try(PreparedStatement stm = conn.prepareStatement(insert)) {
				stm.setString(1, passageiro.getNome());
				stm.setString(2, passageiro.getCpf());
				stm.setString(3, passageiro.getSexo());
				stm.setDate(4, passageiro.getNascimento());
				stm.execute();
				
				conn.commit();
				conn.setAutoCommit(true);
				return true;
				
			} catch(SQLException e) {
				conn.rollback();
				conn.setAutoCommit(true);
				throw e;
			} catch(Exception e) {
				e.printStackTrace();
				return false;
			}
		}		
		
	}
	
	
	
	public ArrayList<Passageiro> listarPassageiros(){
		
		ArrayList<Passageiro> passageiros = new ArrayList<>();
		String select = "SELECT id,nome_passageiro,cpf,sexo,nascimento FROM passageiro";
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(select);){
			
			try (ResultSet rs = stm.executeQuery()){
				while(rs.next()) {
					Passageiro passageiro = new Passageiro();
					passageiro.setId(rs.getInt("id"));
					passageiro.setNome(rs.getString("nome_passageiro"));
					passageiro.setCpf(rs.getString("cpf"));
					passageiro.setSexo(rs.getString("sexo"));
					passageiro.setNascimento(rs.getDate("nascimento"));
					passageiros.add(passageiro);
					
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		return passageiros;
		
	}
	
	
}
