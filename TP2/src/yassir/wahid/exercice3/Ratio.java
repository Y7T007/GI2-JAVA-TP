package yassir.wahid.exercice3;

public class Ratio {

	int numera;
	int denomi = 1;

	Ratio produit(Ratio R) {
		Ratio prod = new Ratio();
		prod.denomi = R.denomi * this.denomi;
		prod.numera = this.numera * R.numera;
		return prod;
	}

	Ratio addition(Ratio R) {
		Ratio sum = new Ratio();
		sum.denomi = R.denomi * this.denomi;
		sum.numera = this.numera * R.denomi + this.denomi * R.numera;
		return sum;
	}

	Boolean egale(Ratio R) {
		return (R.numera == R.denomi);
	}

	Boolean plusGrand(Ratio a) {
		return ((float) (a.numera / a.denomi) > (float) (this.numera
				/ this.denomi));
	}

	public void setDenomi(int denomi) {
		if ((int) denomi != 0) {
			this.denomi = denomi;
		}
	}
	public void setNumera(int numera) {
		this.numera = numera;
	}


}
