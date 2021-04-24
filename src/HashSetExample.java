import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> summa = new ArrayList<String> (Arrays.asList("cin","bin","bin","cin"));
		HashMap<String,Integer> test = new HashMap<String,Integer>();
		ArrayList<String> test1 = new ArrayList<String>();
		for(String i : summa) {
			if(test.containsKey(i)) {
				int val = test.get(i);
				val++;
				test.put(i, val);
			}
			else {
				test.put(i, 1);
			}
		}
		Set<Map.Entry<String, Integer>> summa1 = test.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = summa1.iterator();
		while(iter.hasNext()) {
			Entry<String, Integer> x = iter.next();
			test1.add(x.getKey()+x.getValue());
		}
		System.out.println(test1);
	}
}
