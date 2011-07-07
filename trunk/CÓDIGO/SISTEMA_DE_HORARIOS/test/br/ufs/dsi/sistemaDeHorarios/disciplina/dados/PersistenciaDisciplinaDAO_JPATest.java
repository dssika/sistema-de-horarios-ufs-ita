package br.ufs.dsi.sistemaDeHorarios.disciplina.dados;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;

public class PersistenciaDisciplinaDAO_JPATest {
	IPersistenciaDisciplinaDaoJPA persistenciaDisciplina;
	static Disciplina disciplina;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		disciplina = new Disciplina();
		disciplina.setCod_disciplina(67671);
		disciplina.setNome("Engenharia de Software");
		disciplina.setCarga_horaria(6);
		disciplina.setPeriodo_disciplina(6);
		disciplina.setTipo_disciplina('A');
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		persistenciaDisciplina = new PersistenciaDisciplinaDAO_JPA();
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGravar() {
		persistenciaDisciplina.gravar(disciplina);
		
		Disciplina disciplinaConsulta = persistenciaDisciplina.visualizarDisciplina(disciplina);

		assertEquals(disciplina.getCod_disciplina(), disciplinaConsulta.getCod_disciplina());
		assertEquals(disciplina.getNome(), disciplinaConsulta.getNome());
		assertEquals(disciplina.getPeriodo_disciplina(), disciplinaConsulta.getPeriodo_disciplina());
		assertEquals(disciplina.getTipo_disciplina(), disciplinaConsulta.getTipo_disciplina());
		assertEquals(disciplina.getCarga_horaria(), disciplinaConsulta.getCarga_horaria());
	}

	@Test
	public void testEditar() {
		persistenciaDisciplina.editar(disciplina);
		assertEquals(disciplina, persistenciaDisciplina.visualizarDisciplina(disciplina));
	}

	@Test
	public void testExcluir() {
		persistenciaDisciplina.excluir(disciplina);
		assertEquals(disciplina, persistenciaDisciplina.visualizarDisciplina(disciplina));
	}

	@Test
	public void testBuscar() {
		fail("Not yet implemented");
	}

	@Test
	public void testBuscarTodos() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisualizarDisciplina() {
		fail("Not yet implemented");
	}

}
