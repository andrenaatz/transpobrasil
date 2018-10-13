package br.com.cursojava.aula004;

import java.util.Scanner;

/* 12- solicite 10 notas e calcule a media. apresente todas as notas com valor igual ou maior que a media
 * 
 * 
 */

public class MediaNotas {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int[] notas = new int[10];
		
		int i = 0;
		
		int nota = 0;
		
		do{
			
			
			System.out.println("Digite a "+(i+1)+"º nota : ");
			
			notas[i] = Integer.parseInt(teclado.nextLine());
			
			i++;
			
			}while(i<notas.length);
		
		
		
		
		for(int j = 0;j<notas.length;j++){
			
			nota = nota + notas[j];
			
						
		}
		
		
		int media = nota / notas.length;
		
		int k = 1;
		
		for( int x : notas){
			
			if (x>=media){
				
				System.out.print("Nota"+k+" : "+x+" , ");
				k++;
			}
			
		}
			
		System.out.print(" Acima ou igual à média : "+media+".");
			
		teclado.close();	
	}

}
