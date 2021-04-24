package java2;

public class interface_Imolementation implements trafficsignal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trafficsignal imp = new interface_Imolementation();
		imp.greenGO();
		imp.redStop();
		imp.yellowWait();
		
	}

	@Override
	public void greenGO() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}

}
