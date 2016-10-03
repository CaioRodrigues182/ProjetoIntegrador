package impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.FornecedorDao;
import dominio.Fornecedor;

public class FornecedorDaoImpl implements FornecedorDao {

	private EntityManager em;

	public FornecedorDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Fornecedor x) {
		if (x.getCodFornecedor() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Fornecedor x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Fornecedor buscar(int cod) {
		return em.find(Fornecedor.class, cod);
	}
	
	//Busca por pedaço do nome
	@Override
	public List<Fornecedor> buscarFornecedor(String nome) {
		String jpql = "SELECT x FROM Fornecedor x WHERE x.nome LIKE '%:f%'";
		Query query = em.createQuery(jpql);
		query.setParameter("f", nome);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Fornecedor> buscarTodos() {
		String jpql = "SELECT x FROM Fornecedor x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
}
