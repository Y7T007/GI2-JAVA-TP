package yassir.wahid.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
	List<Employe> personnel = new ArrayList<>();

	public void ajouterEmploye(Employe employe) {
		personnel.add(employe);
	}

	public void ajouterResponsable(Responsable responsable) {
		personnel.add(responsable);
	}

	public int calculerSommeSalaires() {
		int sommeSalaires = 0;
		for (Employe e : personnel) {
			sommeSalaires += e.getSalaire();
		}
		return sommeSalaires;
	}

	public void afficherPersonnel() {
		System.out.println("Personnel de l'entreprise :");
		for (Employe e : personnel) {
			if (e instanceof Responsable) {
				((Responsable) e).afficherTousInferieurs(e.getSalaire(), 0);
			} else {
				System.out.println(e.Print(e.getSalaire()));
			}
		}
	}
}
