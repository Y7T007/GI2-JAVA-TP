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
	
	public int getCode() {
		return Code;
	}
	public String getNom() {
		return Nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	
	public void setCode(int code) {
		Code = code;
	}
	public void setNom(String nom) {
		Nom = nom;	
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public String toString() {
		return "Etudiant dont son code est "+this.Code+" nom "+this.Nom+" prenom "+this.Prenom;
	}
	
	
}
