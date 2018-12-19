package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;


public class ExemploList {

	public static void main(String[] args){
		
		List<String> nomes = new ArrayList<>();
		
		//adicionar elementos ao final da lista
		
		nomes.add("Joao");
		nomes.add("Maria");
		System.out.println(nomes);
		System.out.println(nomes.size()); // qtde de elementos que tem na lista
		
		//adicionar elementos no inicio 
		
		nomes.add(0,"Jose");
		nomes.add(0,"Ana");
		System.out.println(nomes);
		
		nomes.add("Frederico");
		System.out.println(nomes);
		//trocar o elemento
		nomes.set(nomes.size() -1, "tibúrcio");
		System.out.println(nomes);
		
		//buscar um elemento especifico na lista [lista.get(indice)]
		System.out.println(nomes.get(0));
		System.out.println(nomes.get(1));
		System.out.println(nomes.get(2));
		System.out.println(nomes.get(3));
		
		//verificar o indice de um elemento [lista.indexOf(elemento)]
		
		System.out.println(nomes.indexOf("tibúrcio"));
		System.out.println(nomes.indexOf("Marília")); //se nao existir retorna -1
		
		//verificar se um elemento está contido na lista [lista.contains(elemento)]
		
		System.out.println(nomes.contains("Joao"));
		System.out.println(nomes.contains("Bartolomeu"));
		
		//criar uma sublista
		
		List<String> sublista = nomes.subList(2,nomes.size());
		System.out.println(sublista);
		
		//remover um elemento da lista atraves do indice [lista.remove(index)]
		
		System.out.println(nomes);
		nomes.remove(0);
		System.out.println(nomes);
		
		//remover um elemento da lista atraves da referencia [lista.remove(elemento)]
		
		nomes.remove("Maria");
		System.out.println(nomes);
		
		
		
		
	}
	
}
