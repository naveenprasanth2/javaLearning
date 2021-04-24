package sqlLearning;

import java.util.ArrayList;

public class avoid_duplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "information";
		String b = "technology";
		a+=b;
		char[]c = a.toCharArray();
		ArrayList<Character> newone = new ArrayList<Character>();
		for(int i=0;i<a.length();i++) {
			if(!(newone.contains(c[i]))) {
				newone.add(c[i]);
			}
		}
		newone.forEach(s-> System.out.print(s));
	}

}
