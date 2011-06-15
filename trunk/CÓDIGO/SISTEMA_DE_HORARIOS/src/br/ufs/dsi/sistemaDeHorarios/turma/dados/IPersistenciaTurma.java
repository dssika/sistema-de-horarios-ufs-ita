package br.ufs.dsi.sistemaDeHorarios.turma.dados;

import br.ufs.dsi.sistemaDeHorarios.arquitetura.dados.DaoGenerico;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.Horarios;
import br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma;

public interface IPersistenciaTurma extends DaoGenerico<Turma, Integer> {

	public abstract void visualizarHistorico(Turma turma);

	public abstract void gravarHorarioTurma(Horarios horarios);

	public abstract void enviarDados(Turma turma);

}