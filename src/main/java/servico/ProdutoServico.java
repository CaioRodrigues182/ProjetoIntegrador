package servico;

import java.util.List;

import dao.ProdutoDao;
import dao.DaoFactory;
import impl.EM;
import dominio.Produto;

public class ProdutoServico {

	private ProdutoDao dao;
	
	public ProdutoServico() {
		dao = DaoFactory.criarProdutoDao();
	}
	
	public void inserirAtualizar(Produto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public void excluir(Produto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public Produto buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Produto> buscarTodos() {
		return dao.buscarTodos();
	}
}
