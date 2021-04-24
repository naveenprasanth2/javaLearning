import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ecceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] b = {"naveen","prasantL"};
		ArrayList<String> a = new ArrayList<String>(Arrays.asList(b));
		HashMap<String,Integer> y = new HashMap<String,Integer>();
		List<String> x = new ArrayList<String>();

		
		System.out.println(a.toString());
		System.out.println(a.get(1).toString().toLowerCase());
		
//		int[][] z = {{1,2,3},{4,5,6}};
//		System.out.println(Arrays.deepToString(Arrays.sort(z)));
		Boolean i = true;
	}

}
