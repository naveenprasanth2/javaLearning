import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RepeatHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 4, 4, 5, 6, 7, 2, 3, 4, 5, 7, 8, 6, 5, 4, 4, 4, 3, 8, 8 };
		HashMap<Integer, Integer> test = new HashMap<Integer, Integer>();
		for (int i = 0; i < x.length; i++) {
			if (test.containsKey(x[i])) {
				int val = test.get(x[i]);
				val++;
				test.put(x[i], val);
			} else {
				test.put(x[i], 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> summa = test.entrySet();
		Iterator<Map.Entry<Integer, Integer>> iter = summa.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, Integer> values = iter.next();
			if (values.getValue() == 1) {
				System.out.println(values);
			}
		}
	}

}
