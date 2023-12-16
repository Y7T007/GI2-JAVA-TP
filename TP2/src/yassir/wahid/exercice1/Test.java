package yassir.wahid.exercice1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws Exception {
	
		
//		Question 5-a :
		
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant(" Nom ");
		Etudiant e3 = new Etudiant(1,"nom","prenom");
		

//		Question 5-2 :
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insere les champs manquants de l'etudiant 1 : \n \t Code :");
		e1.setCode(scanner.nextInt());
		
		System.out.println("\n\t Nom : ");
		e1.setNom(scanner.next());
	
		System.out.println("\n\t Prenom: ");
		e1.setPrenom(scanner.next());
		
		System.out.println(e1.toString());
		
		System.out.println("\n\nInserez les champs manquants de l'etudiant 2 : \n \t Code :");
		e2.setCode(scanner.nextInt());
		
		System.out.println("\n\t Prenom: ");
		e2.setPrenom(scanner.next());
		
		System.out.println(e2.toString());
		

//		Question 5-c :
		Etudiant e4 = new Etudiant(e2);
		System.out.println(e4.toString());
		
		

	}
	
}
