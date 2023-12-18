package yassir.wahid.exercice2;

public class CD extends Produit {

	String titre;
	String auteur;
	float prix;

	@Override
	public void setIdProduit(int idProduit) {
		// TODO Auto-generated method stub
		super.setIdProduit(idProduit);
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public int getIdProduit() {
		// TODO Auto-generated method stub
		return super.getIdProduit();
	}
	public String getAuteur() {
		return auteur;
	}
	public float getPrix() {
		return prix;
	}
	public String getTitre() {
		return titre;
	}

	public CD() {
	}

	public CD(int id, String titre, String auteur, float prix) {
		super.setIdProduit(id);
		this.auteur = auteur;
		this.prix = prix;
		this.titre = titre;
	}

}
