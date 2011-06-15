package br.ufs.dsi.sistemaDeHorarios.horario.dados;

import br.ufs.dsi.sistemaDeHorarios.arquitetura.dados.DaoGenerico;
import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.Horarios;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor;

public interface IPersistenciaHorarioDAO extends DaoGenerico<Horarios, Integer>{

	public abstract void inserirDisciplinaObrigatoria(Disciplina disciplina);

	public abstract void inserirDisciplinaOptativa(Disciplina disciplina);

	public abstract void ofertarHorario();

	public abstract void inserirHorarioProfessor(HorariosProfessor horarioProfessor);

	public abstract void visualizarHorarioPeriodo(HorariosProfessor horarioProfessor);

	public abstract void gravarHorario();

}