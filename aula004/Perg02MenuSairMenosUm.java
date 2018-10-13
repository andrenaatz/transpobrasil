package br.com.cursojava.aula004;

import java.util.Scanner;

/*Escreva prg que apresente o menu abaixo até que digite 'S'
 * 
 * A - abrir
 * B - procurar
 * C - download
 * D - upload
 * S - sair 
 * 
 */

public class Perg02MenuSairMenosUm {

	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		String letra = new String();
		
		
		do{
			
			System.out.println("A - abrir arquivo");
			System.out.println("B - procurar arquivo");
			System.out.println("C - download arquivo");
			System.out.println("D - download arquivo");
			System.out.println("S - sair");
					
			
			letra = teclado.nextLine();
			
			
			if(letra.equals("A")){
				
				System.out.println("Escolheu a opção abrir");
				continue;
				
			}if(letra.equals("B")){
				
				System.out.println("Escolheu a opção procurar");
				continue;
				
			}if(letra.equals("C")){
				
				System.out.println("Escolheu a opção download");
				continue;
				
			}if(letra.equals("D")){
				
				System.out.println("Escolheu a opção upload");
				continue;
				
			}if(letra.equals("S")){
				
				System.out.println("Executando logoff...");
				continue;
				
			}else{
				
				System.out.println("Opção inválida.Tente novamente");
				
			}
		}while(!"S".equalsIgnoreCase(letra));//deixar string fixa sempre na frente afim de evitar retorno NULL
		
		System.out.println("Fim da aplicação");
		
		teclado.close();
		
					
	}
}
