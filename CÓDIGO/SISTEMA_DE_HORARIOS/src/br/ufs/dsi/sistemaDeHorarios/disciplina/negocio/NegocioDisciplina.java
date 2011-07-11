package br.ufs.dsi.sistemaDeHorarios.disciplina.negocio;

import java.util.List;

import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaDaoJPA;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaJDBC;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC;
import br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JPA;
import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public class NegocioDisciplina implements INegocioDisciplina {
	
	IPersistenciaDisciplinaDaoJPA persistenciaDisciplina;
	IPersistenciaDisciplinaJDBC persistenciaDisciplinaJdbc;
	
	public NegocioDisciplina(){
		persistenciaDisciplina = new PersistenciaDisciplinaDAO_JPA() ;
		//persistenciaDisciplinaJdbc = new PersistenciaDisciplinaDAO_JDBC();
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.INegocioDisciplina#gravar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void gravar(Disciplina disciplina) {
		persistenciaDisciplina.gravar(disciplina);
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.INegocioDisciplina#excluir(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void excluir(Disciplina disciplina) {
		persistenciaDisciplina.excluir(disciplina);
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.INegocioDisciplina#editar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void editar(Disciplina disciplina) {
		persistenciaDisciplina.editar(disciplina);
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.INegocioDisciplina#visualizarDisciplina(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public List<Disciplina> visualizarDisciplina(){
		return (List<Disciplina>) persistenciaDisciplina.visualizarDisciplina();
	}
}
