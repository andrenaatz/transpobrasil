package br.com.cursojava.aula001;

public class Percentagem {
	
	public static void main(String[] args){
		
		double valor = 870.50;
		double percentual = 0.135;
		double desconto = valor * percentual;
		
		
		System.out.printf("%.2f porcento de %.2f é igual a : %.2f", percentual, valor, valor * percentual);
		System.out.println(" ");
		System.out.println("valor sem arredondar : "+desconto);
		
	}

}
