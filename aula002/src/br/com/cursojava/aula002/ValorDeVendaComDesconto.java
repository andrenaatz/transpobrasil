package br.com.cursojava.aula002;

import java.util.Scanner;

public class ValorDeVendaComDesconto {

	
public static void main(String[] args){
		
		double preco, percentualDesconto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-------- CALCULO DE DESCONTO  -----------");
		System.out.println("Digite o VALOR do PRODUTO: R$ ");
		preco = Double.parseDouble(entrada.nextLine());
		
		
		System.out.println("Digite o percentual de desconto ofertado: % ");
		percentualDesconto = Double.parseDouble(entrada.nextLine());
		
		entrada.close();
		
		System.out.printf("O valor de desconto é: R$ %.2f \n", preco*(percentualDesconto/100));
		
		System.out.printf("O valor a Pagar é: R$ %.2f \n", preco-(preco*(percentualDesconto/100)));
		
		
}
}
