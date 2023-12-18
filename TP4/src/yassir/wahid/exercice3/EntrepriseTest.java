package yassir.wahid.exercice3;
// Test the calculerSommeSalaires method
public class EntrepriseTest {
	public static void main(String[] args) {
		// Create a new instance of Entreprise
		Entreprise entreprise = new Entreprise();

		// Create some employees
		Employe employe1 = new Employe("Nom1", "M001", 1000);
		Employe employe2 = new Employe("Nom2", "M002", 2000);
		Employe employe3 = new Employe("Nom3", "M003", 3000);

		// Add the employees to the entreprise
		entreprise.ajouterEmploye(employe1);
		entreprise.ajouterEmploye(employe2);
		entreprise.ajouterEmploye(employe3);

		// Calculate the expected sum of salaries
		int expectedSum = employe1.getSalaire() + employe2.getSalaire()
				+ employe3.getSalaire();

		// Call the calculerSommeSalaires method
		int actualSum = entreprise.calculerSommeSalaires();

		// Assert that the actual sum is equal to the expected sum
		assertEquals(expectedSum, actualSum);

	}

	private static void assertEquals(int expectedSum, int actualSum) {
		// TODO Auto-generated method stub

	}

}