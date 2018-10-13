package br.com.cursojava.aula004;

import java.util.Scanner;

/* 10 - escreva 5 nomes e apresente eles invertidos na sequencia (ultimo nome deve ser o primeiro, penultimo o segundo,  etc)
 *  
 * 
 */

public class NomesInvertidos {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[5];
		
		int i = 0;
		
		do{
			
			
			System.out.println("Digite o "+(i+1)+"º nome : ");
			
			nomes[i] = teclado.nextLine();
			
			i++;
			
			}while(i<nomes.length);
		
		
		for(int j = nomes.length-1;j>=0;j--){
			
			System.out.println("Nome"+(j+1)+" : "+nomes[j]);
			
		}
		
		
	}
}
