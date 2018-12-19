package br.com.cursojava.aula10web.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010web.util.JPAUtil;

public class RepositorioProduto {

	public List<Produto> buscarTodos() {

		List<Produto> lista = null;

		EntityManager em = JPAUtil.createEntityManager();

		TypedQuery<Produto> query = em.createQuery("select c from Produto c", Produto.class);

		lista = query.getResultList();

		return lista;

	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		EntityManager em = JPAUtil.createEntityManager();
		produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}

	public List<Produto> buscarPorProduto(String produto) {

		List<Produto> lista = null;

		EntityManager em = JPAUtil.createEntityManager();

		TypedQuery<Produto> query = em
				.createQuery("select c from Produto c where upper(c.produto) like upper(:produto)", Produto.class);

		query.setParameter("produto", "%" + produto + "%");

		lista = query.getResultList();

		return lista;

	}

	public boolean salvar(Produto produto) {
		if (produto != null) {
			if (produto.getId() == null) {

				return inserir(produto);
			} else {

				return atualizar(produto);
			}
		}
		return false;
	}

	private boolean inserir(Produto produto) {

		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}

	private boolean atualizar(Produto produto) {
		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}

	public boolean remover(Produto produto) {

		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.remove(em.merge(produto));
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}

}
