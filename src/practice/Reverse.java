package practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "information";
		char[] b = a.toCharArray();
		a = "";
		for(int i=b.length-1;i>=0;i--) {
			a+=b[i];
		}
		System.out.println(a);
	}

}
