package it.uniroma3.diadia.ambienti;

/*La �stanza bloccata�: una delle direzioni della
stanza non pu� essere seguita a meno che
nella stanza non sia presente un oggetto con un
nome particolare (ad esempio "passepartout")*/


public class StanzaBloccata extends Stanza {
	
	public String direzioneBloccata;
	public String chiave; //attrezzo che sblocca la direzione
	
	public StanzaBloccata(String nome, String attrezzoSbloccante , String direzione) {
		super(nome);
		this.chiave = attrezzoSbloccante;
		this.direzioneBloccata= direzione;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
        if(direzione.equals(this.direzioneBloccata)&&!super.hasAttrezzo(chiave))
        	return this;
        return super.getStanzaAdiacente(direzione);
  }
	
	@Override
	public String getDescrizione() {
		return this.toString();
	}
}
