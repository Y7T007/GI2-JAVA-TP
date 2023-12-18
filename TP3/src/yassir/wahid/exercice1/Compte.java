package yassir.wahid.exercice1;


public class Compte {
	int numCompte;
	int solde;
	String proprietaire;

	public int getNumCompte() {
		return numCompte;
	}
	public String getProprietaire() {
		return proprietaire;
	}
	public int getSolde() {
		return solde;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}

	// constructor par default

	public Compte() {
	}

	// Constructor par initialization

	public Compte(int numCompte, int solde, String proprietaire) {
		this.numCompte = numCompte;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}

	public String toString() {
		return "Compte(" + numCompte +" : "+solde+") de :("+proprietaire+")";
	}

}
