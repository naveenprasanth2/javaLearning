package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reversesentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is my sentence";
		String reverse = "";
		List<String> list = Arrays.asList(sentence.split(" "));
		for(String lis: list) {
			char[] temp = lis.toCharArray();
			for(int i=lis.length()-1;i>=0;i--) {
				reverse+=temp[i];
			}
			reverse+=" ";
		}
		System.out.println(reverse.strip());
	}

}
