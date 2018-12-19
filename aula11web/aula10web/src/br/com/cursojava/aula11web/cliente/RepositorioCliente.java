package br.com.cursojava.aula11web.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.cursojava.aula010web.util.JPAUtil;

public class RepositorioCliente {
	
	public List<Cliente> buscarTodos() {

		List<Cliente> lista = null;

		EntityManager em = JPAUtil.createEntityManager();

		TypedQuery<Cliente> query = em.createQuery("select c from Cliente c", Cliente.class);

		lista = query.getResultList();

		return lista;

	}

	public Cliente buscarPorId(Integer id) {
		Cliente cliente = null;
		EntityManager em = JPAUtil.createEntityManager();
		cliente = em.find(Cliente.class, id);
		em.close();
		return cliente;
	}

	public List<Cliente> buscarPorCliente(String cliente) {

		List<Cliente> lista = null;

		EntityManager em = JPAUtil.createEntityManager();

		TypedQuery<Cliente> query = em
				.createQuery("select c from Cliente c where upper(c.cliente) like upper(:cliente)", Cliente.class);

		query.setParameter("cliente", "%" + cliente + "%");

		lista = query.getResultList();

		return lista;

	}

	public boolean salvar(Cliente cliente) {
		if (cliente != null) {
			if (cliente.getId() == null) {

				return inserir(cliente);
			} else {

				return atualizar(cliente);
			}
		}
		return false;
	}

	private boolean inserir(Cliente cliente) {

		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}

	private boolean atualizar(Cliente cliente) {
		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.merge(cliente);
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}

	public boolean remover(Cliente cliente) {

		boolean result = false;
		EntityManager em = JPAUtil.createEntityManager();
		try {

			em.getTransaction().begin();
			em.remove(em.merge(cliente));
			em.getTransaction().commit();
			result = true;
		} catch (Exception e) {

			result = false;

		}
		em.close();
		return result;

	}
}
