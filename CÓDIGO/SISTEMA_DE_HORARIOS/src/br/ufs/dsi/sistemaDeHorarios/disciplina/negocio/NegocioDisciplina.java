package br.ufs.dsi.sistemaDeHorarios.disciplina.negocio;

import java.util.Date;

public class NegocioDisciplina {
	// Construtor privado. Suprime o construtor público padra
	private static NegocioDisciplina instance = null;
	
	private NegocioDisciplina() {
    // Leitura da configuração de log. Normalmente descrita em um arquivo.
    }

    //Retorna a instância única da classe SingletonLog
    public synchronized static NegocioDisciplina getInstance() {
        if ( instance == null )
        	instance = new NegocioDisciplina();
    	return instance;
    }
	
	
	public void gravar() {
		
	}
	
	public void excluir() {
		
	}
	
	public void editar() {
		
	}
}
