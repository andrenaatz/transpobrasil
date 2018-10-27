package br.com.cursojava.aula006;

import java.util.Scanner;

public class Testes {

	
	public static void main(String[] args){
		
		Veiculo v1 = new Veiculo();
		
		Veiculo v2 = new Carro();
		
		Aviao av = new Aviao();
		
		Veiculo v3 = av;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("digite a velocidade que quer para v2 ");
		v2.acelerar(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("A velocidade de v2 é "+v2.getVelocidadeAtual());
		
		System.out.println("digite a velocidade que quer para v2 ");	
		v2.acelerar(Integer.parseInt(teclado.nextLine()));
		
		System.out.println("A velocidade de v2 continua a ser "+v2.getVelocidadeAtual());
		
		v2.desligar();
		System.out.println("carro foi desligado");
		
		System.out.println("A velocidade de v2 continua a ser "+v2.getVelocidadeAtual());
		
		
		v3.setVelocidadeAtual(40);
		
		System.out.println(av.getVelocidadeAtual());
		
		
		
		if(v3 instanceof Aviao){
			
			((Aviao) v3).voar();
			
			// é o mesmo que:
			// Aviao a = (Aviao)v3;
			// a.voar();
			
		}
		
	}
}
