package br.com.cursojava.aula006;

/*2- crie uma classe Cachorro que estenda a classe Animal. Sobrescreva os métodos correr e comer para que 
 * possam imprimir uma mensagem indicando que o animal que está comendo é um cachorro.
 * 
 * 
 */

public class Cachorro extends Animal {

	public void correr() {

		System.out.println("está correndo um Cachorro");

	}

	public void comer(String comida) {

		System.out.println("isto é comida de cachorro: " + comida);
	}

}
