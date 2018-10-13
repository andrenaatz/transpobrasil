package br.com.cursojava.aula004;

import java.util.Scanner;

/*perg 7 - solicite 2 numeros, onde o segundo numero deve ser maior q o primeiro. Escreva os numeros contidos entre o primeiro
 * e o segundo numero digitado. O programa deve voltar a solicitar o segundo numero sempre que o usuario digitar um numero menor ou
 * igual ao primeiro (usar do/while e for)
 * 
 */

public class DoisNumeros {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		
		int numero1 = Integer.parseInt(teclado.nextLine());
		int numero2;
		
		do{
			
			
						
			System.out.println("Digite o segundo numero: ");
			
			numero2 = Integer.parseInt(teclado.nextLine());
			
			if(numero2<numero1){
				
				System.out.println("Numero tem que ser maior que"+numero1+"Tente de novo");
			}
			
						
		}while(numero2<numero1);
		
		
				
		
		for(int i = numero1+1;i<numero2;i++){
			
			System.out.println(i);
			
			
		}
			
		System.out.println("Fim");
		}

}
