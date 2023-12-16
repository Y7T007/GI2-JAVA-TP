package yassir.wahid;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		System.out.println("	hello world ");
		
		Scanner scanner = new Scanner(System.in);
		
		
		int i;
		System.out.println("entrez le nombre de lignes du triangle : ");
		i= scanner.nextInt();
		
		for (int k = 0; k < i ; k++) {
			for (int j = 0; j <= (i-k); j++) {
				System.out.print(" ");
						
			}			
			for (int j = 0; j <= 2*k; j++) {
				System.out.print("*");
						
			}			
			for (int j = 0; j <= (i-k); j++) {
				System.out.print(" ");
						
			}			
			System.out.println("")	;
			
		}
	}
	
}
