package br.com.cursojava.aula002;

import java.util.Scanner;

public class IdadeCompleta {
	
public static void main(String[] args){
		
		int diasIdade;
		
		int anos, meses, dias;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------- Veja a sua Idade Super Completa  -----------");
		System.out.println("Digite quantos DIAS você tem de vida: ");
		diasIdade = Integer.parseInt(entrada.nextLine());
		
		entrada.close();
		
		
		anos = (diasIdade/360);
		meses = (diasIdade%360)/30;
		dias = (diasIdade%360)%30;
		
		System.out.printf("Você tem: %d anos, %d meses e %d dias", anos, meses, dias);
		
		
		
		
}


}
