//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project :  SISTEMA DE HOR�RIOS
//  @ File Name : VisualizarHistoricoBean.java
//  @ Date : 13/05/2011
//  @ Author : @
//
//



package br.ufs.dsi.sistemaDeHorarios.turma.negocio;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.ufs.dsi.sistemaDeHorarios.turma.entidade.Turma;

@ManagedBean
@RequestScoped 
public class VisualizarHistoricoBean {
	private Turma turma = new Turma();
	private List<Turma> listaTurma;
	
	public String visualizarHistorico() {
		return "sucesso";
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public List<Turma> getListaTurma() {
		return listaTurma;
	}

	public void setListaTurma(List<Turma> listaTurma) {
		this.listaTurma = listaTurma;
	}
	
	public String finalizar(){
		return "sucesso";
	}
	
	public String editar(){
		return "sucesso";
	}
	
	public String confirmar(){
		return "sucesso";
	}
	
	public String voltarPagina(){
		return "sucesso";
	}
}
