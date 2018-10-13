package br.com.cursojava.aula004;

//5- apresente soma 50 primeiros numeros inteiros positivos


public class Soma50Numeros {
	
	public static void main(String[] args){
		
		
		int soma = 0;
		
		for(int numero =1; numero <=50; numero++){
			
			soma = soma + numero;
			
			
		}
		
		System.out.println("A Soma dos 50 primeiros numeros são: "+soma);
		
	}
		

}
