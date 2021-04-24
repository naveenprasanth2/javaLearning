package new_learn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat f1 = new SimpleDateFormat("hh:mm:ss");
		System.out.println(f.format(date));
		System.out.println(f1.format(date));
	}

}
