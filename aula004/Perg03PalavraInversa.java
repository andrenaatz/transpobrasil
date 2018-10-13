package br.com.cursojava.aula004;

import java.util.Scanner;

/*
 * Solicite uma palavra e apresente ela inversa. utilize o comando do/while para criar a palavra no modo inverso
 * 
 */

public class Perg03PalavraInversa {
	
public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite uma palavra");	
		
		String palavra = teclado.nextLine();
		
		
		int contador = palavra.length();
						
		
		do{
			
			System.out.print(palavra.charAt(contador-1));
			contador--;
			
			
			
			
			
			
		}while(contador>0);
		
		System.out.println("");
	
		System.out.println("Fim da aplicação");
		teclado.close();

}


}
