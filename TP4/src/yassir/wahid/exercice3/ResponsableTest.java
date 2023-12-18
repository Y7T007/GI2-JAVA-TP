package yassir.wahid.exercice3;

import java.util.ArrayList;
import java.util.List;

public class ResponsableTest {

    public static void main(String[] args) {
        // Create a new instance of Responsable
        Responsable responsable = new Responsable();

        // Set values using setters
        responsable.setMatricule("123456");
        responsable.setNom("John Doe");
        responsable.setIndiceSalaire(2);

        // Create a list of inferieurs
        List<Responsable> inferieurs = new ArrayList<>();
        Responsable inferieur1 = new Responsable();
        inferieur1.setMatricule("654321");
        inferieur1.setNom("Jane Smith");
        inferieur1.setIndiceSalaire(1);
        inferieurs.add(inferieur1);

        Responsable inferieur2 = new Responsable();
        inferieur2.setMatricule("987654");
        inferieur2.setNom("Bob Johnson");
        inferieur2.setIndiceSalaire(1);
        inferieurs.add(inferieur2);

        // Set the list of inferieurs using the setter
        responsable.setInferieurs_Hierarchical(inferieurs);

        // Test the getters
        System.out.println("Matricule: " + responsable.getMatricule());
        System.out.println("Nom: " + responsable.getNom());
        System.out.println("Indice Salaire: " + responsable.getIndiceSalaire());

        // Test the afficherInferieurs method
        responsable.afficherInferieurs(1000);

        // Test the afficherTousInferieurs method
        responsable.afficherTousInferieurs(1000, 0);

        Entreprise entreprise = new Entreprise();

        // Ajout d'employés
        Employe employe1 = new Employe("Nom1", "M001", 1);
        Employe employe2 = new Employe("Nom2", "M002", 2);
        entreprise.ajouterEmploye(employe1);
        entreprise.ajouterEmploye(employe2);

        // Ajout de responsables
		Responsable responsable1 = new Responsable("Resp1", "R001", 3);
		Responsable responsable2 = new Responsable("Resp2", "R002", 4);
        Commercial commercial = new Commercial(5);
		responsable1.getInferieurs_Hierarchical().add((Responsable) employe1);
        responsable1.getInferieurs_Hierarchical().add(commercial);
		responsable2.getInferieurs_Hierarchical().add((Responsable) employe2);
        entreprise.ajouterResponsable(responsable1);
        entreprise.ajouterResponsable(responsable2);

        // Affichage du personnel
        entreprise.afficherPersonnel();

        // Calcul de la somme des salaires
        int sommeSalaires = entreprise.calculerSommeSalaires();
        System.out.println("Somme des salaires à verser : " + sommeSalaires);
    }
}