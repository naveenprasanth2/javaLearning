package objects;

public class staticvariable {
	
	String name;
	String address;
	static String cityname = "Bangalore";
	static int i = 0;
	static String city;
	
	static {
		city = "bangalore";
	}
	
	staticvariable(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getaddress()
	{
		System.out.println(address+" "+cityname);
	}
	
	public static void getcity()
	{
		System.out.println(cityname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvariable sv = new staticvariable("Bob","tiruchengode");
		staticvariable sv1 = new staticvariable("Bob1","tiruchengode1");
		sv.getaddress();
		sv1.getaddress();
		staticvariable.getcity();
		staticvariable.cityname = "summa";
		staticvariable.getcity();

	}

}
