import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("naveen");
		a.add("java");
		a.forEach(s-> System.out.println(s));
		
		System.out.println(a.get(0));
		
//		a.removeAll(a);
//		System.out.println(a);
		if(a.contains("naveen")) {
			System.out.println("iruku");
			a.add(0,"new");
			a.add(a.size(),"test");
			System.out.println(a.get(a.size()-1));
			
			HashSet<String> hs = new HashSet<String>();
			hs.add("test1");
			hs.add("newone");
			
			Iterator<String> iter = hs.iterator();
			
			while(iter.hasNext()) {
				System.out.println(iter.next());
			}
			
		}
	}

}
