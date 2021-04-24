package practice;

import java.util.HashMap;

public class Firstnonrephashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hash = new HashMap<String,Integer>();
		String value = "naveen";
		char[] value1 = value.toCharArray();
		for(int i=0;i<value.length();i++) {
			if(!(hash.containsKey(value1[i]))) {
				hash.put(Character.toString(value1[i]), 0);
				System.out.println(hash);
			}
			
			if((hash.containsKey(value1[i]))) {
				int pos = hash.get(value1[i]);
				hash.put(Character.toString(value1[i]), pos++);
			}
			
		}
		System.out.println(hash);
	}

}
