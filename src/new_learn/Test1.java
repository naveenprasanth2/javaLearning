package new_learn;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String y = new String("mam");
		char[] test = name.toCharArray();
		name = "";
		for(int i=test.length -1 ; i>=0 ; i--){
		name+=test[i];
		}

		System.out.println(name);
		Test1 a = new Test1();
		int x = a.test();
		System.out.println(x);
		Test2 z = new Test2();
		z.setData();
	}
	
	public int test() {
		System.out.println("summa");
		return 2;
	}

}
