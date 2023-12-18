package yassir.wahid.exercice1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		users.add(new Utilisateur(1, "yassir", 150000, "y7t007", "123456"));
		users.add(new Utilisateur(2, "Wahid", 250000, "123@", "123456"));
		users.add(new Utilisateur(3, "y7t007", 350000, "456@", "123456"));
	}

}
