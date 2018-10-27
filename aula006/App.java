package br.com.cursojava.aula006;

import java.util.Scanner;

public class App {
	
	//public static void main(String[] args){
		
		Contato contato = new Contato();
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do contato");
		
		String nome = teclado.nextLine();
		
		contato.configurarNome(nome);
				
		contato.email = "felipe@teste.com";
		
		contato.telefone = "3333333";
		
		
				
		
		System.out.println(contato.retornarNome());
		
		System.out.println(contato.email);
		System.out.println(contato.telefone);
		
		teclado.close();
		
		
	}

}
