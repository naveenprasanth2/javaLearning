package objects;

public class thisDemo {
	
	int a = 10;
	
	//this refers to current object. Its scope is all over the class
	
	public void testdata() {
		int a = 3;
		System.out.println(this.a+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td = new thisDemo();
		td.testdata();

	}

}
