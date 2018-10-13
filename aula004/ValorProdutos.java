package br.com.cursojava.aula004;

import java.util.Scanner;

/*15 - solicite o valor de 10 produtos e escreva o valor dos produtos aplicando 10% desconto
 * 
 * 
 */

public class ValorProdutos {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		long[] produtos = new long[10];
		
		int i = 0;
		
	
		
		do{
			
			
			System.out.println("Digite o valor do "+(i+1)+"º produto : ");
			
			produtos[i] = Long.parseLong(teclado.nextLine());
			
			i++;
			
			}while(i<produtos.length);
		
		
		
		
		for(int j = 0;j<produtos.length;j++){
			
			System.out.printf("O produto %d com 10 porcento de desconto custa: R$ %f", j+1, produtos[j]);
			
						
		}
		
		
		
		teclado.close();	
	}

}
