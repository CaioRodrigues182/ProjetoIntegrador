package dao;

import java.util.List;

import dominio.Fornecedor;
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
import dominio.Produto;
=======
>>>>>>> Endereco funfando

public interface FornecedorDao {

	public void inserirAtualizar(Fornecedor x);
	public void excluir(Fornecedor x);
	public Fornecedor buscar(int cod);
	public List<Fornecedor> buscarTodos();
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	public List<Fornecedor> buscarFornecedor(String nome);
	public Fornecedor existeFornecedor(String cnpj);
	
=======
	public Fornecedor existeFornecedor(String cnpj);
	public List<Fornecedor> buscarFornecedor(String nome);
>>>>>>> Endereco funfando
} 
