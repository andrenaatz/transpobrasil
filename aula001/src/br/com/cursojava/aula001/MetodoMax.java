package br.com.cursojava.aula001;

public class MetodoMax {
	
	public static void main(String[] args){
		
		
		int numero1 = 3;
		int numero2 = 7;
		int numero3 = 25;
		int numero4 = 10;
		
		int maior1 = Math.max(numero1, numero2);
		int maior2 = Math.max(maior1, numero3);
		int maiorFinal = Math.max(maior2, numero4);
		
		System.out.println("O maior valor é: "+maiorFinal);
		
		
	}

}
