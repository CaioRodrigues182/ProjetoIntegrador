package servico;

import java.util.List;

import dao.ClienteDao;
import dao.DaoFactory;
import dao.Transaction;
import dominio.Cliente;
import dominio.Fornecedor;

public class ClienteServico {

	private ClienteDao dao;
	
	public ClienteServico() {
		dao = DaoFactory.criarClienteDao();
	}
	
	public void inserirAtualizar(Cliente x) throws ServicoException {
		try {
			Cliente aux = dao.existeCliente(x.getCpf()); 
			if(aux == null){
				throw new ServicoException("CPF já existe", 0);
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
	
	public void excluir(Cliente x) {
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
	
	public Cliente buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public void buscarDadosCliente(int cod) {
		Cliente cliente = dao.buscar(cod);
		System.out.println(cliente);
	}
	
	
	public List<Cliente> buscarTodos() {
		return dao.buscarTodos();
	}
}
