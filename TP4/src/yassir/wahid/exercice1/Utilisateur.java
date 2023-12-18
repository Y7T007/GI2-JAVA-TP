package yassir.wahid.exercice1;

public class Utilisateur extends Personne {

	String login;
	String Password;

	// getters

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}
	@Override
	public int getSalaire() {
		// TODO Auto-generated method stub
		return super.getSalaire();
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return Password;
	}

	// setters
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}
	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}
	@Override
	public void setSalaire(int salaire) {
		// TODO Auto-generated method stub
		super.setSalaire(salaire);
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.Password = password;
	}

	// constructor par default
	public Utilisateur() {
	}

	// constructor par initialisation
	public Utilisateur(int id, String nom, int salaire, String login,String Password) {
		super.setId(id);
		super.setNom(nom);
		super.setSalaire(salaire);
		this.login = login;
		this.Password = Password;
	}
	public Utilisateur(Utilisateur U) {
		super.setId(U.getId());
		super.setNom(U.getNom());;
		super.setSalaire(U.getSalaire());
		this.login = U.getLogin();
		this.Password = U.getPassword();

	}

}
