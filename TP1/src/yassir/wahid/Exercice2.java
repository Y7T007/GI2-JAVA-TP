package yassir.wahid;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {
		System.out.println("	hello world ");
		
		try (Scanner scanner = new Scanner(System.in)) {
			int Cote_Carree;
			System.out.println("entrez la longueur du cote d'un carree ");
			Cote_Carree= scanner.nextInt();

			
			System.out.println("la surface du carre est : "+ (Cote_Carree*Cote_Carree));

		}
	}
	
}
