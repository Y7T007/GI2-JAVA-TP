package yassir.wahid.exercice2;

public class Compte {
  int solde = 0;
  String Nom = "";

  Compte(String Nom) {
    this.Nom = Nom;
  }

  Compte() {}

  void deposer(int montant) {
    solde = solde + montant;
  }

  void retirer(int montant) {
    solde = solde - montant;
  }
  

  void virerVers(int montant, Compte destination) {
		if (this.solde >= montant) {
			this.retirer(montant);
			destination.deposer(montant);
		}
  }

  void afficher() {
    System.out.println("solde : " + solde + ", Nom : " + Nom);
  }
}
