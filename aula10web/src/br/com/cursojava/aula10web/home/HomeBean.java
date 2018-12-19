package br.com.cursojava.aula10web.home;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean // vincula no html o homeBean
@RequestScoped // inicializada cada vez que houver um request (requisição)
public class HomeBean {
	
	private final String titulo = "Bem vindo ao JSF";
	
	public String getTitulo() {
		
		return titulo;
		
	}

}
