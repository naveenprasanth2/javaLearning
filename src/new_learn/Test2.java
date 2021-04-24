package new_learn;

import java.util.ArrayList;

public class Test2 {
	
	public void setData() {
		System.out.println("setdata");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "naveen";
		ArrayList<Character> x = new ArrayList<Character>() ;
		for(int i=0;i<name.length();i++) {
			if(!(x.contains(name.charAt(i)))) {
				x.add(name.charAt(i));
			}
		}
		x.forEach(s-> System.out.println(s));
	}

}
