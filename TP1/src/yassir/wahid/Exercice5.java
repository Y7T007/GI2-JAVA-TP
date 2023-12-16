package yassir.wahid;

import java.util.Scanner;

public class Exercice5{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i=0;
		
		do {
			
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
					break;
				}
				case 2: {
					Exercice2 ex2 = new Exercice2();
					ex2.main(args);
					break;
				}
				case 3: {
					Exercice3 ex3 = new Exercice3();
					ex3.main(args);
					break;
				}
				case 4: {
					Exercice4 ex4 = new Exercice4();
					ex4.main(args);
					break;
				}
				case 5: {
					System.out.println( " A tres bientot !! ");
					break;
				}
				default:
					System.out.println( " A tres bientot !! ");
					
				}

			
		} while (i!=5);
	}
	
}
