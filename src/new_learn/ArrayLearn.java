package new_learn;

import java.util.Arrays;


public class ArrayLearn {
	
	public static void main(String[] args) {
		
//		int[][] a = {{0,0},{0,1},
//					{1,0},{1,1}};
//		
//		System.out.println(Arrays.deepToString(a));
		
		int [][] a = new int [3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = -3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		int column = 0;
		int x = a[2][2];
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a.length-1;j++) {
				if(x>a[i][j]) {
					x = a[i][j];
					column = j;					
				}
			}
		}
		System.out.println("min mum is" + x);
		for(int y=0;y<a.length;y++) {
			if(x<a[y][column]) {
				x = a[y][column];
			}
		}
		System.out.println("max num is" + x);
		System.out.println(Arrays.deepToString(a));
	}

}
