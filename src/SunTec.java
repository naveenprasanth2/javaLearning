import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SunTec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> test = Arrays.asList("bin","ain","bin","ain","ain","ken","ken");
		List<String> test1 = new ArrayList<String>();
		List<String> test2 = new ArrayList<String>();
		ArrayList<String> summa = new ArrayList<String>();
		for(int i=0;i<test.size();i++) {
			int count = 1;
			for(int j=i+1;j<test.size();j++) {
				if((test.get(i).equalsIgnoreCase(test.get(j)))&&(!(summa.contains(test.get(i))))) {
					count++;
				}
			}
			if(!(summa.contains(test.get(i)))){
				summa.add(test.get(i));
				test1.add(test.get(i)+" "+String.valueOf(count));
			}
		}
		String name = "";
		for(int i=0;i<test1.size();i++) {
			for(int j=1;j<test1.size();j++) {
				int x = Integer.parseInt(String.valueOf(test1.get(i).charAt(test1.get(i).length()-1)));
				int y = Integer.parseInt(String.valueOf(test1.get(j).charAt(test1.get(j).length()-1)));
				if(x>y) {
					name = test1.get(i);
				}
				else if(x==y) {
					for(int k=0;k<test1.get(i).length();k++) {
						int value = Character.compare(test1.get(i).charAt(k), test1.get(j).charAt(k));
						if(value<0) {
							name = test1.get(i);
							break;
						}
					}
				}
			}
			if(!(test2.contains(name))) {
				test2.add(name);
			}
			
		}
		System.out.println(test2.toString());
	}

}
