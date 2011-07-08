package br.ufs.dsi.sistemaDeHorarios.professor.negocio;


import br.ufs.dsi.sistemaDeHorarios.professor.dados.IPersistenciaProfessor;
import br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO;
import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

public class NegocioProfessor implements INegocioProfessor {
	IPersistenciaProfessor persistenciaProfessor;
	
	public NegocioProfessor(){
		persistenciaProfessor = new PersistenciaProfessorDAO();
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.professor.negocio.INegocioProfessor#gravar(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)
	 */
	@Override
	public void gravar(Professor professor) {
		persistenciaProfessor.gravar(professor);
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.professor.negocio.INegocioProfessor#editar(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)
	 */
	@Override
	public void editar(Professor professor) {
		persistenciaProfessor.editar(professor);
	}

	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.professor.negocio.INegocioProfessor#excluir(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)
	 */
	@Override
	public void excluir(Professor professor) {
		persistenciaProfessor.excluir(professor);
	}
	
	
}
