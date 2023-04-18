package it.uniroma3.diadia.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.ComandoVai;
class ComandoVaiTest {
    Partita partita = new Partita(); 
    Stanza stanza1;
    Stanza stanza2;
    Stanza stanza3;
    ComandoVai vai;
    Labirinto labirinto = new Labirinto() ;
    
    @Before 
    void setUp() {
    	this.partita.setLabirinto(labirinto);
    	this.stanza1= new Stanza("stanza1");
        this.partita.getLabirinto().setStanzaCorrente(stanza1);
    	this.stanza1= new Stanza("stanza1");
    	this.stanza2= new Stanza("stanza2");
    	this.stanza3= new Stanza("stanza3");
    	stanza1.impostaStanzaAdiacente("nord", stanza2);
    	stanza2.impostaStanzaAdiacente("est", stanza3);
    	stanza3.impostaStanzaAdiacente("ovest", stanza2);
    	stanza2.impostaStanzaAdiacente("sud", stanza1);
    	stanza3.impostaStanzaAdiacente("ovest", stanza1);
    	stanza1.impostaStanzaAdiacente("est", stanza3);
    }
    
	@Test
	void testEsegui() {
	
	this.vai.esegui(partita);
	assertEquals(stanza1, this.partita.getLabirinto().getStanzaCorrente());
    
    
	}

	@Test
	void testSetParametro() {
		this.vai.setParametro("sud");
		assertSame("sud", this.vai.getParametro());
	}

}
