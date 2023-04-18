package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoFine implements Comando {
	
	private String nomeComando = "fine";
	public IO io;

	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Grazie di aver giocato!");  
		
	}

	@Override
	public void setParametro(String parametro) {
		parametro = null;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando;
	}

}
