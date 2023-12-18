package yassir.wahid.exercice1;

public class Personne {
	int id;
	String nom;
	int Salaire;

	public int getId() {
		return id;
	}
	public String getNom() {
		return nom;
	}
	public int getSalaire() {
		return Salaire;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setSalaire(int salaire) {
		Salaire = salaire;
	}

	// constructeur par default

	public Personne() {
	}

	// constructeur par initialization

	public Personne(int id, String nom, int Salaire) {
		this.id = id;
		this.nom = nom;
		this.Salaire = Salaire;
	}

	// constructeur par copie

	public Personne(Personne P) {
		this.id = P.id;
		this.nom = P.nom;
		this.Salaire = P.Salaire;
	}

}
