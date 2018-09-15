package br.com.cursojava.aula001;


public class TiposPrimitivos {

	
	public static void main(String[] args){
		
		
		
		
		System.out.print("Tipos primitivos:\n\nbyte -> 1 byte\nshort -> 2 bytes\nchar -> um caracter\nint -> tipo padrão\nlong\nfloat\ndouble -> tipo padrão\nboolean\n\nTipos Objetos começam com letra Maiuscula, e armazenam seus valores no Heap, e na memória grava o endereço do Heap, enquanto variáveis primitivas armazenam seus valores direto na memória\n");
		
			byte bite = 1;
			short curto = 1234;
			char caracter = 'a';
			int inteiro = 10;
			float flutuante = 10.1f;
			double dobro = 10.0005;
			boolean logico = true;
			
			String Nome = new String("André");
			
		
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
		
		System.out.print("Operadores matemáticos: \n+, -, *, /, %, ++, --, +=, -=, *=, /=, %=\n ");
	}
}
