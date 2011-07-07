package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.arquitetura.dados.DaoGenerico;
import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public interface IPersistenciaDisciplinaJDBC extends DaoGenerico<Disciplina, Integer> {
	
	void gravar(Disciplina disciplina);
 
	void editar(Disciplina disciplina); 

	void excluir(Disciplina disciplina);

	List<Disciplina> visualizarDisciplina();
}