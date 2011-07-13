/**
 * 
 */
package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

/**
 * @author Igor Peterson
 *
 */

public class PersistenciaDisciplinaDAOTest {

	IPersistenciaDisciplinaJDBC persistenciaDisciplina;
	static Disciplina disciplina;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		disciplina = new Disciplina();
		disciplina.setNome("Engenharia de Software 2");
		disciplina.setCod_disciplina(01221);
		disciplina.setCarga_horaria(4);
		disciplina.setPeriodo_disciplina(6);
		disciplina.setTipo_disciplina('A');
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
		persistenciaDisciplina = new PersistenciaDisciplinaDAO_JDBC();
		disciplina = new Disciplina();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC#gravar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)}.
	 */
	@Test
	public void testGravar() {
				
		persistenciaDisciplina.gravar(disciplina);
		
		Disciplina disciplinaConsulta = persistenciaDisciplina.buscar(disciplina);
		
		assertEquals(disciplinaConsulta.getNome(), disciplina.getNome());
		assertEquals(disciplinaConsulta.getCod_disciplina(), disciplina.getCod_disciplina());
		assertEquals(disciplinaConsulta.getCarga_horaria(), disciplina.getCarga_horaria());
		assertEquals(disciplinaConsulta.getPeriodo_disciplina(), disciplina.getPeriodo_disciplina());
		assertEquals(disciplinaConsulta.getTipo_disciplina(), disciplina.getTipo_disciplina());
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC#editar(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)}.
	 */
	@Test
	public void testEditar() {
		persistenciaDisciplina.editar(disciplina);
		assertEquals(disciplina, persistenciaDisciplina.buscar(disciplina));
	}

	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC#excluir(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)}.
	 */
	@Test
	public void testExcluir() {
		persistenciaDisciplina.excluir(disciplina);
		assertEquals(disciplina, persistenciaDisciplina.buscar(disciplina));
	}


	/**
	 * Test method for {@link br.ufs.dsi.sistemaDeHorarios.disciplina.dados.PersistenciaDisciplinaDAO_JDBC#visualizarDados(br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina)}.
	 */
	@Test
	public void testVisualizarDados() {
		persistenciaDisciplina.buscar(disciplina);
		Disciplina disciplinaTeste = new Disciplina();
		assertEquals(disciplina.getNome(), disciplinaTeste.getNome());
		assertEquals(disciplina.getCarga_horaria(), disciplinaTeste.getCarga_horaria());
		assertEquals(disciplina.getCod_disciplina(), disciplinaTeste.getCod_disciplina());
		assertEquals(disciplina.getPeriodo_disciplina(), disciplinaTeste.getPeriodo_disciplina());
		assertEquals(disciplina.getTipo_disciplina(), disciplinaTeste.getTipo_disciplina());
	}

}
