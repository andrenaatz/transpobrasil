package br.com.cursojava.aula006;

/*2- crie uma classe Cachorro que estenda a classe Animal. Sobrescreva os m�todos correr e comer para que 
 * possam imprimir uma mensagem indicando que o animal que est� comendo � um cachorro.
 * 
 * 
 */

public class Cachorro extends Animal {

	public void correr() {

		System.out.println("est� correndo um Cachorro");

	}

	public void comer(String comida) {

		System.out.println("isto � comida de cachorro: " + comida);
	}

}
