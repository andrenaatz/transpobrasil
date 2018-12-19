package br.com.cursojava.aula005;

/* 2- Programa solicite 3 notas de 5 alunos e calcule a média das notas de cada aluno. Apresente as notas
 * dos alunos seguida da média. Utilize uma matriz para armazenar as notas dos alunos e um array para armazenar as médias.
 */

import java.util.Scanner;

public class TresNotas5AlunosMedia {
	
	public static void main(String[] args){
	
		double[][] boletim = new double[5][3];
		
		double[] media = new double[boletim.length];
		
		
				
		Scanner entrada = new Scanner(System.in);
		
		
		for(int alunos = 0; alunos<boletim.length;alunos++){
			
			double somaNotas = 0;
			
			for(int notas = 0; notas <boletim[alunos].length;notas++){
				
				
				
				System.out.println("Digite a "+(notas+1)+"º nota do aluno "+(alunos+1));
				boletim[alunos][notas] = Double.parseDouble(entrada.nextLine());
			
								
					somaNotas = somaNotas+boletim[alunos][notas];
					
				}
				
			
			 media[alunos] = (somaNotas/boletim[alunos].length);
		
		}
	
		
		 int nome = 0;
		 
		 for (double[] aluno : boletim){
				
				
				
			  System.out.print("O aluno "+(nome+1)+" tem as seguintes notas: ");
				
			  for(double nota : aluno){
					
				 System.out.print(nota +" , ");
					
			  }
			  
			  			  
			  System.out.print(" E sua média é: "+media[nome]);
			  	
			  
			  ++nome;
			  
				
		  System.out.println("");
		  }
					
		}
	

}
