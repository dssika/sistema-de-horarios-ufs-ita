package br.ufs.dsi.sistemaDeHorarios.professor.dados;


import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor;
import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

public interface IPersistenciaProfessor{

	public abstract void gravar(Professor professor);
	
	public abstract void editar(Professor professor);

	public abstract void excluir(Professor professor);
	
	public abstract List<Professor> visualizarProfessores();
	
	public abstract String autenticar(String login, String senha);
	
	public abstract Professor buscar(Integer idProfessor) ;

	public abstract void gravarHorariosPreferenciais(HorariosProfessor horarios);

	public abstract void gravarDisciplinasPreferenciais(Disciplina disciplina);

	public abstract void gravarValidacao(HorariosProfessor horario);

	public abstract Professor buscar(Professor professor);



}