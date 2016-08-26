package dao;

import java.util.List;

import dominio.ItemEntregue;

public interface ItemEntregueDao {

	public void inserirAtualizar(ItemEntregue x);
	public void excluir(ItemEntregue x);
	public ItemEntregue buscar(int cod);
	public List<ItemEntregue> buscarTodos();
} 
