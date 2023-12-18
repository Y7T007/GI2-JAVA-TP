package yassir.wahid.exercice5;

import java.util.Scanner;

public class Exercice5 {
	public static void main(String[] args) {
		System.out.println("Saisissez la phrase : \n");
		Scanner scanner = new Scanner(System.in);
		String Phrase = scanner.nextLine();

		String[] words = Phrase.split(" ");

		System.out.println("le nombre de Mots est : " + words.length);
	}
}
