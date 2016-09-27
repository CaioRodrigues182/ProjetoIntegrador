package servico;

import java.util.List;

import dao.DaoFactory;
import dao.FornecedorDao;
import dao.Transaction;
import dominio.Fornecedor;

public class FornecedorServico {

	private FornecedorDao dao;
	
	public FornecedorServico() {
		dao = DaoFactory.criarFornecedorDao();
	}
	
	public void inserirAtualizar(Fornecedor x) {
		try {
			Transaction.begin();
			dao.inserirAtualizar(x);
			Transaction.commit();
			}
			catch (RuntimeException e) {
				if (Transaction.isActive()){
					Transaction.rollback();
				}
				System.out.println("Erro: " + e.getMessage());
			}
		}
	
	public void excluir(Fornecedor x) {
		try {
			Transaction.begin();
			dao.excluir(x);
			Transaction.commit();
			}
			catch (RuntimeException e) {
				if (Transaction.isActive()){
					Transaction.rollback();
				}
				System.out.println("Erro: " + e.getMessage());
			}
		}
	
	public Fornecedor buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Fornecedor> buscarTodos() {
		return dao.buscarTodos();
	}
}
