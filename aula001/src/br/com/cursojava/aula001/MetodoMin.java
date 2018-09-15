package br.com.cursojava.aula001;

public class MetodoMin {
	
	public static void main(String[] args){
		
	
		int numero1 = 10;
		int numero2 = 7;
		int numero3 = 20;
		int numero4 = 30;
		
		int menor = Math.min(numero1, numero2);
		menor = Math.min(menor, numero3);
		menor = Math.min(menor, numero4);
		
		System.out.println("O menor valor é: "+menor);
		
		int min2 = Math.min(Math.min(Math.min(numero1, numero2), numero3), numero4);
		
		System.out.println("O menor valor é: "+min2);
		
	}

}
