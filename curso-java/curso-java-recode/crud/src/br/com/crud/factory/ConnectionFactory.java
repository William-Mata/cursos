package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// nome do usuario do mysql
	private static final String USERNAME = "root";

	// senha do usuario do mysql
	private static final String PASSWORD = "1234";
	
	// dados de caminho para realizar a conexão, porta, nome da base de dados que ira ser feita a conexão
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/crud";
	
	/**
	 * Cria a conexão com o banco de dados MySQL utilizando o nome de usuario e senha fornecidos
	 * @param username
	 * @param password
	 * @param database_url
	 * @return uma conexão com o banco de dados
	 * @throws Exception
	 */
	
	public static Connection createConnectionToMySQL() throws Exception{
		
		// Faz com que seja carregada a classe pela JVM
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	
		// Cria a conexão com o banco de dados
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}

	public static void main(String[] args) throws Exception {

		//Recupera uma conexão com o banco de dados
		Connection con = createConnectionToMySQL();

		// testa se a conexão e nulla
		if(con != null) {
		
			System.out.println("Conexão obtida com sucesso! " + con);
			con.close();
		}
	}
	
	
}	