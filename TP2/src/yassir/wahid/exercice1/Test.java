package yassir.wahid.exercice1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
	
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant(" Nom ");
		Etudiant e3 = new Etudiant(1,"nom","prenom");
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insere les champs manquants\n \t Code :");
		e1.setCode(scanner.nextInt());
		
		System.out.println("\n\t Nom : ");
		e1.setNom(scanner.next());
	
		System.out.println("\n\t Prenom: ");
		e1.setPrenom(scanner.next());
		
		System.out.println(e1.toString());

	}
	
}
