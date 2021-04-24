package practice;

public class Fitsnonrep {

	public static void main(String[] args) {
		String a = "naveen";
		String b = "hgyuan";
		char[] x = a.toCharArray();
		char[] y = b.toCharArray();
		for(int i=0;i<=a.length()-1;i++) {
			char z = x[i];
			String newone = Character.toString(z);
			if(!(b.contains(newone))) {
				System.out.println(newone);
				break;
			}
		}
	}

}
