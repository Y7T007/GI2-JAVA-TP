package yassir.wahid.exercice1;

public class Utilisateur extends Personne {

	String login;
	String Password;

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
}
