package br.com.cursojava.aula004;

import java.util.Scanner;

/*14 - solicite 10 notas e calcule a media, juntamente com as notas menores que a media
 * 
 * 
 */

public class NotasMenorQueAMedia {
	
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
			
			if (x<media){
				
				System.out.print("Nota"+k+" : "+x+" , ");
				k++;
			}
			
		}
			
		System.out.print(" Abaixo da média : "+media+".");
			
		teclado.close();	
	}

}
