package br.com.cursojava.aula004;

import java.util.Scanner;

public class ExemploDoWhile {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int codigo = 0;
		
		do{
			
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2- Listar Produtos");
			System.out.println("3- Remover Produto");
			System.out.println("4- sair");
			codigo = Integer.parseInt(teclado.nextLine());
			
			switch(codigo){
			
			case 1:
				System.out.println("Escolheu a op��o Cadastrar");
				break;
			case 2:
				System.out.println("Escolheu a op��o Listarr");
				break;
			case 3:
				System.out.println("Escolheu a op��o Remover");
				break;
			case 4:
				System.out.println("Executando logoff...");
				break;
			default:
				System.out.println("Op��o inv�lida");
			
			}
			System.out.println(" ");
			
		}while(codigo != 4);
		
		System.out.println("Fim da aplica��o");
		teclado.close();
	}

}
