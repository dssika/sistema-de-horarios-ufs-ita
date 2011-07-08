package br.ufs.dsi.sistemaDeHorarios.disciplina.negocio;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaDaoJPA;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaJDBC;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JPA;
import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public class NegocioDisciplina {
	
	IPersistenciaDisciplinaDaoJPA persistenciaDisciplina;
	IPersistenciaDisciplinaJDBC persistenciaDisciplinaJdbc;
	
	public NegocioDisciplina(){
		persistenciaDisciplina = new PersistenciaDisciplinaDAO_JPA() ;
		persistenciaDisciplinaJdbc = new PersistenciaDisciplinaDAO_JDBC();
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
	
	public List<Disciplina> visualizarDisciplina(Disciplina disciplina){
		return (List<Disciplina>) persistenciaDisciplinaJdbc.visualizarDisciplina();
	}
}
