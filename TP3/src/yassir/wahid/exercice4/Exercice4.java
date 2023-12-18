package yassir.wahid.exercice4;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		System.out.println("Saisissez la phrase entiere : \n");
		Scanner scanner = new Scanner(System.in);
		String Phrase = scanner.nextLine();

		System.out.println("Entrer le charactere a remplacer : \n");
		String remplacer = scanner.next();

		System.out.println("Entrer le nouveau charactere : \n");
		String nouveau = scanner.next();



		System.out.println(
				Phrase.replace(remplacer.charAt(0), nouveau.charAt(0)));

	}

}
