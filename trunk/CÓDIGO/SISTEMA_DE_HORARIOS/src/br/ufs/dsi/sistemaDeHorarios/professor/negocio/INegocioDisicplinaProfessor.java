package br.ufs.dsi.sistemaDeHorarios.professor.negocio;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

public interface INegocioDisicplinaProfessor {

	public abstract void gravarDisciplinaProfessor(Disciplina disciplina,
			Professor professor);

	public abstract void visualizarDisciplinaProfessor(Disciplina disciplina,
			Professor professor);

	public abstract void visualizarDados(Professor professor);

	public abstract void autenticar(String login, String senha);

}