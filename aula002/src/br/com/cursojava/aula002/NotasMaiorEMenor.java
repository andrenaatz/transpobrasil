package br.com.cursojava.aula002;

import java.util.Scanner;

public class NotasMaiorEMenor {
	
	
	public static void main(String[] args){
		
		double nota1, nota2, nota3;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("-------- B O L E T I M ---------------");
		System.out.println("Digite a PRIMEIRA nota: ");
		nota1 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("-----------------------");
		System.out.println("Digite a SEGUNDA nota: ");
		nota2 = Double.parseDouble(entrada.nextLine());
		
		System.out.println("-----------------------");
		System.out.println("Digite a TERCEIRA nota: ");
		nota3 = Double.parseDouble(entrada.nextLine());
		
		entrada.close();
				
		System.out.println("-----------------------");
		System.out.printf("Sua maior nota é: %.0f \n", Math.max((Math.max(nota1, nota2)), nota3));
		
		System.out.printf("Sua menor nota é: %.0f ", Math.min((Math.min(nota1, nota2)), nota3));
		
		
	}
	
		
}
