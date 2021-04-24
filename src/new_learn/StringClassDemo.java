package new_learn;

public class StringClassDemo implements New2Interface{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		New2Interface b = new StringClassDemo();
		b.red();
		b.yellow();
		b.green();
		System.out.println(b.a);
		}
	public void test() {
		System.out.println("test");
	}
	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}
}