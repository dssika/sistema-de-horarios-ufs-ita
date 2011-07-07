//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project :  SISTEMA DE HOR�RIOS
//  @ File Name : ManterDisciplinaBean.java
//  @ Date : 13/05/2011
//  @ Author : @
//
//



package br.ufs.dsi.sistemaDeHorarios.disciplina.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.NegocioDisciplina;

@ManagedBean
@RequestScoped
public class ManterDisciplinaBean {
	@ManagedProperty(value="#{disciplina}")
	private Disciplina disciplina;
	
	private List<Disciplina> disciplinas;
	
	
	public String confirmar(){
		return "sucesso";
	}

	public String voltarPagina(){
		return "sucesso";
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public void gravar(){
		NegocioDisciplina negocioDisciplina = new NegocioDisciplina();
		negocioDisciplina.gravar(disciplina);
	}
	
	public void editar(){
		NegocioDisciplina negocioDisciplina = new NegocioDisciplina();
		negocioDisciplina.editar(disciplina);		
	}
	
	public void excluir(){
		NegocioDisciplina negocioDisciplina = new NegocioDisciplina();
		negocioDisciplina.excluir(disciplina);		
	}
	
	public List<Disciplina> visualizarDisciplina(){
		NegocioDisciplina negocioDisciplina = new NegocioDisciplina();
		return negocioDisciplina.visualizarDisciplina(disciplina);	
	}

	public List<Disciplina> getDisciplinas() {
		return visualizarDisciplina();
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
