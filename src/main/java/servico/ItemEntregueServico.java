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
	
	public void inserirAtualizar(ItemEntregue x) throws ServicoException {
		try {
			
			ItemEntregue aux = dao.buscaItensEntrega(x.getProduto(), x.getEntrega());
			if(aux != null){
				throw new ServicoException("O item já está na lista.", 22);
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
