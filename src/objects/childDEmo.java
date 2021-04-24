package objects;

public class childDEmo extends parentDemo{
	String name = "QAClickacademmy";
	
	public childDEmo() {
		super();//Always this should be at the first line
		System.out.println("child class");
	}
	
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void parent() {
		super.parent();
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childDEmo cd = new childDEmo();
		cd.getStringData();
		cd.parent();

	}

}
