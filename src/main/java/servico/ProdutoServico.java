package servico;

import java.math.BigDecimal;
import java.util.List;

import dao.DaoFactory;
import dao.ProdutoDao;
import dao.Transaction;
import dominio.Produto;

public class ProdutoServico {

	private ProdutoDao dao;
	
	public ProdutoServico() {
		dao = DaoFactory.criarProdutoDao();
	}
	
	public void inserirAtualizar(Produto x) {
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
	
	public void excluir(Produto x) {
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
	
	public Produto buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Produto> buscarTodos() {
		return dao.buscarTodos();
	}
	
	public List<Produto> buscaNomePreco(String nome, BigDecimal valorMin, BigDecimal valorMax){
		return dao.buscaNomePreco(nome, valorMin, valorMax);
	}
}
