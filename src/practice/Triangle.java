package practice;

public class Triangle {

	public static void main(String[] args) {
		int size = 35;
		int gap = size/2;
		for(int i=1;i<size;i+=2) {
			for(int x=gap;x>0;x--) {
				System.out.print(" ");
			}
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
			gap--;
		}

	}

}
