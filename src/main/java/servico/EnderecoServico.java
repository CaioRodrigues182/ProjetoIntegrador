package servico;

import java.util.List;

import dao.EnderecoDao;
import dao.DaoFactory;
import impl.EM;
import dominio.Endereco;
import dominio.Endereco;

public class EnderecoServico {

	private EnderecoDao dao;
	
	public EnderecoServico() {
		dao = DaoFactory.criarEnderecoDao();
	}
	
	public void inserirAtualizar(Endereco x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public void excluir(Endereco x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	public Endereco buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Endereco> buscarTodos() {
		return dao.buscarTodos();
	}
}
