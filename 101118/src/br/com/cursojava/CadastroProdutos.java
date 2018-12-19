package br.com.cursojava;

// 1 crie um programa que realize o cadastro de Produtos
// o programa deve armazenar os dados cadastrados em uma Lista e deve possuir as opçoes abaixo:
// 1- cadastrar o produto
// 2 - Listar Produtos
// 3 - Remover Produtos

// o cadastro de produtos deve possuir os seguintes dados:

// nome , descriçao, preco

import java.util.Scanner;


public class CadastroProdutos {

	
CadastroController controller = new CadastroController();
	
	public void mostrarMenu(Scanner teclado){
		System.out.println("####### MENU PRINCPAL #######");
		int opcao = 0;
		do{
			System.out.println("1 - Cadastrar novo Contato");
			System.out.println("2 - Listar Contatos");
			System.out.println("3 - Remover Produto");
			System.out.println("4 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao != 4);
	}

	private void tratarOpcao(int opcao,Scanner teclado) {
		switch(opcao){
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			removerProduto(teclado);
			break;
		case 4:
			sair();
			break;
		default:
			mostrarOpcaoInvalida();
		}
		
		
	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("####### CADASTRAR NOVO PRODUTO #######");
		System.out.println("Informe o nome do produto:");
		String nome = teclado.nextLine();
		System.out.println("Informe a descriçao do produto:");
		String descricao = teclado.nextLine();
		System.out.println("Informe o preço do produto:");
		double preco = Double.parseDouble(teclado.nextLine());
		
		boolean ok = controller.criarProduto(nome, descricao, preco);
		if(ok){
			System.out.println("cadastrado com sucesso");
		}else
		System.out.println("nao conseguiu cadastrar");
	}

	private void listarProdutos() {
		
		controller.listarArray();
		
	}
	private void removerProduto(Scanner teclado) {
		System.out.println("####### REMOVER PRODUTO #######");
		System.out.println("Informe o nome do produto:");
		String nome = teclado.nextLine();
		controller.removerProduto(nome);
		System.out.println("##############");
	}
	
	private void sair() {
		System.out.println("Obrigado por utilizar nosso Sistema.");
		
	}

	private void mostrarOpcaoInvalida() {
		System.out.println("Você digitou uma opção inválida.");
		
	}
	
	
}
