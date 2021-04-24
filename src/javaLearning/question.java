package javaLearning;

import java.util.ArrayList;
import java.util.List;

public class question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "information";
		String b = "naveen";
		String[] array1 = a.split("");
		String[] array2 = b.split("");
		String newone = "";
		
		for(String a1:array1) {
			for(String b1:array2) {
				if(!(a1.equals(b1)) && (!(newone.contains(a1)))){
					newone+=a1;
				}

			}
		}
			for(String b1:array2) {
				if(!(newone.contains(b1))){
					newone+=b1;
				}
			}
		System.out.println(newone);

	}

}
