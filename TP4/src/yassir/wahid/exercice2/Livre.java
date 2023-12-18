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

	public Livre() {
	}

	public Livre(int idProduit, String auteur, String isbn, String titre) {
		super.setIdProduit(idProduit);
		this.auteur = auteur;
		this.ISBN = isbn;
		this.titre = titre;
	}

	public void Print() {
		System.out.println("idProduit: " + idProduit + "\nAuteur : " + auteur
				+ "\n ISBN : " + ISBN + "\n titre : " + titre);
	}

}
