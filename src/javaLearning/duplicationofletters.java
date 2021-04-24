package javaLearning;

import java.util.ArrayList;

public class duplicationofletters {

	public static void main(String[] args) {
		String a = "information";
		String b = "technology";
		a += b;
		ArrayList<Character> c = new ArrayList<Character>();
		for (int i = 0; i < a.length(); i++) {
			if (!(c.contains(a.charAt(i)))) {
				c.add(a.charAt(i));

			}

		}
		c.forEach(s -> System.out.print(s));

	}

}
