package br.com.cursojava.aula006;

/* crie uma classe Animal conforme as informações abaixo:
 * 
 * ----------------------------------
 *  Animal
 * ----------------------------------
 * - nome:String
 * - idade:int
 * ----------------------------------
 * + getIdade:int
 * + getNome:String
 * + setIdade(valor:int):void
 * + setNome(nome:String):void
 * + correr():void
 * + comer(comida:String):void
 * ---------------------------------
 * 
 * 2- crie uma classe Cachorro que estenda a classe Animal. Sobrescreva os métodos correr e comer para que 
 * possam imprimir uma mensagem indicando que o animal que está comendo é um cachorro.
 * 
 * 3- crie uma classe Gato que estenda a classe Animal. Sobrescreva os metodos correr e comer para que possam
 * imprimir uma msg indicando que o animal que está comendo é um gato. Sobrecarrege a classe Gato para que 
 * ela possa ter um outro metodo comer conforme abaixo:
 * 
 * +comer(comida:String, quantidade:int):void
 * 
 *4- crie um cadastro que apresente o menu abaixo:
 *
 * 1 cadastrar cachorro
 * 2 cadastrar gato
 * 3 listar animais
 * 
 * 
 * 5-desenvolva a logica necessaria para o cadastro de cada um dos tipos de animais definidos no menu acima. todos os
 * animais devem ser armazenados em um unico array de animais. quando o usuario selecionar o item listar animais, o prg
 * deve imprimir o nome de cada animal e executar os metodos correr e comer para cada animal apresentado
 * 
 * 
 * 
 * 
 */

public class Animal {
	
	private String nome;
	private int idade;
	
	public int getIdade(){
		
		return idade;
		
	}
	
	public String getNome(){
		
		return nome;
	}
	
	public void setIdade(int valor){
		
		this.idade = valor;
		
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	}

	
	public void correr(){
		
		System.out.println("está correndo");
		
	}
	
	public void comer(String comida){
		
		System.out.println("está comendo "+comida);
	}
	
	
}
