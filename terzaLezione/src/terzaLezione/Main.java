package terzaLezione;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		//Utilizzo operatore ternario
		@SuppressWarnings("unused")
		int z = (x > y) ? x : y;
		
		int[] numeri = {1, 3, 7, 100, 3};
		for(int i = 0; i < numeri.length; i++) {
			System.out.println(numeri[i]);
		}
		for(int numero : numeri) {
			System.out.println(numero);
		}
	}
}
