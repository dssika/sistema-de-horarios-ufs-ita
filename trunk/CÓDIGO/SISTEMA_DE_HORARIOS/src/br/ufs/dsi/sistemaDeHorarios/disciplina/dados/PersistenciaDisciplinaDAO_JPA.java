//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project :  SISTEMA DE HOR�RIOS
//  @ File Name : PersistenciaDisciplinaDAO.java
//  @ Date : 13/05/2011
//  @ Author : @
//
//



package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;


public class PersistenciaDisciplinaDAO_JPA implements IPersistenciaDisciplinaJDBC, IPersistenciaDisciplinaDaoJPA {
	
	EntityManager manager;
	
	public PersistenciaDisciplinaDAO_JPA(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SISTEMA_DE_HORARIOS");
		manager = factory.createEntityManager();
	}
	
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplina#gravar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void gravar(Disciplina disciplina) {
		manager.getTransaction().begin();
		manager.persist(disciplina);
		manager.getTransaction().commit();
		manager.close();
	}
	
	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaDaoJPA#editar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void editar(Disciplina disciplina) {				
		Disciplina buscaDisciplina = buscar(disciplina.getCod_disciplina());
        buscaDisciplina.setNome(disciplina.getNome());
		buscaDisciplina.setCarga_horaria(disciplina.getCarga_horaria());
		buscaDisciplina.setPeriodo_disciplina(disciplina.getPeriodo_disciplina());
		buscaDisciplina.setTipo_disciplina(disciplina.getTipo_disciplina());
		}
	

	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaDaoJPA#excluir(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)
	 */
	@Override
	public void excluir(Disciplina disciplina) {
		manager.getTransaction().begin();
		Disciplina buscaDisciplina = buscar(disciplina.getCod_disciplina());
		manager.remove(buscaDisciplina);
		manager.getTransaction().commit();				
	}
	

	@Override
	public Disciplina buscar(Integer codDisciplina) {
		return manager.find(Disciplina.class, codDisciplina);
	}

	/* (non-Javadoc)
	 * @see br.ufs.dsi.sistemaDeHorarios.disciplina.dados.IPersistenciaDisciplinaDaoJPA#buscarTodos()
	 */
	@Override
	public List<Disciplina> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Disciplina> visualizarDisciplina() {		
		List<Disciplina> listarDisciplina = new ArrayList<Disciplina>();        
		try{
			Query query = manager.createNativeQuery("select * FROM tb_disciplina order by nome");
			listarDisciplina = query.getResultList();
			return listarDisciplina;
		 }  catch (Exception e) {
	         System.out.println(e + " = Erro ao buscar as disciplinas");   
	      }
		return listarDisciplina;
	}

}
