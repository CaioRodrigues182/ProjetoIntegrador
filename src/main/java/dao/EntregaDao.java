package dao;

import java.util.List;

import dominio.Entrega;
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
import dominio.Produto;
=======
>>>>>>> Endereco funfando

public interface EntregaDao {

	public void inserirAtualizar(Entrega x);
	public void excluir(Entrega x);
	public Entrega buscar(int cod);
	public List<Entrega> buscarTodos();
	public List<Entrega> buscarEntregaCliente(int codCliente);
} 
