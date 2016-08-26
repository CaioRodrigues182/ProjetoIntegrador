package servico;

import java.util.List;

import dao.ItemEntregueDao;
import dao.DaoFactory;
import impl.EM;
import dominio.ItemEntregue;

public class ItemEntregueServico {

	private ItemEntregueDao dao;
	
	public ItemEntregueServico() {
		dao = DaoFactory.criarItemEntregueDao();
	}
	
	public void inserirAtualizar(ItemEntregue x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public void excluir(ItemEntregue x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public ItemEntregue buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<ItemEntregue> buscarTodos() {
		return dao.buscarTodos();
	}
}
