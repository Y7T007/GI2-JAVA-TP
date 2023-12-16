package yassir.wahid;

import java.util.Iterator;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		System.out.println("	hello world ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i;
		System.out.println("entrez le nombre pour calculer son factorielle : ");
		i= scanner.nextInt();
		
		int fact=1;
		for (int j = 1; j <= i	; j++) {
			fact=fact*j;
		}
		
		System.out.println("Le factorielle est : "+ fact);
	}
	
}
