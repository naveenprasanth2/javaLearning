package objects;

import javaLearning.againreverse;

public class finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 0; //value remains the same
		
		//If we mark a class as final, then we cannot use that as a parent class
		//If we mark a method as final , then method cannot be overridden
		againreverse ar = new againreverse();
		
		try {
			int x = 1/0;
			System.out.println("next line");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic" + " (" + e + ")");
		}
		catch(Exception e) {
			System.out.println("test"+e);
		}
		finally {
			System.out.println("everything went well");
		}

	}

}
