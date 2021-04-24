package objects;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 35;
		int space = size/2;
		
		for(int i=0;i<size;i+=2) {
			int iter = space;
			while(iter>0) {
				System.out.print(" ");
				iter--;
			}
			for(int j=i;j>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
			space--;
		}
		
	}

}
