
public final class Thiskeyword {
	String name;
	String address;
	static int x;
	static String city;
	final int i = 0;
	static {
		city = "Bangalore";
		x = 0;
	}
	
	
	public Thiskeyword(String name, String street) {
		this.name = name;
		this.address = street;
		System.out.println(this.name);
		System.out.println(this.address);

	}
	public final void summa() {
		System.out.println(city);
		System.out.println(i);
	}
	public static void summa1() {
		System.out.println(city);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword t = new Thiskeyword("naveen","chennai");
		Thiskeyword t1 = new Thiskeyword("naveen1","chennai1");
		summa1();
	}

}
