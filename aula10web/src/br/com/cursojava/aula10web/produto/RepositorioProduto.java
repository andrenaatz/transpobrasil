package br.com.cursojava.aula10web.produto;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010web.util.JPAUtil;



public class RepositorioProduto {
	
	public List<Produto> buscarTodos(){
		
		List<Produto> lista = null;
		
	
		
		EntityManager em = JPAUtil.createEntityManager();
		
		TypedQuery<Produto> query = em.createQuery("select c from Produto c", Produto.class);
		
		lista = query.getResultList();
		
		return lista;
		
	}
	
	
	
	public Produto buscarPorId(Integer id){
		
		return null;
	}
	
	
	
	public List<Produto> buscarPorProduto(String produto){
		
		List<Produto> lista = null;
		
				
		EntityManager em = JPAUtil.createEntityManager();
		
		TypedQuery<Produto> query = em.createQuery("select c from Produto c where upper(c.produto) like upper(:produto)", Produto.class);
		
		query.setParameter("produto", "%"+produto+"%");
		
		lista = query.getResultList();
		
		return lista;
		
	}
	
	public Produto salvar(Produto produto){
		
		return null;
	}
	
	
	
	public boolean remover(Produto produto){
		
		return false;
		
	}
	
	
		
		
	}
	
	

	
	
	

