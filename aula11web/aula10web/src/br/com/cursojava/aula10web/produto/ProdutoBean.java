package br.com.cursojava.aula10web.produto;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class ProdutoBean {

	private FacadeProduto facade = new FacadeProduto();

	private List<Produto> produtos = new ArrayList<>();

	private Produto produto = facade.novoProduto();

	private String oid = "";

	public void setOid(String oid) {

		this.oid = oid;

		if (oid != null) {

			if ("".equals(oid.trim()) || "novo".equals(oid)) {

				novo();

			} else {

				carregarProduto(Integer.parseInt(oid));
			}
		}

	}

	public String getOid() {

		return oid;
	}

	private void novo() {

		this.produto = facade.novoProduto();

	}

	private void carregarProduto(Integer numero) {

		this.produto = facade.buscarProdutoPorId(numero);
		if (this.produto == null) {

			System.out.println("preciso avisar o usuario");
		}

	}

	public List<Produto> getProdutos() {

		if (produtos == null || produtos.isEmpty()) {

			produtos = facade.carregarProdutos();
		}
		return produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String salvar() {
		boolean ok = facade.salvar(this.produto);
		if (ok) {

			FacesContext ctx = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Produto salvo com sucesso");
			ctx.addMessage(null, msg);
		} else {
			FacesContext ctx = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage("Não foi possivel salvar o produto");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			ctx.addMessage(null, msg);

		}
		return null;

	}

}
