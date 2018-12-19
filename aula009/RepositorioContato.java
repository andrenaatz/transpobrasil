package br.com.cursojava.aula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




/**
 * Repositório de contatos, responsável por realizar a transformação
 * dos dados entre o paradigma do banco de dados e a aplicação (O.O)
 * @author Felipe
 *
 */

public class RepositorioContato {

	public void inserir(Contato contato){
		
		String sql= "insert into contatos(nome,email,telefone) values(?,?,?)";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			
			comando.execute();
			ResultSet keys = comando.getGeneratedKeys(); // traz somente o resultado do execute acima (que estou inserindo
			if(keys.next()){
				
				Integer id = keys.getInt(1); // o numero 1 representa a primeira coluna do ResultSet, que no caso é o 'id'
				contato.setId(id);
				
			}
			
			keys.close();
			comando.close();
			
			
		}catch (SQLException e){
			System.out.println("nao foi possivel inserri o registro");
			
		}
		
	}
	
public void atualizar(Contato contato){
		
		String sql= "update contatos set nome = ?, email = ?, telefone = ? where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, contato.getNome());
			comando.setString(2, contato.getEmail());
			comando.setString(3, contato.getTelefone());
			comando.setInt(4, contato.getId());
			
			comando.executeUpdate();
			comando.close();
			
						
		}catch (SQLException e){
			System.out.println("nao foi possivel atualizar o registro");
			
		}
		
	}
	
public void remover(Integer id){
	
	String sql= "delete from contatos where id = ?";
	
	Connection conexao = BancoUtil.getConexao();
	
	try{
		
		PreparedStatement comando = conexao.prepareStatement(sql);
		
		comando.setInt(1, id);
		
		comando.execute();
		comando.close();
		
					
	}catch (SQLException e){
		e.printStackTrace();
		System.out.println("nao foi possivel remover o registro");
		
	}
	
}
	public List<Contato> buscarTodos(){
		List<Contato> lista = new ArrayList<>();
		String sql = "select * from contatos";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Contato contato = null;
			while(cursor.next()){
				contato = criarContato(cursor);
				lista.add(contato);
				
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			System.out.println("Nao foi possivel recuperar a lista de registros");
			
		}
		
		
		
		return lista;
		
		
	}
	
	public long contar(){
		
		String sql = "select count (*) as total from contatos";
		Connection conexao = BancoUtil.getConexao();
		long total = 0;
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			
			if(cursor.next()){
				total = cursor.getLong("total");
						
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Nao foi possivel contar a qtde de registros");
			
		}
				
		
		return total;
		
	}
	
	public Contato buscarPorId(Integer id){
		Contato contato = null;
	
		String sql = "select * from contatos where id = ?";
		Connection conexao = BancoUtil.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1,  id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				contato = criarContato(cursor);
						
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Nao foi possivel recuperar a lista de registros");
			
		}
		
		
		
		return contato;
	}

	private Contato criarContato(ResultSet cursor) throws SQLException{
	Integer id = cursor.getInt("id");
	String nome = cursor.getString("nome");
	String email = cursor.getString("email");
	String telefone = cursor.getString("telefone");
	return new Contato(id,nome,email,telefone);
	
}
	
}









