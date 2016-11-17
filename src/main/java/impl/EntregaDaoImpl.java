package impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.EntregaDao;
import dominio.Entrega;

public class EntregaDaoImpl implements EntregaDao {

	private EntityManager em;

	public EntregaDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Entrega x) {
		if (x.getCodEntrega() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Entrega x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Entrega buscar(int cod) {
		return em.find(Entrega.class, cod);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Entrega> buscarTodos() {
		String jpql = "SELECT x FROM Entrega x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Entrega> buscarEntregaCliente(int codCliente) {
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
		String jpql = "SELECT ent FROM tb_entrega ent INNER JOIN tb_endereco end ON ent.entrega = end.codEndereco INNER JOIN tb_cliente c ON end.cliente = c.codCliente WHERE c.codCliente = :c1";
=======
		String jpql = "SELECT x FROM tb_entrega x WHERE x.codCliente = :c1";
>>>>>>> Endereco funfando
		Query query = em.createQuery(jpql);
		query.setParameter("c1", codCliente);
		return query.getResultList();
	}
	
	
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
}
=======
}
>>>>>>> Endereco funfando
