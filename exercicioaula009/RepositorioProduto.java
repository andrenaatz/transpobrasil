package br.com.cursojava.exercicioaula009;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class RepositorioProduto {

public void inserir(Produto produto){
		
		String sql= "insert into produtos(nome,descricao,preco) values(?,?,?)";
		Connection conexao = BancoUtil2.getConexao();
		
		try{
			
			PreparedStatement comando = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			
			comando.execute();
			ResultSet keys = comando.getGeneratedKeys(); // traz somente o resultado do execute acima (que estou inserindo
			if(keys.next()){
				
				Integer id = keys.getInt(1); // o numero 1 representa a primeira coluna do ResultSet, que no caso é o 'id'
				produto.setId(id);
				
			}
			
			keys.close();
			comando.close();
			
			
		}catch (SQLException e){
			System.out.println("nao foi possivel inserri o registro");
			
		}
		
	}
	
public void atualizar(Produto produto){
		
		String sql= "update produtos set nome = ?, descricao = ?, preco = ? where id = ?";
		Connection conexao = BancoUtil2.getConexao();
		
		try{
			
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setString(1, produto.getNome());
			comando.setString(2, produto.getDescricao());
			comando.setDouble(3, produto.getPreco());
			comando.setInt(4, produto.getId());
			
			comando.executeUpdate();
			comando.close();
			
						
		}catch (SQLException e){
			System.out.println("nao foi possivel atualizar o registro");
			
		}
		
	}
	
public void remover(Integer id){
	
	String sql= "delete from produtos where id = ?";
	
	Connection conexao = BancoUtil2.getConexao();
	
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
	public List<Produto> buscarTodos(){
		List<Produto> lista = new ArrayList<>();
		String sql = "select * from produtos";
		Connection conexao = BancoUtil2.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while(cursor.next()){
				produto = criarProduto(cursor);
				lista.add(produto);
				
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			System.out.println("Nao foi possivel recuperar a lista de registros");
			
		}
		
		
		
		return lista;
		
		
	}
	
	public long contar(){
		
		String sql = "select count (*) as total from produtos";
		Connection conexao = BancoUtil2.getConexao();
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
	
	public Produto buscarPorId(Integer id){
		Produto produto = null;
	
		String sql = "select * from produtos where id = ?";
		Connection conexao = BancoUtil2.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setInt(1,  id);
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				produto = criarProduto(cursor);
						
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Nao foi possivel recuperar a lista de registros");
			
		}
		
		
		
		return produto;
	}

	public Produto buscarPorPreco(double precoinicial, double precofinal){
		List<Produto> lista = new ArrayList<>();
				
				String sql = "select * from produtos where preco betwenn ? and ?";
		Connection conexao = BancoUtil2.getConexao();
		
		try{
			PreparedStatement comando = conexao.prepareStatement(sql);
			comando.setDouble(1, precoinicial);
			comando.setDouble(2, precofinal);
			ResultSet cursor = comando.executeQuery();
			Produto produto = null;
			while(cursor.next()){
				produto = criarProduto(cursor);
				lista.add(produto);
						
			}
			cursor.close();
			comando.close();
			
		}catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Nao foi possivel recuperar a lista de registros");
			
		}
		
		
		
		return produto;
	}
	private Produto criarProduto(ResultSet cursor) throws SQLException{
	Integer id = cursor.getInt("id");
	String nome = cursor.getString("nome");
	String descricao = cursor.getString("descricao");
	Double preco = cursor.getDouble("preco");
	return new Produto(id,nome,descricao,preco);
	
}
	
	
	
}
