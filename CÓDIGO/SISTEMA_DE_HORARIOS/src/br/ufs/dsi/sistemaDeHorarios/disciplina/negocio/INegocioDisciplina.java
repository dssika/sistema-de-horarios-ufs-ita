package br.ufs.dsi.sistemaDeHorarios.disciplina.negocio;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public interface INegocioDisciplina {

	public abstract void gravar(Disciplina disciplina);

	public abstract void excluir(Disciplina disciplina);

	public abstract void editar(Disciplina disciplina);

	public abstract List<Disciplina> visualizarDisciplina();

}