package br.com.cursojava.aula10web.produto;

import java.util.List;

public class FacadeProduto {

	private RepositorioProduto repositorio = new RepositorioProduto();

	public List<Produto> carregarProdutos() {

		return repositorio.buscarTodos();
	}

	public Produto novoProduto() {
		return new Produto();
	}

	public Produto buscarProdutoPorId(Integer numero) {
		return repositorio.buscarPorId(numero);

	}

	public boolean salvar(Produto produto) {
		return repositorio.salvar(produto);
	}

}
