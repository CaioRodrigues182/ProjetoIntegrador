package impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.ItemEntregueDao;
import dominio.ItemEntregue;

public class ItemEntregueDaoImpl implements ItemEntregueDao {

	private EntityManager em;

	public ItemEntregueDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(ItemEntregue x) {
		if (x.getCodItemEntregue() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(ItemEntregue x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public ItemEntregue buscar(int cod) {
		return em.find(ItemEntregue.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemEntregue> buscarTodos() {
		String jpql = "SELECT x FROM ItemEntregue x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
}
