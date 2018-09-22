package br.com.cursojava.aula002;

import java.util.Scanner;

public class Retangulo {
	
public static void main(String[] args){
		
		double base, altura;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("-------- R E T A N G U L O  -----------");
		System.out.println("Digite a BASE: ");
		base = Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite a ALTURA: ");
		altura = Double.parseDouble(entrada.nextLine());
		
		entrada.close();
		
		System.out.printf("O perímetro é de: %.2f \n", (base*2)+(altura*2) );
		System.out.printf("A área é de: %.2f \n", altura*base);
}
}
