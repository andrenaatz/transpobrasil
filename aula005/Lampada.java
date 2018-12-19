package br.com.cursojava.aula005;



public class Lampada {
	
	//variavel de instancia, propriedade, atributos
	//variavel que cria dentro da classe mas fora de qualquer método
	
	int potencia;
	int voltagem;
	String tipo;
	boolean ligada;
	
	//exemplo de uma 'constante' em java
	// public static final String tipo = "LED";
	
	//Métodos:
	
	public void ligar(){
		
		System.out.println("Lampada ligada");
		ligada = true;
		
	}
	
	public void desligar(){
		
		System.out.println("Lampada desligada");
		ligada = false;
		
	}
	
	public boolean isLigada(){
		
		return ligada;
	}

	public void configurarTipo(String novoTipo){
		
		tipo = novoTipo;
		
		
		
	}
	
	
}

