package br.com.cursojava.aula005;

import java.util.Scanner;

public class AppContato {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CadastroContato cadastro = new CadastroContato();
		cadastro.mostrarMenu(teclado);
		teclado.close();
		
		
		
	}

}
