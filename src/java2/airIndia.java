package java2;

public class airIndia extends parentAirCraft{

	public static void main(String[] args) {
		
		airIndia air = new airIndia();
		air.color();
		air.safetyguidelines();
		air.engine();
		String name = "test";
		char[] name1 = name.toCharArray();
		name="";
		for(int i = name1.length -1;i>=0;i--) {
			name+=name1[i];
		}
		System.out.println(name);
		System.out.println(test);

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("color");
	}

}
