package yassir.wahid;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		System.out.println("	hello world ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i,j;
		System.out.println("entrez le premier nombre");
		i= scanner.nextInt();

		System.out.println("entrez le Deuxieme nombre");
		j= scanner.nextInt();
		
		System.out.println("Somme des deux noimbres est : "+ (i+j));

		System.out.println("Produit des deux noimbres est : "+ (i*j));
	}
	
}
