package servico;

import java.util.LinkedList;
import java.util.List;

import dao.DaoFactory;
import dao.EnderecoDao;
import dao.Transaction;
import dominio.Endereco;

public class EnderecoServico {

	private EnderecoDao dao;
	
	public EnderecoServico() {
		dao = DaoFactory.criarEnderecoDao();
	}
	
	
	public void validar (Endereco x) throws ValidacaoException {
		List<String> erros = new LinkedList<>();
		
		if(x.getLogadouro()==null) {
			erros.add("Favor preencher o logadouro!");
		}
		
		if(x.getNumero()==null) {
			erros.add("Favor preencher o numero!");
		}
		
		if(x.getComplemento()==null) {
			erros.add("Favor preencher o complemento!");
		}
		
		if(x.getBairro()==null) {
			erros.add("Favor preencher o bairro!");
		}
		
		if(x.getCep()==null) {
			erros.add("Favor preencher o CEP!");
		}
	}
	
	
	
	
	public void inserirAtualizar(Endereco x) {
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
	
	public void excluir(Endereco x) {
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
	
	public Endereco buscar(int cod) {
		return dao.buscar(cod);
	}
	
	public List<Endereco> buscarTodos() {
		return dao.buscarTodos();
	}
}
