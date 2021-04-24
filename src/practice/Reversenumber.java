package practice;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456789;
		int i = 0;
		String finalword = "";
		do {
			int remainder = number%10;
			finalword+=Integer.toString(remainder);
			number = number/10;
		}while(number>0);
		System.out.println(Integer.parseInt(finalword));
	}

}
