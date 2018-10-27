package br.com.cursojava.aula006;

/*3- crie uma classe Gato que estenda a classe Animal. Sobrescreva os metodos correr e comer para que possam
 * imprimir uma msg indicando que o animal que est� comendo � um gato. Sobrecarrege a classe Gato para que 
 * ela possa ter um outro metodo comer conforme abaixo:
 * 
 * +comer(comida:String, quantidade:int):void
 * 
 * 
 */

public class Gato extends Animal {
	
	
	public void correr() {

		System.out.println("est� correndo um Gato");

	}

	public void comer(String comida) {

		System.out.println("isto � comida de gato: " + comida);
	}
	
	public void comer(String comida, int quantidade) {

		
		System.out.println("o gato est� comendo "+quantidade+" de "+comida);
	}
	

}
