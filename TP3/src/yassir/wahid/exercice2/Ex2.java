package yassir.wahid.exercice2;

public class Ex2 {

	public static void main(String[] args) {
		TabUtils tab = new TabUtils();

		int[] pTab1 = {1, 2, 3, 5, 4, 6, 9, 7};
		int[] pTab2 = {1, 8, 3, 6, 4, 6, 8, 7};

		int[] pTab3 = tab.compareTab(pTab1, pTab2);

		for (int i = 0; i < pTab3.length; i++) {
			System.out.println(pTab3[i]);
		}
	}
}
