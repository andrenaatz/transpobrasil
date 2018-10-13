package br.com.cursojava.aula004;
import java.util.Scanner;


/* 9 - escreva 5 notas e apresente todas as notas
 * 
 */

public class NotasArray {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int[] notas = new int[5];
		
		int i=0;
		
	
		
		do{
			
	
		System.out.println("Digite a nota"+(i+1)+" : ");
		
		notas[i] = Integer.parseInt(teclado.nextLine());
		
		i++;
		
		}while(i<notas.length);
		
		for(int j : notas){
			
			System.out.print("Nota: "+j +" , ");
		}
		
		
		}

		
	

}
