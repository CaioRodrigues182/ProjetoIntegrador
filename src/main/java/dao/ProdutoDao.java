package dao;

import java.util.List;

import dominio.Produto;

public interface ProdutoDao {

	public void inserirAtualizar(Produto x);
	public void excluir(Produto x);
	public Produto buscar(int cod);
	public List<Produto> buscarTodos();
} 