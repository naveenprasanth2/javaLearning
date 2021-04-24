package javaLearning;

public class stringreverse {
	
	public static void main(String[] args)
	{
		String name = "madam";
		String newone = "";
		String[] strname = name.split("");
		for(int i=name.length()-1;i>=0;i--)
		{
			newone+=strname[i];
	
		}
	System.out.println(newone.equals(name));
	}
	
	public void stringrev()
	{
		String name = "reverse";
		String newone = "";
		String[] strname = name.split("");
		for(int i=name.length()-1;i>=0;i--)
		{
			newone+=strname[i];
	
		}
	System.out.println(newone);
	}

}
