package br.com.cursojava.aula004;

import java.util.Scanner;

/* 13 - solicite 10 nomes e apresente o nome com maior qtde de caracteres
 * 
 */

public class NomeMaior {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		int i = 0;
				
		
		do{
			
			
			System.out.println("Digite o "+(i+1)+"º nome : ");
			
			nomes[i] = teclado.nextLine();
			
			i++;
			
			}while(i<nomes.length);
		
		
		String maiorNome = "";
		
		for(int j = 0;j<nomes.length;j++){
			
			if(nomes[j].length()>maiorNome.length()){
				
				maiorNome=nomes[j];
			}
		}
			
		System.out.println("O maior nome é: "+maiorNome);
		
		
	}
}
