package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {		
	private static final String DRIVER 			= "org.postgresql.Driver";//DRIVER DE CONEXAO
    private static final String DATABASE_URL	= "jdbc:postgresql://localhost:5432/Banco-Pesquisador";//CAMINHO DO BANCO DE DADOS
    private static final String USERNAME 		= "postgre";//USUARIO
    private static final String PASSWORD 		= "Vs@eterno";//SENHA
	private static Connection connection        = null;    		
	
				  //RETORNO       //NOME DO MÉTODO
    public static Connection createConnectionToPostgres() {
        try {        	
        	Class.forName(DRIVER);                    	
        	connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);        	
        } catch (ClassNotFoundException ex) {
            System.out.println("ERRO ao conectar a base de dados!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                		
		return connection;
    }
    
	   
}
