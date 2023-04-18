package it.uniroma3.diadia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {

	
	Stanza s=new Stanza("stanza");
	Attrezzo r=new Attrezzo("osso",2);
	
	
	@Test
	public void getStanzaAdiacentTest() {
	assertNull(s.getStanzaAdiacente("Nord"));
	}
		
	@Test
	public void testAddAttrezzo() {
		assertTrue(s.addAttrezzo(r));
	}
	
	@Test
	public void testPesoAttrezziStanzaCorrente() {
		s.addAttrezzo(r);
		assertEquals(2, s.getAttrezzo(r.getNome()).getPeso());
	}
	
}
