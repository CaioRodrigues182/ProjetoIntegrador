package servico;

import java.util.List;

import dao.DaoFactory;
import dao.FornecedorDao;
import dao.Transaction;
import dominio.Fornecedor;
import dominio.Produto;

public class FornecedorServico {

	private FornecedorDao dao;
	
	public FornecedorServico() {
		dao = DaoFactory.criarFornecedorDao();
	}
	
	public void inserirAtualizar(Fornecedor x) throws ServicoException{
		try {
			Fornecedor aux = dao.existeFornecedor(x.getCnpj()); 
			if(aux != null){
				throw new ServicoException("CNPJ já existe", 0);
			}
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
	
	public void excluir(Fornecedor x) throws ServicoException{
		try {
			List<Produto> prod = x.getProdutos(); 
			if(prod.size() > 0){
				throw new ServicoException("Não é possível excluir pois já existem produtos para esse Fornecedor", 0);
			}
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
	
	public List<Fornecedor> buscarFornecedor(String nome){
		return dao.buscarFornecedor(nome);
	}
}