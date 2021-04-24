package new_learn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calenderdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(sdf.format(calendar.getTime()));
		String test = sdf.format(calendar.getTime());
		String[] x = test.split("/");
		for(String y : x) {
			System.out.println(y);
		}

	}

}
