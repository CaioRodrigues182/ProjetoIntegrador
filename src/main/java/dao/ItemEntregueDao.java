package dao;

import java.util.List;

import dominio.Entrega;
import dominio.ItemEntregue;
import dominio.Produto;

public interface ItemEntregueDao {

	public void inserirAtualizar(ItemEntregue x);
	public void excluir(ItemEntregue x);
	public ItemEntregue buscar(int cod);
	public List<ItemEntregue> buscarTodos();
<<<<<<< 81bfa358c48e03ecf54c39e1d728781e81aa4b76
	public ItemEntregue buscaItensEntrega(Produto p, Entrega e);
=======
	ItemEntregue buscaItensEntrega(Produto p, Entrega e);
>>>>>>> Endereco funfando
} 
