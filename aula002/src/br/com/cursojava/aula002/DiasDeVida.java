package br.com.cursojava.aula002;

import java.util.Scanner;

public class DiasDeVida {
	
public static void main(String[] args){
		
		int idade;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("------------- Veja Quantos Dias Você tem de Vida  -----------");
		System.out.println("  ");
		System.out.println("Digite a sua Idade: ");
		idade = Integer.parseInt(entrada.nextLine());
		
		entrada.close();
		
		System.out.printf("Você tem : %d dias de vida", idade*365);
		
		
}

}
