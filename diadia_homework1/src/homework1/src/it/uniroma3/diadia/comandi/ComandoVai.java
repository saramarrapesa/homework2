package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;




public class ComandoVai implements Comando {

	private String direzione;
	private String nomeComando = "vai";
	public IO io;
	
	
	@Override
	public void esegui(Partita partita) {
		Stanza prossimaStanza = null;
		prossimaStanza = partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			io.mostraMessaggio("Direzione inesistente \n");
		else {	
			partita.getLabirinto().setStanzaCorrente(prossimaStanza);
			int cfu = partita.getGiocatore().getCfu();
			partita.getGiocatore().setCfu(cfu--);
		}
		
	}

	@Override
	public void setParametro(String parametro) {
		this.direzione=parametro;
		
	}
	
	public String getParametro() {
		return this.direzione;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando;
	}

}
