package br.ufs.dsi.sistemaDeHorarios.professor.negocio;

import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

public interface INegocioProfessor {

	public abstract void gravar(Professor professor);

	public abstract void editar(Professor professor);

	public abstract void excluir(Professor professor);

}