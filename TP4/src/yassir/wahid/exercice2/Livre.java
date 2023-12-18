package yassir.wahid.exercice2;

public class Livre extends Produit {

	String titre;
	String auteur;
	String ISBN;

	@Override
	public int getIdProduit() {
		// TODO Auto-generated method stub
		return super.getIdProduit();
	}
	public String getAuteur() {
		return auteur;
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitre() {
		return titre;
	}

	@Override
	public void setIdProduit(int idProduit) {
		// TODO Auto-generated method stub
		super.setIdProduit(idProduit);
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}


}
