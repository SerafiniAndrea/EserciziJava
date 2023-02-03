package secondaLezione;

//Importare classe Scanner
import java.util.Scanner;

//Classe principale
public class Main {
	
	//Metodo principale obbligatorio "main"
	public static void main(String[] args) {
		
		//Creare oggetto Scanner per gli Input
		Scanner scanner = new Scanner(System.in);
		
		//Inserire Nome
		System.out.print("Nome: ");
		String nome = scanner.nextLine();

		//Inserire Cognome
		System.out.print("Cognome: ");
		String cognome = scanner.nextLine();
		
		//Inserire Età
		System.out.print("Eta: ");
		int eta = scanner.nextInt();
		scanner.nextLine();
		
		//Inserire Comune
		System.out.print("Comune: ");
		String comune = scanner.nextLine();
		
		//Stampare il risultato
		System.out.println("L'alunno si chiama " + nome + " " + cognome);
		System.out.println("Ha " + eta + " anni");
		System.out.println("Vive a " + comune);
		
		//Chiudere oggetto Scanner
		scanner.close();
	}

}
