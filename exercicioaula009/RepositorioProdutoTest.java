package br.com.cursojava.exercicioaula009;

import java.util.List;




public class RepositorioProdutoTest {
	
	
public static void main(String[] args) {
		
		
		
		testBuscarPorPreco();
		
	}

	private static void testInserir(){
		
		Produto produto = new Produto(null, "Martelo", "serve pra bater", 800.00);
		RepositorioProduto repositorio = new RepositorioProduto();
		
		repositorio.inserir(produto);
		System.out.println(produto);
		System.out.println("OK");
		
	}
	
	private static void testListarTodos(){
		
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> buscarTodos = repositorio.buscarTodos();
		
		System.out.println("Listar todos");
		
		for (Produto produto : buscarTodos){
			
			System.out.println(produto);
		}
	}
	
	private static void testBuscarPorId(){
		
		RepositorioProduto repositorio = new RepositorioProduto();
		System.out.println("Buscar por ID");
		System.out.println(repositorio.buscarPorId(2));
		System.out.println(repositorio.buscarPorId(7));
		
	}
	


private static void testBuscarPorPreco(){
	
	RepositorioProduto repositorio = new RepositorioProduto();
	System.out.println("Buscar por PRECO");
	System.out.println(repositorio.buscarPorPreco(100.00,1000.00));
	
	
}
	
	private static void testAtualizar(){
		
		RepositorioProduto repositorio = new RepositorioProduto();
		Produto produto = repositorio.buscarPorId(1);
		
		produto.setNome("Serrote");
		repositorio.atualizar(produto);
		produto = repositorio.buscarPorId(1);
				
		System.out.println(produto);
		
		
	}
	
private static void testRemover(){
		
		RepositorioProduto repositorio = new RepositorioProduto();
						
		repositorio.remover(1);
		
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarTodos());
		
}
	
private static void testContar(){
	
	RepositorioProduto repositorio = new RepositorioProduto();
	
	System.out.println(repositorio.buscarTodos());
	
	System.out.println("a qtde total é: "+repositorio.contar());
	
}
		

}
