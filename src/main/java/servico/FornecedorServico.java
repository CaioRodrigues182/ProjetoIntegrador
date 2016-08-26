package servico;

import java.util.List;

import dao.FornecedorDao;
import dao.DaoFactory;
import impl.EM;
import dominio.Fornecedor;

public class FornecedorServico {

	private FornecedorDao dao;
	
	public FornecedorServico() {
		dao = DaoFactory.criarFornecedorDao();
	}
	
	public void inserirAtualizar(Fornecedor x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public void excluir(Fornecedor x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public Fornecedor buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Fornecedor> buscarTodos() {
		return dao.buscarTodos();
	}
}
