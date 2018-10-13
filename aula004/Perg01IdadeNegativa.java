package br.com.cursojava.aula004;

import java.util.Scanner;

public class Perg01IdadeNegativa {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int idade = 0;
		
		do{
			
			
			if (idade<0){
				
				System.out.println("Voce digitou uma idade inválida. Tente de novo");
			}
			
			System.out.println("Digite sua idade: ");
			
			idade = Integer.parseInt(teclado.nextLine());
			
			
		}while(idade<0);
		
		System.out.println("Sua idade é: "+idade);
		
		teclado.close();
		
}
		
		
}
