package yassir.wahid.exercice3;

import java.util.ArrayList;
import java.util.List;

public class Responsable extends Employe{

	List<Responsable> inferieurs_Hierarchical = new ArrayList<Responsable>();

	public List<Responsable> getInferieurs_Hierarchical() {
		return inferieurs_Hierarchical;
	}
	@Override
	public int getIndiceSalaire() {
		return super.getIndiceSalaire();
	}
	@Override
	public String getMatricule() {
		return super.getMatricule();
	}
	@Override
	public String getNom() {
		return super.getNom();
	}

	@Override
	public void setIndiceSalaire(int indiceSalaire) {
		super.setIndiceSalaire(indiceSalaire);
	}
	@Override
	public void setMatricule(String matricule) {
		super.setMatricule(matricule);
	}
	@Override
	public void setNom(String nom) {
		super.setNom(nom);
	}
	public void setInferieurs_Hierarchical(
			List<Responsable> inferieurs_Hierarchical) {
		this.inferieurs_Hierarchical = inferieurs_Hierarchical;
	}

	public Responsable() {
		
	}
	public Responsable(String matricule, String nom, int indiceSalaire) {
		super(matricule, nom, indiceSalaire);
	}

	public void afficherInferieurs(int Salaire) {
		System.out.println(
				" \n Nom : " + super.nom + "\n Matricule : " + super.matricule
						+ "\n Salaire : " + (super.indiceSalaire * Salaire)
						+"Ses inferieurs : ");
		for(Responsable r : this.inferieurs_Hierarchical) {
			System.out.println("\t -" + r.Print(Salaire));

		}

	}

	public void afficherTousInferieurs(int Salaire, int depth) {

		System.out.println(
				"Nom : " + super.nom + ", Matricule : " + super.matricule
						+ ", Salaire : " + (super.indiceSalaire * Salaire)
						+ "\n" + "\t".repeat(depth) + "Ses inferieurs :");
		for (Responsable r : this.inferieurs_Hierarchical) {
			depth++;
			System.out.print("\n+" + "\t".repeat(depth) + "-");
			r.afficherTousInferieurs(Salaire, depth);
		}

	}


}
