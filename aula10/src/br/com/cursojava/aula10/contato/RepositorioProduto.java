package br.com.cursojava.aula10.contato;

import java.util.List;

import javax.enterprise.inject.Typed;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import aula10.JPAUtil;

public class RepositorioProduto {
	
	public List<Produto> buscarTodos(){
		
		List<Produto> lista = null;
		
		EntityManager em = JPAUtil.createEntityManager();
		
		TypedQuery<Produto> query = em.createQuery("select c from Produto c", Produto.class);
		
		lista = query.getResultList();
		
		return lista;
		
	}
	
	
	public Produto buscarPorId(Integer id){
		
		Produto produto = null;
		
		EntityManager em = JPAUtil.createEntityManager();
		
		produto = em.find(Produto.class, id);
		
		em.close();
		
		return produto;
		
		
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
		
		if(produto != null){
			
			if(produto.getId() == null){
				
				inserir(produto);
			}else{
				
				atualizar(produto);
			}
		}
		return produto;
	}
	
	
	private Produto inserir(Produto produto){
		
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
	}
	
	private Produto atualizar(Produto produto){
		
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.merge(produto);
		em.getTransaction().commit();
		em.close();
		return produto;
		
	}
	
	public void remover(Produto produto){
		
		EntityManager em = JPAUtil.createEntityManager();
		em.getTransaction().begin();
		em.remove(produto);
		em.getTransaction().commit();
		em.close();
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setProduto("martelo");
		
		produto.setPreco(100.00);
		
		
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, 1);
		em.close();
		
		
		
		/*
		RepositorioProduto repositorio = new RepositorioProduto();
		List<Produto> todos = repositorio.buscarTodos();
		for (Produto produto : todos) {
			
			System.out.println(produto);
			
		}
		
		/*
		System.out.println("======= BUSCA POR PRODUTO ==========");
		
		todos = repositorio.buscarPorProduto("martelo");
		for (Produto produto : todos) {
			
			System.out.println(produto);
			
		}
		System.out.println("======  REMOVER ===========");
		repositorio.remover(repositorio.buscarPorId(1));
		System.out.println("====== BUSCA POR ID=======");
		System.out.println(repositorio.buscarPorId(1));
		
		
		
		
		
		
		/*
		em = JPAUtil.createEntityManager();
				
		em.getTransaction().begin();
		
		produto = em.merge(produto); // considera os dados da memoria para sobrescrever no BD
		
		//em.persist(contato); // para realizar inserir, deletar ou atualizar é preciso estar dentro de uma transação = Transaction... para buscar dados não precisa
		produto.setProduto("martelo de ferro");
		
		em.getTransaction().commit();
		em.close();
		JPAUtil.closeEmf();
		
		*/
		
		
		
		
	}
	
	

	
	
	
}
