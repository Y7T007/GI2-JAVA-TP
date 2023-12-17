package yassir.wahid.exercice4;

public class Ex4 {

	int heures;
	int minutes;
	int seconds;

	// getters
	public int getHeures() {
		return heures;
	}
	public int getMinutes() {
		return minutes;
	}
	public int getSeconds() {
		return seconds;
	}

	// setters
	public void setHeures(int heures) {
		this.heures = heures;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	// constructeur par défaut

	public Ex4() {

	}
	public Ex4(int heures, int minutes, int seconds) {
		this.heures = heures;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public Ex4(float duree) {
		this.heures = (int) duree;
		this.minutes = (int) ((duree - heures) * 60);
		this.seconds = (int) (((duree - heures) * 60 - minutes) * 60);
	}

	public float getDec() {
		return (float) (this.heures
				+ ((this.minutes + (this.seconds / 60)) / 60));
	}

}

