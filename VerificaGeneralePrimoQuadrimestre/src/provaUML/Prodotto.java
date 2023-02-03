package provaUML;

public class Prodotto {
	
	public String fornitore;
	public double livelloScorta;
	
	public Prodotto(String fornitore, double livelloScorta){
		this.livelloScorta = livelloScorta;
	}
	
	public void controllo() {
		System.out.println("Livello di Scorta: " + livelloScorta);
	}
}
