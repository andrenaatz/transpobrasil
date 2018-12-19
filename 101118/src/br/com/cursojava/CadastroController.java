package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;

public class CadastroController {
	
	List<String> produtos = new ArrayList<>();
	
	
	public void criarProduto(String nome, String descricao) {
		// TODO Auto-generated method stub
		produtos.add(nome);
		produtos.add(descricao);
		//produtos.add(preco);
		System.out.print("cadastrado o produto: ");
		System.out.print(produtos.get(produtos.size()-1));
		
		
	}
		
	//public int contarContatos() {
	//	return produtos.size();
	//}
	
	
	public void listarArray(){
		
		if(produtos.size()==0){
			System.out.println("Nenhum produto");
		}else
		System.out.println(produtos);
		
		
		}

	public void removerProduto(String nome) {
		// TODO Auto-generated method stub
		if (produtos.contains(nome)==true){
			
		produtos.remove(nome);
		
		System.out.println("produto deletado");
		
		}else
			System.out.println("não cadastrado");
	}
	
	
		
	}

	


