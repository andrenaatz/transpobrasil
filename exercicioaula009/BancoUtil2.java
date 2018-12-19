package br.com.cursojava.exercicioaula009;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtil2 {
	
	
	
	private static final String URL ="jdbc:postgresql://localhost:5432/curso";
	private static final String USUARIO = "postgres";
	private static final String SENHA ="admin";
	private static final String DRIVER = "org.postgresql.Driver";
	private static Connection conexao;
	
	//CARREGAMENTO PARA VERSOES ANTIGAS:
	
	static{
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("nao foi possivel carregar o Driver do Banco");
		}
		
	}

// fim do carregamento
	
	
public static Connection getConexao(){
	try{
	if(conexao == null || conexao.isClosed()){
		
		conexao = DriverManager.getConnection(URL,USUARIO,SENHA);
	}
	}catch(SQLException ex){
		System.out.println("Falha na conexao com o banco de dados");
		ex.printStackTrace();
	}
	return conexao;
	}

/*

public static void main(String[] args) throws SQLException{
	
	Connection con = getConexao();
	if(con !=null){
		System.out.println("Conex�o realizada com sucesso");
		con.close();
	}else{
		
		System.out.println("Ops, Turma temos um problema");
	}
	
	
}
	
*/

}
