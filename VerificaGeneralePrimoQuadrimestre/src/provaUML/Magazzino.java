package provaUML;

import java.util.List;

public class Magazzino {
	
	public List<Prodotto> prodotti;
	public List<Cliente> clienti;
	
	public Magazzino() {
		
	}
	public void estrazione(Prodotto p, Cliente c) {
		this.prodotti.remove(p);
	}
	public void emissione(Prodotto p) {
		if(p.livelloScorta < 2) {
			
		}
	}
}
