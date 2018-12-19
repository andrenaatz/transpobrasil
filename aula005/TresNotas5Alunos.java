package br.com.cursojava.aula005;

/* 1-Programa solicita 3 notas de 5 alunos e apresente as notas. 
 * As notas devem ser impressas agrupadas linha a linha. (cada aluno deve ter todas as notas apresentadas na mesma linha 
 * e deve possuir uma linha para cada aluno). Armazene as notas em uma matriz.
 */

import java.util.Scanner;

public class TresNotas5Alunos {
	
	public static void main(String[] args){
	
		double[][] boletim = new double[5][3];
		
		Scanner entrada = new Scanner(System.in);
		
		
		for(int alunos = 0; alunos<boletim.length;alunos++){
			
			for(int notas = 0; notas <boletim[alunos].length;notas++){
				
				
				System.out.println("Digite a "+(notas+1)+"º nota do aluno "+(alunos+1));
				boletim[alunos][notas] = Double.parseDouble(entrada.nextLine());
				
			}
		 }
		
		entrada.close();
		
		 int nome = 1;
		 
		 for (double[] aluno : boletim){
				
				
				
			  System.out.print("O aluno "+nome+" tem as seguintes notas: ");
				
			  for(double nota : aluno){
					
				 System.out.print(nota +" , ");
					
			  }
				
			  ++nome;
				
		  System.out.println("");
		  }
					
		}
	

}
