package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {

	private String nomeComando = "";
	public IO io;

	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando inesistente!! Inserire comando valido \n");
		
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
