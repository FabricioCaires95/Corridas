package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Motorista;

public class MotoristaDao {

	
	public boolean insert (Motorista motorista ) throws SQLException {
		
		String insert = "INSERT INTO motorista (nome,cpf,sexo,modeloCarro,status,nascimento) VALUES(?,?,?,?,?,?)";
		
		try (Connection conn = ConnectionFactory.obtemConexao()){
			conn.setAutoCommit(false);
			
			try(PreparedStatement stm = conn.prepareStatement(insert)) {
				stm.setString(1, motorista.getNome());
				stm.setString(2, motorista.getCpf());
				stm.setString(3, motorista.getSexo());
				stm.setString(4, motorista.getModeloCarro());
				stm.setString(5, motorista.getStatus());				
				stm.setDate(6, motorista.getNascimento());
				
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
	
	
	public ArrayList<Motorista> listarMotorista(){
		
		ArrayList<Motorista> motoristas = new ArrayList<>();
		
		String select = "SELECT id,nome,cpf,sexo,modeloCarro,status,nascimento FROM motorista";
		
		try(Connection conn = ConnectionFactory.obtemConexao(); 
				PreparedStatement stm = conn.prepareStatement(select);){
			
			try (ResultSet rs = stm.executeQuery()){
				while (rs.next()) {
					Motorista motorista = new Motorista();
					motorista.setId(rs.getInt("id"));
					motorista.setNome(rs.getString("nome"));
					motorista.setCpf(rs.getString("cpf"));
					motorista.setSexo(rs.getString("sexo"));
					motorista.setModeloCarro(rs.getString("modeloCarro"));
					motorista.setStatus(rs.getString("status"));
					motorista.setNascimento(rs.getDate("nascimento"));
					
					motoristas.add(motorista);
				}
				
			} catch(SQLException e ) {
				e.printStackTrace();
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		 return motoristas;
	}
	
	public void alterar(Motorista motorista) {
		
		String update = "UPDATE motorista SET status = ? WHERE id=?";
		
		
		try (Connection conn = ConnectionFactory.obtemConexao();
				PreparedStatement stm = conn.prepareStatement(update)) {
			
			stm.setString(1, motorista.getStatus());
			stm.setInt(2, motorista.getId());
			stm.execute();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
	}
	
}
