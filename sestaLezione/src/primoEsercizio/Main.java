package primoEsercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] array = create();
		sort(array);
		print(array);
	}
	
	static void sort(int[] array) {
		for(int i = 0; i < array.length-1; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] < array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}
	static int[] create() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Size: ");
		int size = scanner.nextInt();
		int[] A = new int[size];
		for(int i = 0; i < size; i++) {
			System.out.print((i+1) + "° number: ");
			A[i] = scanner.nextInt();
		}
		scanner.close();
		return A;
	}
	static void print(int[] array) {
		for(int number : array) {
			System.out.println(number);
		}
	}
}
