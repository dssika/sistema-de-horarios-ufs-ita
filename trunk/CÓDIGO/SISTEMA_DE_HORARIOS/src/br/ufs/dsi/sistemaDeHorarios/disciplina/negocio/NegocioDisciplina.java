package br.ufs.dsi.sistemaDeHorarios.disciplina.negocio;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplina;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO;
import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public class NegocioDisciplina {
	
	IPersistenciaDisciplina persistenciaDisciplina;
	
	public NegocioDisciplina(){
		persistenciaDisciplina = new PersistenciaDisciplinaDAO() ;
	}
	
	public void gravar(Disciplina disciplina) {
		persistenciaDisciplina.gravar(disciplina);
	}
	
	public void excluir(Disciplina disciplina) {
		persistenciaDisciplina.excluir(disciplina);
	}
	
	public void editar(Disciplina disciplina) {
		persistenciaDisciplina.editar(disciplina);
	}
	
	public List<Disciplina> visualizarDisciplina(){
		return persistenciaDisciplina.visualizarDisciplina();
	}
}
