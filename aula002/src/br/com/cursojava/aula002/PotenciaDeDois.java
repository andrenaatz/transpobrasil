package br.com.cursojava.aula002;

import java.util.Scanner;

public class PotenciaDeDois {
	
public static void main(String[] args){
		
		int numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------- Calcule a Potência de Dois -----------");
		System.out.println("Digite um numero: ");
		numero = Integer.parseInt(entrada.nextLine());
		
		entrada.close();
		
		
		System.out.printf("O seu numero elevado a potencia de 2 é: %.0f", Math.pow(numero, 2));
		
}



}
