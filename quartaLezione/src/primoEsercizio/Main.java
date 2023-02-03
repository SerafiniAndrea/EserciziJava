package primoEsercizio;

public class Main {
	
	public static void main(String[] args) {
		String[][] matrice = new String[2][2];
		matrice[0][0] = "zero";
		matrice[0][1] = "uno";
		matrice[1][0] = "due";
		matrice[1][1] = "tre";
		System.out.println(matrice.length);
		for(int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice.length; j++) {
				System.out.println(matrice[i][j]);
			}
		}
	}

}
