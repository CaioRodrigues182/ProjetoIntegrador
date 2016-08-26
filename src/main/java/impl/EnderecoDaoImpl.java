package impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.EnderecoDao;
import dominio.Endereco;

public class EnderecoDaoImpl implements EnderecoDao {

	private EntityManager em;

	public EnderecoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Endereco x) {
		if (x.getCodEndereco() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Endereco x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Endereco buscar(int cod) {
		return em.find(Endereco.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> buscarTodos() {
		String jpql = "SELECT x FROM Endereco x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
}
