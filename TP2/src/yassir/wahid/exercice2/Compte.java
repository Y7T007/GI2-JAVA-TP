package yassir.wahid.exercice2;

public class Compte {

		int solde=0 ;
		String Nom;
		
		void deposer(int montant){
		solde =solde+montant ;
		}
		void retirer (int montant){
		solde=solde-montant ;
		}
		void virerVers(int montant, Compte destination){
		this.retirer(montant) ;
		destination.deposer(montant) ;
		}
		
		void afficher(){
		System.out.println("solde : "+solde+", Nom : "+Nom) ; 
		}
		
}
