//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project :  SISTEMA DE HOR�RIOS
//  @ File Name : OrganizarHorarioBean.java
//  @ Date : 13/05/2011
//  @ Author : @
//
//



package br.ufs.dsi.sistemaDeHorarios.horario.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.HorariosProfessor;
import br.ufs.dsi.sistemaDeHorarios.horario.entidade.Semestre;
import br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma;

@ManagedBean
@SessionScoped
public class OrganizarHorarioBean {
	private Disciplina disciplina = new Disciplina();
	private Semestre semestre = new Semestre();
	
	public void inserirDisciplinaOptativa(Disciplina disciplina) {
	
	}
	
	public void inserirDisciplinaObrigatoria(Disciplina disciplina) {
	
	}
	
	public void ofertaDisciplinas(Disciplina disciplina) {
	
	}
	
	public String selecionarDisciplinasEDias() 
	{
		return "sucesso";
	
	}
	
	public void visualizarPeriodo() {
	
	}
	
	public void visualizarHorarioPeriodo() {
	
	}
	
	public void visualizarDisciplinasPeriodo() {
	
	}
	
	public void visualizarDisciplinaProfessor(Disciplina disciplina) {
	
	}
	
	public void inserirHorarioProfessor(HorariosProfessor horarioProfessor) {
	
	}
	
	public void visualizarHorarioTurma(Turma turma) {
	
	}
	
	public void visualizarHorarioProfessor(HorariosProfessor horario) {
	
	}
	
	public String gravarDisciplina() {
		return "sucesso";
	
	}
	
	public void selecionarPeriodo(Semestre semestre) {
	
	}
	
	public String montarHorario() {
		return "sucesso";
	
	}
	public String voltarPagina() {
		return "sucesso";
	
	}
	
	public void editarHorariosPreferenciais() {
	
	}
	
	public void enviarHorarioProfessor() {
	
	}
	
	public void visualizarValidacoes() {
	
	}
	public String validarHorario(){
		return "sucesso";
	}
	
	public String enviarJustificativa(){
		return "sucesso";
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Semestre getSemestre() {
		return semestre;
	}
}
