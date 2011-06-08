package br.ufs.dsi.sistemaDeHorarios.professor.dados;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor;
import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

public interface IPersistenciaProfessor {

	public abstract void gravar(Professor professor);

	public abstract void excluir(Professor professor);

	public abstract void visualizarDados(Professor professor);

	public abstract void gravarHorariosPreferenciais(HorariosProfessor horarios);

	public abstract void gravarDisciplinasPreferenciais(Disciplina disciplina);

	public abstract void gravarValidacao(HorariosProfessor horario);

}