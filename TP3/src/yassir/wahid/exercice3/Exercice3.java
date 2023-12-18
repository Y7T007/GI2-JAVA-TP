package yassir.wahid.exercice3;

import java.util.Scanner;

public class Exercice3 {
	public static void main(String[] args) {

		System.out.println("Saisissez votre phrase en miniscule : ");
		Scanner scanner = new Scanner(System.in);
		String pMiniscule = scanner.nextLine();

		String pMaj = (pMiniscule.charAt(0) + "").toUpperCase()
				+ pMiniscule.substring(1, pMiniscule.length());

		System.out.println(pMaj);

	}

}
