//Specifica del package di cui fa parte il file a cui si sta lavorando
package secondoEsercizio;

//Importazione della libreria per l'utilizzo delle ArrayList
import java.util.ArrayList;
import java.util.Scanner;

//Dichiarazione della classe principale "Main"
public class Main {
	
	//Dichiarazione del metodo principale "static void main"
	public static void main(String[] args) {
		
		//Creazione della "matrice" rubrica
		ArrayList<ArrayList<String>> rubrica = new ArrayList<ArrayList<String>>();
		
		//Creazione ogetto "sc" di tipo "Scanner"
		Scanner sc = new Scanner(System.in);
		
		//Inserimento del numero di contatti che occuperanno la rubrica
		System.out.print("Quanti contatti inseririe nella rubrica: ");
		//Variabile contentente il numero di contatti che occuperanno la rubrica
		int contatti = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		//Riempimento della rubrica
		fill(rubrica, sc, contatti);
		
		//Ordinamento dei contatti della rubrica per cognome
		sort(rubrica);
		
		//Stampa(output) della rubrica intera
		print(rubrica);
		
		//Chiusura/conclusione della vita dell'oggetto scanner
		sc.close();
	}
	
	
	//Funzione per il riempimento della rubrica
	static void fill(ArrayList<ArrayList<String>> rubrica, Scanner sc, int contatti) {
		
		//Array contente i dati che verrano assegnato ad ogni singolo contatto della rubrica
		String[] dati = {"Nome: ", "Cognome: ", "Numero: ", "E-mail: "};
		
		//Ciclo per l'inserimento di ogni singolo contatto della rubrica
		for(int i = 0; i < contatti; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			
			//Ciclo per l'inserimento uno ad uno dei dati di ogni singolo contatto della rubrica
			for(int j = 0; j < 4; j++) {
				
				//Stampa del nome del dato del contatto che si sta andando ad inserire
				System.out.print(dati[j]);
				
				//Inserimento del dato del contatto
				tmp.add(j, sc.nextLine());
			}
			
			//Aggiunta del contatto creato alla rubrica
			rubrica.add(tmp);
			System.out.println();
		}
	}
	
	
	//Funzione per l'ordinamento dei contatti della rubrica per cognome
	static void sort(ArrayList<ArrayList<String>> rubrica) {
		
		//Doppio ciclo for("i" e "j") per l'ordinamento dei contatti della rubrica per cognome
		for(int i = 0; i < rubrica.size()-1; i++) {
			for(int j = i+1; j < rubrica.size(); j++) {
				
				//Condizione su cui si basa l'ordinamento dei contatti della rubrica
				if(rubrica.get(i).get(1).compareTo(rubrica.get(j).get(1)) > 0) {
					
					//Scambio tra due contatti della rubrica
					ArrayList<String> tmp = rubrica.get(i);
					rubrica.set(i, rubrica.get(j));
					rubrica.set(j, tmp);
				}
			}
		}
	}
	
	
	//Funzione per la stampa/output della rubrica
	static void print(ArrayList<ArrayList<String>> rubrica) {
		
		//Ciclo per la stampa di ogni contatto della rubrica uno ad uno con tutti i suoi dati
		for(ArrayList<String> contatto : rubrica) {
			
			//Stampa del contatto
			System.out.println(contatto);
		}
	}
}
