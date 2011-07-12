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
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import br.ufs.dsi.sistemaDeHorarios.disciplina.entidade.Disciplina;
import br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.INegocioDisciplina;
import br.ufs.dsi.sistemaDeHorarios.disciplina.negocio.NegocioDisciplina;

@ManagedBean
@SessionScoped
public class ManterDisciplinaBean {
	@ManagedProperty(value="#{disciplina}")
	private Disciplina disciplina;
	
	INegocioDisciplina negocioDisciplina;
	private List<Disciplina> disciplinas;
	
	public ManterDisciplinaBean(){
		negocioDisciplina = new NegocioDisciplina();
	}
	
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
		negocioDisciplina.gravar(disciplina);
	}
	
	public void editar(){
		negocioDisciplina.editar(disciplina);		
	}
	
	public void excluir(){
		negocioDisciplina.excluir(disciplina);		
	}
	
	public List<Disciplina> visualizarDisciplina(){
		disciplinas = negocioDisciplina.visualizarDisciplina();
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.getNome());
		}
		return disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return visualizarDisciplina();
	}

	
	public void mudar(ValueChangeEvent e){
		Disciplina d = (Disciplina) e.getNewValue();
		System.out.println("Setou a disciplina");
		System.out.println(disciplina.getNome());
		setDisciplina(d);
	}

}
