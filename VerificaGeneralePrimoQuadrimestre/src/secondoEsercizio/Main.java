package secondoEsercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lunghezza: ");
		int L = sc.nextInt();
		int[] V = new int[L];
		for(int i = 0; i < L; i++) {
			System.out.print(i+1 + "° numero: ");
			V[i] = sc.nextInt();
		}
		for(int i = 0; i < V.length-1; i++) {
			for(int j = i+1; j < V.length; j++) {
				if(V[i] > V[j]) {
					int tmp = V[i];
					V[i] = V[j];
					V[j] = tmp;
				}
			}
		}
		for(int i = 0; i < 2; i++) {
			System.out.println(V[i]);
		}
		sc.close();
	}

}
