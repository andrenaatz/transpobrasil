package br.com.cursojava.aula001;


public class TiposPrimitivos {

	
	public static void main(String[] args){
		
		
		
		
		System.out.print("Tipos primitivos:\n\nbyte -> 1 byte\nshort -> 2 bytes\nchar -> um caracter\nint -> tipo padr�o\nlong\nfloat\ndouble -> tipo padr�o\nboolean\n\nTipos Objetos come�am com letra Maiuscula, e armazenam seus valores no Heap, e na mem�ria grava o endere�o do Heap, enquanto vari�veis primitivas armazenam seus valores direto na mem�ria\n");
		
			byte bite = 1;
			short curto = 1234;
			char caracter = 'a';
			int inteiro = 10;
			float flutuante = 10.1f;
			double dobro = 10.0005;
			boolean logico = true;
			
			String Nome = new String("Andr�");
			
		
		System.out.println(" " );	
		System.out.println("---------------------" );
		System.out.println("exemplo de byte: "+bite);
		System.out.println("exemplo de short: "+curto );
		System.out.println("exemplo de char: "+caracter);
		System.out.println("exemplo de int: "+inteiro);
		System.out.println("exemplo de float: "+flutuante);
		System.out.println("exemplo de double: "+dobro);
		System.out.println("exemplo de boolean: "+logico);
		System.out.println("exemplo de String: "+Nome);
		
		System.out.println(" ");
		
		System.out.print("Operadores matem�ticos: \n+, -, *, /, %, ++, --, +=, -=, *=, /=, %=\n ");
	}
}
