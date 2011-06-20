package br.ufs.dsi.sistemaDeHorarios.turma.negocio;

import java.util.Date;


public class NegocioTurma {
	// Construtor privado. Suprime o construtor público padra
	private static NegocioTurma instance = null;
	
	private NegocioTurma() {
    // Leitura da configuração de log. Normalmente descrita em um arquivo.
    }

    //Retorna a instância única da classe SingletonLog
    public synchronized static NegocioTurma getInstance() {
        if ( instance == null )
        	instance = new NegocioTurma();
    	return instance;
    }
	
	
	public String finalizar(){
		return "sucesso";	
	}
	
	public String editar(){
		return "sucesso";
	}
	
	public String visualizarHistorico() {
		return "sucesso";
	}
	
}
