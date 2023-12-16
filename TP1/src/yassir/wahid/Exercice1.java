package yassir.wahid;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i,j;
		System.out.println("Entrez le premier nombre");
		i= scanner.nextInt();

		System.out.println("Entrez le Deuxieme nombre");
		j= scanner.nextInt();
		
		System.out.println("Somme des deux noimbres est : "+ (i+j));

		System.out.println("Produit des deux noimbres est : "+ (i*j));
	}
	
}
