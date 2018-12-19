package br.com.cursojava.aula11web.cliente;

import java.util.List;

import br.com.cursojava.aula11web.cliente.Cliente;
import br.com.cursojava.aula11web.cliente.RepositorioCliente;


public class FacadeCliente {
	
	private RepositorioCliente repositorio = new RepositorioCliente();

	public List<Cliente> carregarClientes() {

		return repositorio.buscarTodos();
	}

	public Cliente novoCliente() {
		return new Cliente();
	}

	public Cliente buscarClientePorId(Integer numero) {
		return repositorio.buscarPorId(numero);

	}

	public boolean salvar(Cliente cliente) {
		return repositorio.salvar(cliente);
	}

}



