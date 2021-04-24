package sqlLearning;

import java.util.ArrayList;
import java.util.HashMap;

public class insproblem {
	
	public static void main(String[] args) {
				
		int a[] = {4,5,5,5,4,6,6,9,4,0,9,3};
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(((a[i]==a[j])) && (!(array.contains(a[i])))) {
					count++;
					hm.put(a[i], count);
				}
			}
			if(!(array.contains(a[i]))) {
				hm.put(a[i], count);
			}
					
			array.add(a[i]);
		}
		
		System.out.println(hm);
	}

}
