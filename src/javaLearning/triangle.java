package javaLearning;

public class triangle {

	public static void main(String[] args) {
		
		int x = 9;
		int i=0;
		while(i<x)
		{
			int j = 0;
			while(j<i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
		}
		x-=2;
		
}
}