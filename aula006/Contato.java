package br.com.cursojava.aula006;

public class Contato {
	
	
	private String nome;
	String email;
	String telefone;
	private static int quantidadeContatos = 0;
	
	public Contato(){
				
		quantidadeContatos++;
		System.out.println("Quantidade de contatos = "+quantidadeContatos);
		
	}
	
	
	void configurarNome(String nome){
		
		if(nome != null && nome.length() >= 3){
			
			this.nome = nome;
		}
		
		
	}
	
	
	String retornarNome(){
		
		return nome;
	}
	
	
	
}
