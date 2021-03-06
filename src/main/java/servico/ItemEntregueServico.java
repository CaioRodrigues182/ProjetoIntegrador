package servico;

import java.util.List;

import dao.DaoFactory;
import dao.ItemEntregueDao;
import dao.Transaction;
import dominio.ItemEntregue;

public class ItemEntregueServico {

	private ItemEntregueDao dao;
	
	public ItemEntregueServico() {
		dao = DaoFactory.criarItemEntregueDao();
	}
	
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	public void inserirAtualizar(ItemEntregue x) throws ServicoException {
		try {
			
			ItemEntregue aux = dao.buscaItensEntrega(x.getProduto(), x.getEntrega());
			if(aux != null){
				throw new ServicoException("O item j� est� na lista.", 22);
			}
			
			
=======
	public void inserirAtualizar(ItemEntregue x) {
		try {
>>>>>>> Endereco funfando
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
	
	public void excluir(ItemEntregue x) {
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
	
	public ItemEntregue buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<ItemEntregue> buscarTodos() {
		return dao.buscarTodos();
	}
}
