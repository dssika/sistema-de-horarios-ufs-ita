package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public interface IPersistenciaDisciplinaDaoJPA {

	public abstract void gravar(Disciplina disciplina);

	public abstract void editar(Disciplina disciplina);

	public abstract void excluir(Disciplina disciplina);

	public abstract List<Disciplina> buscarTodos();
	
	public abstract Disciplina visualizarDisciplina(Disciplina disciplina);

}