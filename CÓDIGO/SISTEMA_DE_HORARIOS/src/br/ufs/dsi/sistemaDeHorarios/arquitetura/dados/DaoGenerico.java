package br.ufs.dsi.sistemaDeHorarios.arquitetura.dados;

import java.io.Serializable;
import java.util.List;

public interface DaoGenerico <T, PK extends Serializable>{
	public T buscar (PK primaryKey);
	public List<T> buscarTodos();
	public void gravar(T object);
	public void editar(T object);
	public void excluir(T object);
}
