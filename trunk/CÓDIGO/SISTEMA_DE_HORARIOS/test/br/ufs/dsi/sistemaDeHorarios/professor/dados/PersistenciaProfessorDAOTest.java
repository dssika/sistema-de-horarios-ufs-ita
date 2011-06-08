/**
 * 
 */
package br.ufs.dsi.sistemaDeHorarios.professor.dados;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;

/**
 * @author Igor Peterson
 *
 */
public class PersistenciaProfessorDAOTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#gravar(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testGravar() {
		IPersistenciaProfessor persistenciaProfessor = new PersistenciaProfessorDAO();
		
		Professor professor = new Professor();
		professor.setArea("Engenharia de Softeare");
		persistenciaProfessor.gravar(professor);
		
		Professor professorConsulta = persistenciaProfessor.visualizarDados(professor);
		
		assertEquals(professor.getNome(), professorConsulta.getNome());
		
		
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#excluir(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testExcluir() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#visualizarDados(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testVisualizarDados() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#gravarHorariosPreferenciais(br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor)}.
	 */
	@Test
	public void testGravarHorariosPreferenciais() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#gravarDisciplinasPreferenciais(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)}.
	 */
	@Test
	public void testGravarDisciplinasPreferenciais() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#gravarValidacao(br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor)}.
	 */
	@Test
	public void testGravarValidacao() {
		fail("Not yet implemented");
	}

}
