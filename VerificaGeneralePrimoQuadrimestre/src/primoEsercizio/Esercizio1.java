package primoEsercizio;

public class Esercizio1 {

	public static void main(String[] args) {
		int[] V = {6, 3, 1, 2, 9};
		for(int i = 0; i < V.length-1; i++) {
			for(int j = i+1; j < V.length; j++) {
				if(V[i] > V[j]) {
					int temp = V[i];
					V[i] = V[j];
					V[j] = temp;
				}
			}
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(V[i]);
		}

	}

}