package provaUML;

public class Main {
	
	public static void main(String[] args) {
		Magazzino magazzino = new Magazzino();
		Prodotto prodotto = new Prodotto("fornitore", 1);
		magazzino.prodotti.add(prodotto);
		Cliente cliente = new Cliente();
		magazzino.clienti.add(cliente);
		magazzino.prodotti.get(0).controllo();
		magazzino.estrazione(magazzino.prodotti.get(0), magazzino.clienti.get(0));
		magazzino.emissione(magazzino.prodotti.get(0));
	}

}
