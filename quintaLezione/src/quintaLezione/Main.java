package quintaLezione;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String[][] nomi = {
				{"Andrea",     "Giovanni"},
				{"Leonardo",   "Antonio"},
				{"Alessandro", "Tommaso"}
		};
		
		ArrayList<String> cognomi = new ArrayList<String>();
		cognomi.add("Serafini");
		cognomi.add("Baldelli");
		cognomi.add("Muratori");
		cognomi.add("Piedimonte");
		cognomi.add("Glori");
		cognomi.add("Ciavaglia");
		
		for(int i = 0; i < cognomi.size(); i++) {
			System.out.println(cognomi.get(i));
		}
		
		cognomi.set(1, "Tossico");
		cognomi.remove(2);
	}

}
