package javaLearning;

public class inversetriagle {
	public static void main(String[] args) {

		int i = 35;
		int x = 1;
		while (i >= 0) {
			if (i == 0) {
				System.out.print("*");
			}
			int j = i;
			while (j != 0) {
				System.out.print("*");
				j--;
			}

			System.out.println();
			int y = x;
			while (y > 0) {
				System.out.print(" ");
				y--;

			}
			i-=2;
			x++;

		}

	}

}