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

	IPersistenciaProfessor persistenciaProfessor;
	Professor professor;
	
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
		persistenciaProfessor = new PersistenciaProfessorDAO();
		professor = new Professor();
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

		professor.setNome("Dósea");
		professor.setMatricula(0002223344);
		professor.setTelefone("3344-5566");
		professor.setEmail("dosea@ufs.br");
		professor.setArea("Engenharia de Software");
		professor.setCoordenador('N');
		
		persistenciaProfessor.gravar(professor);
		
		Professor professorConsulta = persistenciaProfessor.visualizarDados(professor);
		
		assertEquals(professor.getNome(), professorConsulta.getNome());
		assertEquals(professor.getMatricula(), professorConsulta.getMatricula());
		assertEquals(professor.getTelefone(), professorConsulta.getTelefone());
		assertEquals(professor.getEmail(), professorConsulta.getEmail());
		assertEquals(professor.getArea(), professorConsulta.getArea());
		assertEquals(professor.getCoordenador(), professorConsulta.getCoordenador());
				
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#editar(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testEditar() {
		persistenciaProfessor.editar(professor);
		assertEquals(professor, persistenciaProfessor.visualizarDados(professor));
	}
	
	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#excluir(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testExcluir() {
		persistenciaProfessor.excluir(professor);
		assertEquals(professor, persistenciaProfessor.visualizarDados(professor));
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.professor.dados.PersistenciaProfessorDAO#visualizarDados(br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor)}.
	 */
	@Test
	public void testVisualizarDados() {
		persistenciaProfessor.visualizarDados(professor);
		Professor professorTeste = new Professor();
		assertEquals(professor.getNome(), professorTeste.getNome());
		assertEquals(professor.getMatricula(), professorTeste.getMatricula());
		assertEquals(professor.getEmail(), professorTeste.getEmail());
		assertEquals(professor.getTelefone(), professorTeste.getTelefone());
		assertEquals(professor.getArea(), professorTeste.getArea());
		assertEquals(professor.getCoordenador(), professorTeste.getCoordenador());
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
