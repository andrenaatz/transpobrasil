package br.com.cursojava.aula002;

import java.util.Scanner;

public class Imc {
	
public static void main(String[] args){
		
		double peso, altura;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------- Veja o seu IMC  -----------");
		System.out.println("Digite o seu PESO: ");
		peso = Double.parseDouble(entrada.nextLine());
		
		entrada.close();
		
		
		System.out.println("Digite a sua ALTURA: ");
		altura = Double.parseDouble(entrada.nextLine());
		
		System.out.printf("O seu IMC é de: %.2f", (peso / (altura*2)));
		
		
		
		
		
}

}
