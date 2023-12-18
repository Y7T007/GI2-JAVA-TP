package yassir.wahid.exercice3;

public class Employe {
	String nom;
	String matricule;
	int indiceSalaire;
	int salaire;

	public int getIndiceSalaire() {
		return indiceSalaire;
	}
	public String getMatricule() {
		return matricule;
	}
	public String getNom() {
		return nom;
	}
	public int getSalaire() {
		return salaire;
	}

	public void setIndiceSalaire(int indiceSalaire) {
		this.indiceSalaire = indiceSalaire;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	public Employe() {
	}
	public Employe(String nom, String matricule, int indiceSalaire) {
	}
	public void Salaire(int salaire) {
		this.salaire = salaire * this.indiceSalaire;
	}

	public String Print(int Salaire) {
		return (
				" \n Nom : " + this.nom + "\n Matricule : " + this.matricule
						+ "\n Salaire : " + (this.indiceSalaire * Salaire));
	}

}
