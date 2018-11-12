package date2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {

	public static void main(String[] args) {
		SimpleDateFormat d = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		System.out.println(d.format(new Date()));

	}

}
