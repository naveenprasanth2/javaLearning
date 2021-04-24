package new_learn;

public class ChildDemo extends parentclassdemo{
	String colour = "green";
	
	public ChildDemo() {
		System.out.println("child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
//		cd.engine("summa");
		cd.brakes();
		cd.gear();
	}

	public void engine() {
		System.out.println("new engine");
	}

	public void engine(String test) {
		System.out.println(colour);
		System.out.println(test);
	}
	
	public void gear() {
		System.out.println("child gear");
		System.out.println(colour);
	}
	

}
