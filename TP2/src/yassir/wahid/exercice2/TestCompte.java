package yassir.wahid.exercice2;

public class TestCompte {
	
	public static void main(String[] args) {
		Compte c1 = new Compte();
		Compte c2 = new Compte();
		
		
		c1.deposer(500);
		
		c2.deposer(1000);
		
		c2.retirer(10);
		
		c1.virerVers(75, c2);
		
		c1.afficher();
		c2.afficher();
		
		Compte c3 = new Compte("Yassir");
		
		
	}

}
