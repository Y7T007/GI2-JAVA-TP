package yassir.wahid.exercice2;

public class Ex2 {

	public static void main(String[] args) {
		TabUtils tab = new TabUtils();

		int[10] pTab1 = {1, 2, 3, 5, 4, 6, 9, 7};
		int[10] pTab2 = {1, 8, 3, 6, 4, 6, 8, 7};

		System.out.println(tab.compareTab(pTab1, pTab2));

	}

}
