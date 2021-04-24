package practice;

import java.util.ArrayList;

public class StringReverse {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String a = "information";
//		String b = "technology";
//		a+=b;
//		char[] c = a.toCharArray();
//		ArrayList<Character> list = new ArrayList<Character>();
//		for(int i=0;i<a.length();i++) {
//			if(!(list.contains(c[i]))) {
//				list.add(c[i]);
//			}
//		}
//		list.forEach(s-> System.out.print(s));
		String a = "Piyush";
		char[] b = a.toCharArray();
		a="";
		for(int i=b.length-1;i>=0;i--){
		a+=b[i];
		}
		System.out.println(a);

	}

}
