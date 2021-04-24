package javaLearning;

public class Stringrev {

	public static void main(String[] args) {
		String a = "naveen";
		String reverse = new StringBuilder(a).substring(3, 6).toString();
		System.out.println(reverse);
		String x = new StringBuffer(a).subSequence(1, 5).toString();
		System.out.println(x);
}
}