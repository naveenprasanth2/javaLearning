package java2;

import java.util.ArrayList;
import java.util.List;

public class overLoadUse extends function_overloading {
	public static int i=1;

	public static void main(String[] args) {
		overLoadUse use = new overLoadUse();
		use.getData(0);
		use.getData("summa");
		System.out.println(use.i);
		ArrayList<String> name = new ArrayList<String>();
		name.add("test");
		name.forEach(s-> System.out.println(s));
		int a[] = {1,2,3,4,5};
		for(int i = 0; i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		ArrayList<String> list = new ArrayList<String>();
		String name1 = "test";
		list.add(name1);
		list.forEach(s-> System.out.println(s));
	}
	
	public void getData(String test)
	{
		System.out.println("overload test");
	}

}
