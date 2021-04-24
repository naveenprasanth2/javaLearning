package new_learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parentclassdemo {
	String colour = "red";

	public parentclassdemo() {
		System.out.println("parent constructor");
	}
	public static void main(String[] args) {
		String[] name = new String[] {"naveen","prasanth","ability"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));

	}

//	public void gear() {
//		System.out.println("gear code is implemented");
//	}

	public final void brakes() {
		System.out.println("brakes code is implemented");
	}

	public void audiosystem() {
		System.out.println("audiosystem code is implemented");
	}
}
