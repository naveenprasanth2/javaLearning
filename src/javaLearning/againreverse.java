package javaLearning;

public class againreverse {

	public static void main(String[] args) {
		int size = 35;
		int space = 1;
		while(size>=0) {
			if(size==0) {
				System.out.print("*");
			}
			int shrink = size;
			while(shrink!=0) {
				System.out.print("*");
				shrink--;
			}
			System.out.println();
			int tempspace = space;
			while(tempspace!=0) {
				System.out.print(" ");
				tempspace--;
			}
			size-=2;
			space++;
		}
	}
	}