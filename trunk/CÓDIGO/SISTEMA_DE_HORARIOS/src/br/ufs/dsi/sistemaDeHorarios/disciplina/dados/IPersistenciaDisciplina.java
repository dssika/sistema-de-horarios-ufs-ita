package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public interface IPersistenciaDisciplina {
	

	public abstract void gravar(Disciplina disciplina);

	public abstract void editar(Disciplina disciplina); 

	public abstract void excluir(Disciplina disciplina);

	public abstract Disciplina visualizarDisciplina(Disciplina disciplina);
}