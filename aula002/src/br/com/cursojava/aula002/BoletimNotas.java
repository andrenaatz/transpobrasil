package br.com.cursojava.aula002;
import java.util.Scanner;

public class BoletimNotas {
	
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
		System.out.printf("Sua média é: %.2f ", ((nota1+nota2+nota3)/3));
		
		
	}

}
