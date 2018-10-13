package br.com.cursojava.aula004;

import java.util.Scanner;

/* 8 - solicite uma palavra e escreva ela conforme o exemplo abaixo (use o for)
 * ex.: palavra = "Brasil"
 * B
 * Br
 * Bra
 * Bras
 * Brasi
 * Brasil
 */

public class PalavraSolicitada {

	public static void main(String[] args){
		
		System.out.println("Digite uma palavra");
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra = teclado.nextLine();
		
		
		
		for(int i=0;i<palavra.length();i++){
			
		
			for(int j = 0; j<=i;j++){
				
				System.out.print(palavra.charAt(j));
												
			}
			
			System.out.println("");
			
			
			
		}
		
		teclado.close();
		
		
		
	}
}
