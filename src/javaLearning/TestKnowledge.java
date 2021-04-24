package javaLearning;

public class TestKnowledge {

	public static void main(String[] args) {
		int a[][] = {{1,7,8},{5,0,0},{3,9,0}};
		int max = a[0][0];
		int min1 = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(max<a[i][j]) {
					max = a[i][j]; 
					int min = a[i][j];
					for(int x=0;x<a.length;x++) {
						if(min>a[x][j]) {
							min = a[x][j];
							min1=min;
						}
					}
				}
			}
		}
System.out.println(max);
System.out.println(min1);

	}

}
