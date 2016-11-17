package dao;

import java.util.List;

<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
import dominio.Cliente;
import dominio.Endereco;
import dominio.Entrega;
import dominio.Produto;
=======
import dominio.Endereco;
>>>>>>> Endereco funfando

public interface EnderecoDao {

	public void inserirAtualizar(Endereco x);
	public void excluir(Endereco x);
	public Endereco buscar(int cod);
	public List<Endereco> buscarTodos();
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	
	public List<Endereco> buscarEnderecosCliente(Cliente c);
=======
>>>>>>> Endereco funfando
} 
