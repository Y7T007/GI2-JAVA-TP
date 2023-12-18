package yassir.wahid.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		users.add(new Utilisateur(1, "yassir", 150000, "y7t007", "123456"));
		users.add(new Utilisateur(2, "Wahid", 250000, "123@", "123456"));
		users.add(new Utilisateur(3, "y7t007", 350000, "456@", "123456"));

		int loggedIn = -1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Insert your login infos : \n\n\t Email : ");
			String email = scanner.next();
			System.out.print("\t Password : ");
			String password = scanner.next();

			for (Utilisateur u : users) {
				if (u.login.equals(email) && u.Password.equals(password)) {
					System.out.print("\nLogged in successfully :) ");
					loggedIn = u.id;
					break;
				}
			}
			if (loggedIn == -1) {
				System.out.println("\nEchec d'authentification :( ");
				continue;
			}
		} while (loggedIn == -1);


	}

}
