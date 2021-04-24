package new_learn;

import java.util.ArrayList;

public class Whiledemo {

	public static void main(String[] args) {
		int x = 3;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(x+"\t");
				x+=3;
			}
			System.out.println();
		}

	}
}