package Dao4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Modelo2.Pessoas;

public class PessoasDao {

	public void inserirPessoa(Pessoas p) {
		
		/*
		 * Isso é um Comando SQL comum de Insert, 
		 * as ? são os paramentros que nós vamos adcionar a base de dados
		 */
		
		String sql = "INSERT INTO PESSOAS(ID_PESSOAS, NOME, SEXO, IDADE)" +
		"VALUES (DEFAULT,?,?,?)";
		
		//Classe java de conexão com o bd
		Connection conexao = null;
		
		//Classe java de execução de query
		PreparedStatement executaQuery = null;
		
		try {
			//Cria conexao com o banco de dados
			conexao = ConnectionFactory.createConnectionToPostgres();
			
			//Cria um preparedStatement, Classe que executa Query
			executaQuery = conexao.prepareStatement(sql);
			
			//Adiciona o valor do primeiro paramentro sql
			executaQuery.setString(1, p.getNome());
			
			//Adiciona o valor do segundo paramentro sql
			executaQuery.setString(2, p.getSexo());
			
			//Adiciona o valor do terceiro paramentro sql
			executaQuery.setInt(3, p.getIdade());
			
			//Executa a sql para inserção dos dados
			executaQuery.executeUpdate();
			System.out.println("Dados enviado com Sucesso!");

		} catch (Exception erro) {
			erro.printStackTrace();
		} finally {
			
			//Fecha as conexões com o banco
			try {
				if(executaQuery != null) {
					executaQuery.close();
				}
				if(conexao != null) {
					conexao.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}


