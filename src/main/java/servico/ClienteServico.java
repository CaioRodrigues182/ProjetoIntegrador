package servico;

import java.util.List;

import dao.ClienteDao;
import dao.DaoFactory;
import dao.Transaction;
import dominio.Cliente;
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
import dominio.Fornecedor;
=======
>>>>>>> Endereco funfando

public class ClienteServico {

	private ClienteDao dao;
	
	public ClienteServico() {
		dao = DaoFactory.criarClienteDao();
	}
	
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
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
=======
	public void inserirAtualizar(Cliente x) {
		try {
		Transaction.begin();
		dao.inserirAtualizar(x);
		Transaction.commit();
		}
>>>>>>> Endereco funfando
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
	
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	public void buscarDadosCliente(int cod) {
		Cliente cliente = dao.buscar(cod);
		System.out.println(cliente);
	}
	
	
	public List<Cliente> buscarTodos() {
		return dao.buscarTodos();
	}
=======
	public List<Cliente> buscarTodos() {
		return dao.buscarTodos();
	}
	
	public Cliente existeCliente(String cpf) {
		return dao.existeCliente(cpf);
		
	}
>>>>>>> Endereco funfando
}
