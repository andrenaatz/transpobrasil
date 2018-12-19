package br.com.cursojava.aula005;

/* 3 - Dada a matriz abaixo:
 *     10 9 8 7
 *      6 5 4 3
 *      2 1 2 3
 *      4 5 6 7
 *      
 *  crie um programa que armazene a matriz e realize as seguintes operações:
 *  
 *  a- calcule a soma de todos os valores da matriz
 *  b- apresente os valores diagonal principal
 *  c- apresente os valores da diagonal secundária
 *  d- crie e apresente uma nova matriz que armazene o valor referente ao item de cada coluna multiplicado pelo valor
 *  do item da diagonal principal da respectiva linha.
 *  e - crie uma nova matriz que deve ser armazenada os valores acima da diagonal principal multiplicado pelo valor da diagonal
 *  secundaria, e oos valores abaixo da diagonal principal devem ser multiplicados pelo proprio valor da diagonal principal. os 
 *  valores da diagonal principal devem ser elevados ao cubo. 
 */

public class Matriz {
	
	public static void main(String[] args){
		
		
			
		int matriz[][] = {{10,9,8,7},{6,5,4,3},{2,1,2,3},{4,5,6,7}};
		
		//----------------------------------------------------------------------
		
		// exercício A
		
		int somas = 0;
		
		for( int[] linha : matriz){
			
			for( int soma : linha){
				
				somas = somas + soma;
			}
			
		}
		
		System.out.println(" A Soma de todos os elementos é: "+somas);
		
		//---------------------------------------------------------------------
	
		// exercício B
		
		int principal = 0;
		int secundario = 0; 
		
		System.out.print("A diagonal principal é formada pelos números: ");
		
		for(; principal<matriz.length;principal++){
			
			
			
			if(principal==secundario){
			
				
				System.out.print(matriz[principal][secundario]+" , ");
			
			}
			
			secundario++;
			
				
		}
		
		//-----------------------------------------------------------------------
		
		// exercício C
		
		principal = 0;
		secundario = 3; 
		
		System.out.println("");
		
		System.out.print("A diagonal secundária é formada pelos números: ");
		
		for(; principal<matriz.length;principal++){
			
			
			
			if((principal+1)==matriz.length){
			
				System.out.print(matriz[principal][secundario]);
				
			}else{
			
				System.out.print(matriz[principal][secundario]+" , ");
			
			}
			
			secundario--;
			
		}	
		
		//-----------------------------------------------------------------------
		
		// exercício D
		
		principal = 0;
		
		int diagonalCol = 0;
		int diagonalLin = 0;
		
		System.out.println("");
		
		
		int[][] novaMatriz = new int[4][4];
		
		for(; principal<matriz.length;principal++){
		
			secundario = 0;
			
			for(;secundario<matriz[principal].length;secundario++){
				
				novaMatriz[principal][secundario] = matriz[principal][secundario]*matriz[diagonalCol][diagonalLin];
				
			}
			
			diagonalCol++;
			diagonalLin++;
		}
		
		System.out.println("");
		System.out.println("------------------- MATRIZ ANTIGA -------------------");
		System.out.println("TAMANHO: "+matriz.length+" X "+matriz[0].length);
		
		for (int[] x : matriz){
			
			for (int y : x){
			
				System.out.print(y+" , ");
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("------------------- NOVA MATRIZ -------------------");
		System.out.println("TAMANHO: "+novaMatriz.length+" X "+novaMatriz[0].length);
		
		for (int[] x : novaMatriz){
			
			for (int y : x){
			
				System.out.print(y+" , ");
			}
			
			System.out.println("");
		}
		
		//-----------------------------------------------------------------------
		
		// exercício E
		
		principal = 0;
		
		diagonalCol = 0;
		diagonalLin = 0;
		
		System.out.println("");
		
		
		int[][] outraMatriz = new int[4][4];
		
		for(; principal<matriz.length;principal++){
		
			secundario = 0;
			
			for(;secundario<matriz[principal].length;secundario++){
				
				if(principal==secundario){
				
				outraMatriz[principal][secundario] = ;
				}else if(secundario<principal){
					
					
					
				}else(sencudario>principal){
					
					
					
				}
			}
			
			diagonalCol++;
			diagonalLin++;
		}
		
		System.out.println("");
		System.out.println("------------------- MATRIZ ANTIGA -------------------");
		System.out.println("TAMANHO: "+matriz.length+" X "+matriz[0].length);
		
		for (int[] x : matriz){
			
			for (int y : x){
			
				System.out.print(y+" , ");
			}
			
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("------------------- OUTRA MATRIZ -------------------");
		System.out.println("TAMANHO: "+novaMatriz.length+" X "+novaMatriz[0].length);
		
		for (int[] x : novaMatriz){
			
			for (int y : x){
			
				System.out.print(y+" , ");
			}
			
			System.out.println("");
		}
		
		
	
	}
}
