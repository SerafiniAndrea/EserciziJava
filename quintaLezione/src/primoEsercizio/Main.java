package primoEsercizio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> rubrica = new ArrayList<ArrayList<String>>();
		ArrayList<String> persona1 = new ArrayList<String>();
		persona1.add("Andrea");
		persona1.add("Serafini");
		persona1.add("+393889326458");
		ArrayList<String> persona2 = new ArrayList<String>();
		persona2.add("Giovanni");
		persona2.add("Baldelli");
		persona2.add("+393477491325");
		rubrica.add(persona1);
		rubrica.add(persona2);
		for(ArrayList<String> contatto : rubrica) {
			System.out.println(contatto);
		}
	}
}
