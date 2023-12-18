package yassir.wahid.exercice1;

import java.util.ArrayList;
import java.util.List;

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
			System.out.println(c.toString());

		}
	}

}

