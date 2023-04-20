package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBloccata;

class StanzaBloccataTest {

	private static final String STANZA_ADIACENTE_BLOCCATA = "stanza adiacente bloccata";
	private static final String DIREZIONE_BLOCCATA= "direzione bloccata";
	private static final String DIREZIONE_LIBERA= "direzione libera";
	private static final String STANZA_BLOCCATA= "stanza bloccata";
	private static final String STANZA_LIBERA= "stanza libera";
	private static final String STANZA_ADIACENTE_LIBERA= "stanza adiacente libera";
	private static final String CHIAVE = "chiave";
	
	private Stanza stanza_bloccata;
	private Stanza stanza_adiacente;
	
	@Before
	public void setUp() {
		this.stanza_bloccata = new StanzaBloccata(STANZA_BLOCCATA,DIREZIONE_BLOCCATA, CHIAVE);
		this.stanza_adiacente= new Stanza(STANZA_ADIACENTE_LIBERA);
		
	}
	
	
	
	@Test
	public void testGetStanzaAdiacente() {
	this.stanza_bloccata.impostaStanzaAdiacente(DIREZIONE_LIBERA, stanza_adiacente);
	assertEquals(stanza_adiacente, this.stanza_bloccata.getStanzaAdiacente(DIREZIONE_LIBERA));
		
		
	}

}
