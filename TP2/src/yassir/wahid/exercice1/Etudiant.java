package yassir.wahid.exercice1;

public class Etudiant {
	
	public int Code;
	public String Nom;
	public String Prenom;

	public Etudiant() {
		
	}
	
	public Etudiant(String Nom) {
		this.Nom = Nom;
	}
	
	public Etudiant(int Code, String Nom, String Prenom) {
		this.Code= Code;
		this.Nom= Nom;
		this.Prenom= Prenom;
	}
	
	public Etudiant(Etudiant E_copie) {
		this.Code = E_copie.Code;
		this.Nom = E_copie.Nom;
		this.Prenom = E_copie.Prenom;
	}
	
}
