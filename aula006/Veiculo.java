package br.com.cursojava.aula006;

/* 1 - crie uma classe Veiculo conforme os dados abaixo
 * 
 * int velocidadeAtual
 * boolean ligado
 * acelerar(int valor):void
 * parar():void
 * ligar();
 * desligar();
 * 
 * crie uma classe Carro que estenda Veiculo
 * crie uma classe Aviao que estenda de Veiculo e adicione o metodo voar
 * crie uma classe de testes de dentro do metodo main defina as seguintes variaveis:
 * 
 * Veiculo vl = new Veiculo;
 * Veiculo v2 = new Carro();
 * Aviao av = new Aviao();
 * Veiculo v3 = av;
 * 
 * quais os metodos sao possiveis de serem chamados na referencia v3?
 * quais os metodos sao possiveis de serem chamados na referencia av?
 * 
 * 
 */

public class Veiculo {

	private int velocidadeAtual = 0;
	private boolean ligado = false;

	public int getVelocidadeAtual() {

		return velocidadeAtual;

	}

	public void setVelocidadeAtual(int velocidadeAtual) {

		this.velocidadeAtual = velocidadeAtual;

	}

	public boolean isLigado() {

		return ligado;

	}
//padrao para quando configurar metodo - set // e buscar valor - get
	public void setLigado(boolean ligado) {

		this.ligado = ligado;

	}

	public void acelerar(int valor) {

		setVelocidadeAtual(getVelocidadeAtual() + valor);

	}

	public void parar() {

		setVelocidadeAtual(0);

	}

	public void ligar() {

		setLigado(true);
	}

	public void desligar() {

		setLigado(false);
		this.setVelocidadeAtual(0);
		
	}

}

