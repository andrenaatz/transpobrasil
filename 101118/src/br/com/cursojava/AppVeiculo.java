package br.com.cursojava;

public class AppVeiculo {
	
	public static void main(String[] args){
		
		
		Veiculo v = Veiculo.build("Ford");
		Veiculo v1 = new Automovel(1); //vai buscar o construtor que implementou o valor inteiro (primitivo)
		
		// 
		
		Integer i = 2;
		Veiculo v2 = new Veiculo(i); // vai buscar o construtor que implementou como parametros o Integer
		
		/*
		v1.setMarca("Honda");
		v1.setModelo("Civic");
		v1.setId(1);
		v1.setAnoFabricacao(2018);
		v1.setAnoModelo(2019);
		
	
		
		v2.setMarca("Honda");
		v2.setModelo("Civic");
		v2.setId(1);
		v2.setAnoFabricacao(2018);
		v2.setAnoModelo(2019);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1.equals(v2));
		
		System.out.println("oi".equals("oi"));
		*/
		
		Automovel auto = new Automovel();
		auto.setMarca("BMW");
		System.out.println(auto.getMarca());
		System.out.println(auto.retornarMarca());
		
		// java.util --> collection : List ,e Set extende a Collection //  Map faz parte da interface collection 
		// lista - pode ter valores repetidos
		// conjuntos - nao pode ter valores repetidos dentro da lista
		// mapa - chave e valor
		//
		// Implementaçoes mais comuns:
		// Mais comuns de List: ArrayList; LinkedList; e Vector
		// No Set temos: HashSet; e TreeSet
		// No Map temos : HashMap; TreeMap; HashTable
		
		
		
		

		
		
		
	}

}
