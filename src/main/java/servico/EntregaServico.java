package servico;

import java.util.List;

import dao.EntregaDao;
import dao.DaoFactory;
import impl.EM;
import dominio.Entrega;

public class EntregaServico {

	private EntregaDao dao;
	
	public EntregaServico() {
		dao = DaoFactory.criarEntregaDao();
	}
	
	public void inserirAtualizar(Entrega x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public void excluir(Entrega x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public Entrega buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Entrega> buscarTodos() {
		return dao.buscarTodos();
	}
}
