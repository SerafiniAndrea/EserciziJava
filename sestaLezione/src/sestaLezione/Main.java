package sestaLezione;

public class Main {
	
	public static void main(String[] args) {
		faiColazione("tumadre");
		faiColazione("tusorella");
		
		int somma1 = somma(1661, 819);
		System.out.println(somma1);
		int somma2 = somma(somma(1, 2), somma(3, 4));
		System.out.println(somma2);
		int somma3 = somma(5, 8, 4);
		System.out.println(somma3);
		double somma4 = somma(5.8, 3.4);
		System.out.println(somma4);
	}
	
	static void faiColazione(String colazione) {
		System.out.println("Oggi faccio colazione con " + colazione);
	}
	
	static int somma(int x, int y) {
		int risultato = x + y;
		return risultato;
	}
	
	static int somma(int x, int y, int z) {
		int risultato = x + y + z;
		return risultato;
	}
	
	static double somma(double x, double y) {
		double risultato = x + y;
		return risultato;
	}

}
