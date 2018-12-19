package br.com.cursojava.aula11web.cliente;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.cursojava.aula11web.cliente.FacadeCliente;
import br.com.cursojava.aula11web.cliente.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean {
	
	private FacadeCliente facade = new FacadeCliente();

	private List<Cliente> clientes = new ArrayList<>();

	private Cliente cliente = facade.novoCliente();

	private String oid = "";

	public void setOid(String oid) {

		this.oid = oid;

		if (oid != null) {

			if ("".equals(oid.trim()) || "novo".equals(oid)) {

				novo();

			} else {

				carregarCliente(Integer.parseInt(oid));
			}
		}

	}

	public String getOid() {

		return oid;
	}

	private void novo() {

		this.cliente = facade.novoCliente();

	}

	private void carregarCliente(Integer numero) {

		this.cliente = facade.buscarClientePorId(numero);
		if (this.cliente == null) {

			System.out.println("preciso avisar o usuario");
		}

	}

	public List<Cliente> getClientes() {

		if (clientes == null || clientes.isEmpty()) {

			clientes = facade.carregarClientes();
		}
		return clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String salvar() {
		boolean ok = facade.salvar(this.cliente);
		if (ok) {

			FacesContext ctx = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Cliente salvo com sucesso");
			ctx.addMessage(null, msg);
		} else {
			FacesContext ctx = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Não foi possivel salvar o cliente");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			ctx.addMessage(null, msg);

		}
		return null;

	}

}



