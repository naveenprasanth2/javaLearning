import java.util.ArrayList;

public class Simpleone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 4, 4, 5, 6, 7, 2, 3, 4, 5, 7, 8, 6, 5, 4, 4, 4, 3, 8, 8 };
		ArrayList<Integer> test = new ArrayList<Integer>();
		ArrayList<String> teststr = new ArrayList<String>();
		for (int i = 0; i < x.length; i++) {
			int count = 1;
			if (!(test.contains(x[i]))) {
				for (int j = i + 1; j < x.length; j++) {
					if (x[i] == x[j]) {
						count++;
						test.add(x[i]);
					}
				}
				teststr.add(x[i] + "=" + count);
			}

		}
		for(int i=0;i<teststr.size();i++) {
			if(Integer.parseInt(String.valueOf(teststr.get(i).charAt(teststr.get(i).length()-1)))==1) {
				System.out.println(teststr.get(i));
			}
		}
	}

}
