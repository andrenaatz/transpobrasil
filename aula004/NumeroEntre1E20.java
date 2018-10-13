package br.com.cursojava.aula004;



/*Perg 6 - solicite um numero entre 1 e 20, e em seguida apresente o valor fatorial. valide o numero informado solicitando um 
 * numero correto sempre que o usuario informar um valor fora do range (use do/while e for)
 * 
 */

import java.util.Scanner;



public class NumeroEntre1E20 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1 = 0, numero2 = 0;
		
		
		do{
			
		
		
			
		System.out.println("Digite o primeiro numero: ");
		numero1 = Integer.parseInt(teclado.nextLine());
		
		if((numero1<=1) || (numero1>=20)){
			
			System.out.print("Numero tem que ser entre 1 e 20. Tente de novo\n\n");
			
			
		}
		
		
		}while((numero1<=1) || (numero1>=20));
		
		
		do{
			
						
				
			System.out.println("Digite o segundo numero: ");
			numero2 = Integer.parseInt(teclado.nextLine());
			
			if((numero2<=1) || (numero2>=20)){
				
				System.out.print("Numero tem que ser entre 1 e 20. Tente de novo\n\n");
				
			}
			
			}while((numero2<=1) || (numero2>=20));
		
		int soma1 = numero1;
		int soma2 = numero2;
		
		for(int i = (numero1-1);i>1;i--){
			
			soma1 = soma1 * (i);
			
			//
		}
		
		System.out.println("O valor fatoria de "+numero1 +" é igual a: "+soma1);
		
		for(int j = (numero2-1);j>1;j--){
			
			soma2 = j * (j);
		}
		
		System.out.println("O valor fatoria de "+numero2 +" é igual a: "+soma2);
		
	}
		

}
