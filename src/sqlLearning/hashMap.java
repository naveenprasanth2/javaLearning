package sqlLearning;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "firstone");
		map.put(2, "secondone");
		Set sn = map.entrySet();
		Iterator iter = sn.iterator();
		while(iter.hasNext())
		{
			Map.Entry mp = (Map.Entry) iter.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		Hashtable<Integer,String> map1 = new Hashtable<Integer,String>();
		Set sn1 = map1.entrySet();

	}

}
