package servico;

import java.math.BigDecimal;
import java.util.List;
import java.util.LinkedList;

import dao.DaoFactory;
import dao.ProdutoDao;
import dao.Transaction;
import dominio.Produto;

public class ProdutoServico {

	private ProdutoDao dao;
	
	public ProdutoServico() {
		dao = DaoFactory.criarProdutoDao();
	}


	public void validar (Produto x) throws ValidacaoException {
		List<String> erros = new LinkedList<>();

		if (x.getNome() == null) {
			erros.add("Preencha o nome!");
		}

		if (x.getPreco() == null) {
			erros.add("Defina um preço!");
		}

		if (x.getFornecedor() == null) {
			erros.add("Escolha um fornecedor!");

		}

	}

	public void inserirAtualizar(Produto x) throws ServicoException {
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
