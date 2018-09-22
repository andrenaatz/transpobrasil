package br.com.cursojava.aula002;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args){
		
		double nota1, nota2, nota3, peso1=2, peso2=3, peso3=5;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("-------- B O L E T I M ---------------");
		System.out.println("Digite a PRIMEIRA nota: ");
		nota1 = (Double.parseDouble(entrada.nextLine()));
		System.out.println(nota1);
		
		System.out.println("-----------------------");
		System.out.println("Digite a SEGUNDA nota: ");
		nota2 = (Double.parseDouble(entrada.nextLine()));
		
		System.out.println("-----------------------");
		System.out.println("Digite a TERCEIRA nota: ");
		nota3 = (Double.parseDouble(entrada.nextLine()));
		
		entrada.close();
				
		System.out.println("-----------------------");
		System.out.printf("Sua média ponderada pelos pesos é: %.2f \n", ((nota1*peso1) + (nota2*peso2) + (nota3*peso3))/10);
		
		System.out.println("sua media comum: " + (nota1 + nota2 + nota3)/3);
		
		
	}
}
