package dao;

import java.util.List;

import dominio.Cliente;

public interface ClienteDao {

	public void inserirAtualizar(Cliente x);
	public void excluir(Cliente x);
	public Cliente buscar(int cod);
	public List<Cliente> buscarTodos();
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	public Cliente existeCliente(String cpf);
=======
	Cliente existeCliente(String cpf);
>>>>>>> Endereco funfando
} 
