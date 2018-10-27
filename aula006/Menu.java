package br.com.cursojava.aula006;

import java.util.Scanner;

import br.com.cursojava.aula006.Animal;
import br.com.cursojava.aula006.Cachorro;
import br.com.cursojava.aula006.Gato;

/*4- crie um cadastro que apresente o menu abaixo:
 * 1 cadastrar cachorro
 * 2 cadastrar gato
 * 3 listar animais
 * 
 *  
 */

public class Menu {
	
	
	
Controller controller = new Controller();
	
	public void mostrarMenu(Scanner teclado){
		System.out.println("####### MENU PRINCPAL #######");
		int opcao = 0;
		do{
			System.out.println("1 - Cadastrar Cachorro");
			System.out.println("2 - Cadastrar Gato");
			System.out.println("3 - Listar Animais");
			System.out.println("4 - sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		}while(opcao != 4);
	}

	private void tratarOpcao(int opcao,Scanner teclado) {
		switch(opcao){
		case 1:
			cadastrarCachorro(teclado);
			break;
		case 2:
			cadastrarGato(teclado);
			break;
		case 3:
			
			break;
		default:
			mostrarOpcaoInvalida();
		}
		
		
	}

	private void cadastrarCachorro(Scanner teclado) {
		System.out.println("####### CADASTRAR NOVO CONTATO #######");
		System.out.println("Informe o nome do cachorro:");
		String nome = teclado.nextLine();
		System.out.println("Informe a idade:");
		int idade = Integer.parseInt(teclado.nextLine());
		controller.criarContato(nome,email,telefone);
		System.out.println("##############");
		cacy9
		
	}

	private void listarContatos() {
		System.out.println("####### LISTAR CONTATOS #######");
		int quantidade = controller.contarContatos();
		if(quantidade > 0){
			Contato atual = null;
			for(int index = 0; index < quantidade; index++){
				atual = controller.buscarContato(index);
				System.out.printf("%s - %s - %s\n",atual.nome, atual.email, atual.telefone);
			}
		}else{
			System.out.println("Não existem contatos cadastrados");
		}
		System.out.println("##############");
		
	}

	private void sair() {
		System.out.println("Obrigado por utilizar nosso Sistema.");
		
	}

	private void mostrarOpcaoInvalida() {
		System.out.println("Você digitou uma opção inválida.");
		
	}
}
