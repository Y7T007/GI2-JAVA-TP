package yassir.wahid.exercice1;

import java.util.ArrayList;

public class Main {
	
	static ArrayList<Compte> Comptes = new ArrayList<>();
	
	static {
		Comptes.add(new Compte(1, 1000, "John Doe"));
		Comptes.add(new Compte(2, 2000, "Jane Smith"));
		Comptes.add(new Compte(3, 3000, "Alice Johnson"));
	}
}
