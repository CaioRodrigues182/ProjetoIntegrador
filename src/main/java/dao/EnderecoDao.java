package dao;

import java.util.List;

import dominio.Cliente;
import dominio.Endereco;
import dominio.Entrega;
import dominio.Produto;

public interface EnderecoDao {

	public void inserirAtualizar(Endereco x);
	public void excluir(Endereco x);
	public Endereco buscar(int cod);
	public List<Endereco> buscarTodos();
	
	public List<Endereco> buscarEnderecosCliente(Cliente c);
} 
