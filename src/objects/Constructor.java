package objects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Constructor {
	
	public Constructor(String one)
	{
		System.out.println("Constructor is working "+one);
	}
	public Constructor()
	{
		System.out.println("Constructor is working");
	}


	public void test()
	{
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor con = new Constructor("testing");
		Constructor con1 = new Constructor();
		con1.test();
	}


}
