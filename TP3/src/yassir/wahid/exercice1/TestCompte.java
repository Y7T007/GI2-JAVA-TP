package yassir.wahid.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestCompte {

	public static void main(String[] args) {

		ArrayList<Compte> comptes = new ArrayList<>();
		comptes.add(new Compte(1, 1000, "John Doe"));
		comptes.add(new Compte(2, 2000, "Jane Smith"));
		comptes.add(new Compte(3, 3000, "Alice Johnson"));
		
		for (Compte compte : comptes) {
			System.out.println(compte.toString());
		}

		List<Compte> comptos = new ArrayList<>();
		comptos.add(new Compte(1, 85000, "John Doe"));
		comptos.add(new Compte(2, 62000, "Wahid"));
		comptos.add(new Compte(3, 873000, "Yassir"));

		for (Compte compte : comptos) {
			System.out.println(compte.toString());
		}

		comptes.addAll(comptos);
		System.out.println("\n\tmerged tables\n");
		for (Compte c : comptes) {
			if (c.getSolde() > 10000) {
				System.out.println(c.toString());
			} else {
				System.out.println("no enough solde");
			}
		}

		System.out.print("_______________MENU_________________"
				+ "\n|\t1) Ajouter un compte."
				+ "\n|\t2) Afficher tous les comptes. "
				+ "\n|\t3) Afficher les comptes avec le solde plus de 10000"
				+ "\n|\t4) Quitter le programme. "
				+ "\n|___________________________________"
				+ "\n\n\t\tVotre Choix :  ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		do {
			switch (i) {
				// all the cases goes here for the menu

			}

		} while (i != 4);

	}

}
