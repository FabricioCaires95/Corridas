package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author fabri
 * Classe que realiza conexão com o banco de dados 
 */

public class ConnectionFactory {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {	
			throw new RuntimeException();
		}
	}
	
	//Obtém conexão com o banco 
	public static Connection obtemConexao() throws SQLException {
		
		return DriverManager.getConnection("jdbc:mysql://localhost/uber?user=root&password=fa30645800");
		
	}

}
