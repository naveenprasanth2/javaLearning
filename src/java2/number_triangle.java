package java2;

public class number_triangle {

	public static void main(String[] args) {
		int size = 4;
		int value = 1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
		}

	}

}
