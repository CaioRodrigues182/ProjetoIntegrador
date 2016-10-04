package dao;

import java.util.List;

import dominio.Fornecedor;
import dominio.Produto;

public interface FornecedorDao {

	public void inserirAtualizar(Fornecedor x);
	public void excluir(Fornecedor x);
	public Fornecedor buscar(int cod);
	public List<Fornecedor> buscarTodos();
	public List<Fornecedor> buscarFornecedor(String nome);
	public Fornecedor existeFornecedor(String cnpj);
	
} 
