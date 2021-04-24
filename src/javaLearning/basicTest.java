package javaLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class basicTest {

	public static void main(String[] args) {

		String[] test = { "naveen", "prasanth", "prasanth" };
		Set<String> finalvalue = new HashSet<String>();
		for (String name : test) {
			if (finalvalue.add(name) == false) {
				System.out.println("duplicate value is found " + name);
				System.out.println("**********************************");
			}
		}

		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String value : test) {
			Integer count = map.get(value);
			if (count == null) {
				map.put(value, 1); //1 is not position, its just a key value par
			} else {
				map.put(value, ++count);
			}
		}
			
		Set<Entry<String,Integer>> entryset = map.entrySet();
		for(Entry<String,Integer> entry : entryset) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() +" duplicate value is found");
			}
		}
		

	}

}
