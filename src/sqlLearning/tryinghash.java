package sqlLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class tryinghash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("naveen");
		array.add("Prasaanth");
		array.add("summa");
		array.add("naveen");
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
//		array.stream().collect(Collectors.toMap(Function.identity(), String::length,(e1,e2)-> e1,HashMap::new));
		for(int i=0;i<array.size();i++) {
			hs.put(i, array.get(i));
		}
		System.out.println(hs);

	}

}
