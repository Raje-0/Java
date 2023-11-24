package J5_date_time;

import java.util.Date;

public class DT1_Date {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		
		Date d =new Date();
		System.out.println(d);
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		System.out.println(d.getHours());
		System.out.println(d.getYear());

	}

}
