package javaLearning;

public class duplication {
	
	public static void main(String[] args)
	{
		String name = "nav/een";
		String newone = "";
		for(int i = 0 ; i<name.length() ; i++) {
			newone += name.charAt(i);
		}
		System.out.println(newone);
		System.out.println(newone.lastIndexOf("e"));
		System.out.println(newone.substring(1));
		
		String arr[] = name.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(name.replace("/", ""));
		
		
	}

}
