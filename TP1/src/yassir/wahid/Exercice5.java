package yassir.wahid;

import java.util.Scanner;

public class Exercice5{

	public static void main(String[] args) {
		System.out.println("	hello world ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i,j;
		System.out.println(""
				+ "\n\t---------- MENU --------------"
				+ "\n\t|  1)Somme de deux entiers. "
				+ "\n\t|  2)Surface d'un carre. "
				+ "\n\t|  3)Factorielle d'un nombre. "
				+ "\n\t|  4)Dissiner un triangle. "
				+ "\n\t|  5)Quitter le programme . "
				+ "\n\n\t\t Votre Choix :");
		
		i= scanner.nextInt();
		switch (i) {
		case 1: {
			Exercice1 ex1 = new Exercice1();
			ex1.main(args);
		}
		case 2: {
			Exercice2 ex2 = new Exercice2();
			ex2.main(args);
		}
		case 3: {
			Exercice3 ex3 = new Exercice3();
			ex3.main(args);
		}
		case 4: {
			Exercice4 ex4 = new Exercice4();
			ex4.main(args);
		}
		case 5: {
			System.out.println( " A tres bientot !! ");
			break;
		}
		default:
			System.out.println( " A tres bientot !! ");
			
		}

		System.out.println("entrez le Deuxieme nombre");
		j= scanner.nextInt();
		
		System.out.println("Somme des deux noimbres est : "+ (i+j));
		
		

		System.out.println("Produit des deux noimbres est : "+ (i*j));
	}
	
}
