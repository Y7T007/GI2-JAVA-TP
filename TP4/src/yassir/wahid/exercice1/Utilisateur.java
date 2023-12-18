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
		Password = password;
	}

}
