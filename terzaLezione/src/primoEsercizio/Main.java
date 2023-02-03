package primoEsercizio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] alunno1 = new String[4];
		String[] alunno2 = new String[4];
		
		for(int i = 0; i < alunno1.length; i++) {
			alunno1[i] = scanner.nextLine();
		}
		for(int i = 0; i < alunno2.length; i++) {
			alunno2[i] = scanner.nextLine();
		}
		
		for(String alunno : (Integer.valueOf(alunno1[2]) < Integer.valueOf(alunno2[2]) ? alunno1 : alunno2)) {
			System.out.println(alunno);
		}
		for(String alunno : (alunno1[2].compareTo(alunno2[2]) > 0 ? alunno1 : alunno2)) {
			System.out.println(alunno);
		}
		
		scanner.close();
	}

}
