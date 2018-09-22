package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main (String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("olá, informe seu nome por favor:");	
		
		String nome = teclado.nextLine();
		
		System.out.printf("O nome informado foi %s \n", nome);
		
		teclado.close(); // o coletor de lixo somente recolhe variaveis que nao estejam mais referenciando nenhum objeto, neste caso
		//precisamos fecha-lo para economizar recursos.
		
		
		
	}

}
