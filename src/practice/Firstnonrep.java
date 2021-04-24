package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firstnonrep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value  = "neeeveen";
		char[] val = value.toCharArray();
		String letter = "";
		List<char[]> value1 = Arrays.asList(val);
		for(int i=0;i<value.length();i++) {
			letter = "";
			for(int j=i+1;j<value.length();j++) {
				if(val[i]==val[j]) {
					letter+=val[j];
				}
				
			}
			if(letter.length()==0) {
				System.out.println(val[i]);
				break;
			}

			}
	}

}
