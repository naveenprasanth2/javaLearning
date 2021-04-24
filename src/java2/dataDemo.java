package java2;

import java.text.SimpleDateFormat;
import java.util.Date;


public class dataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
		System.out.println(sdf.format(date));
		

	}

}
