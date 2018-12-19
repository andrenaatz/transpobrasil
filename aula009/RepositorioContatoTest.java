package br.com.cursojava.aula009;

import java.util.List;

public class RepositorioContatoTest {
	
	public static void main(String[] args) {
		
		
		
		testContar();
		
	}

	private static void testInserir(){
		
		Contato contato = new Contato(null, "Bagrinho", "b@teste.com", "33221100");
		RepositorioContato repositorio = new RepositorioContato();
		
		repositorio.inserir(contato);
		System.out.println(contato);
		System.out.println("OK");
		
	}
	
	private static void testListarTodos(){
		
		RepositorioContato repositorio = new RepositorioContato();
		List<Contato> buscarTodos = repositorio.buscarTodos();
		
		System.out.println("Listar todos");
		
		for (Contato contato : buscarTodos){
			
			System.out.println(contato);
		}
	}
	
	private static void testBuscarPorId(){
		
		RepositorioContato repositorio = new RepositorioContato();
		System.out.println("Buscar por ID");
		System.out.println(repositorio.buscarPorId(2));
		System.out.println(repositorio.buscarPorId(7));
		
	}
	
	private static void testAtualizar(){
		
		RepositorioContato repositorio = new RepositorioContato();
		Contato contato = repositorio.buscarPorId(1);
		
		contato.setNome("Bagrinho da Silva");
		repositorio.atualizar(contato);
		contato = repositorio.buscarPorId(1);
				
		System.out.println(contato);
		
		
	}
	
private static void testRemover(){
		
		RepositorioContato repositorio = new RepositorioContato();
						
		repositorio.remover(1);
		
		System.out.println(repositorio.buscarPorId(1));
		System.out.println(repositorio.buscarTodos());
		
}
	
private static void testContar(){
	
	RepositorioContato repositorio = new RepositorioContato();
	
	System.out.println(repositorio.buscarTodos());
	
	System.out.println("a qtde total é: "+repositorio.contar());
	
}
		
		
		
		
				
		
		
	
}
