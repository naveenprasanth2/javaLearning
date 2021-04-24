package java2;

import java.util.Arrays;

public class multidimenssional {

	public static void main(String[] args) {

		int[][] test = new int[3][3];
		test[0][0] = 0;
		test[0][1] = 2;
		test[0][2] = 2;
		test[1][0] = 55;
		test[1][1] = 11;
		test[1][2] = 12;
		test[2][0] = 77;
		test[2][1] = 21;
		test[2][2] = 22;
		int [][][] c = {{{0,0,0},{1,1,1},{2,2,2},{0,0,0},{1,1,1},{2,2,2},{0,0,0},{1,1,1},{2,2,2}}};
		System.out.println(Arrays.deepToString(c));
		int temp1 = 0;
		System.out.println(Arrays.deepToString(test));
		int temp = test[0][0];
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test.length; j++) {
				if(temp==test[i][j]) {
					for (int k = 0; k < test.length; k++) {
						if (temp1 < test[k][j]) {
							temp1 = test[k][j];
						}
					}
				}
				if (temp > test[i][j]) {
					temp = test[i][j];
					temp1 = temp;
					for (int k = 0; k < test.length; k++) {
						if (temp1 < test[k][j]) {
							temp1 = test[k][j];
						}
					}
				}
			}

		}
		System.out.println(temp);
		System.out.println(temp1);
	}
}
