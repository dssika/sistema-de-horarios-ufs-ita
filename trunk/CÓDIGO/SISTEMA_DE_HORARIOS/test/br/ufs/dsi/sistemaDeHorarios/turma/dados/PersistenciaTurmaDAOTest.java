/**
 * 
 */
package br.ufs.dsi.sistemaDeHorarios.turma.dados;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.professor.entidade.Professor;
import br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma;

/**
 * @author Igor Peterson
 *
 */
public class PersistenciaTurmaDAOTest {

	IPersistenciaTurma persistenciaTurma;
	Turma turma, turmaTeste;
	
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
		persistenciaTurma = new PersistenciaTurmaDAO();
		turma = new Turma();
		turmaTeste = new Turma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.turma.dados.PersistenciaTurmaDAO#visualizarHistorico(br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma)}.
	 */
	@Test
	public void testVisualizarHistorico() {
		persistenciaTurma.visualizarHistorico(turma);
		assertEquals(turma.getId_turma(), turmaTeste.getId_turma());
		assertEquals(turma.getProfessor(), turmaTeste.getProfessor());
		assertEquals(turma.getDisciplina(), turmaTeste.getDisciplina());
		assertEquals(turma.getTotal_aprovados(), turmaTeste.getTotal_aprovados());
		assertEquals(turma.getTotal_reprovados_falta(), turmaTeste.getTotal_reprovados_falta());
		assertEquals(turma.getTotal_reprovados_media(), turmaTeste.getTotal_reprovados_media());
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.turma.dados.PersistenciaTurmaDAO#gravarHorarioTurma(br.ufs.dsi.sistemaDeHorarios.horario.entidade.Horarios)}.
	 */
	@Test
	public void testGravarHorarioTurma() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.turma.dados.PersistenciaTurmaDAO#enviarDados(br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma)}.
	 */
	@Test
	public void testEnviarDados() {
		Professor professor = new Professor();
		Disciplina disciplina = new Disciplina();
		
		turma.setProfessor(professor);
		turma.setQuantidade_aluno(6);
		turma.setDisciplina(disciplina);
		turma.setTotal_aprovados(5);
		turma.setTotal_reprovados_falta(1);
		turma.setTotal_reprovados_media(0);
		
		persistenciaTurma.enviarDados(turma);
		
		assertEquals(turma.getId_turma(), turmaTeste.getId_turma());
		assertEquals(turma.getProfessor(), turmaTeste.getProfessor());
		assertEquals(turma.getDisciplina(), turmaTeste.getDisciplina());
		assertEquals(turma.getQuantidade_aluno(), turmaTeste.getQuantidade_aluno());
		assertEquals(turma.getTotal_aprovados(), turmaTeste.getTotal_aprovados());
		assertEquals(turma.getTotal_reprovados_falta(), turmaTeste.getTotal_reprovados_falta());
		assertEquals(turma.getTotal_reprovados_media(), turmaTeste.getTotal_reprovados_media());
	}

}
