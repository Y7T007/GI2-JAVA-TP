package yassir.wahid.exercice2;

public class TabUtils {

	public int[] compareTab(int[] a, int[] b) {

		int[] a1 = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				a1[i] = 0;
			} else {
				a1[i] = 1;
			}
		}
		return a1;
	}
}
