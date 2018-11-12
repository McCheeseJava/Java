import java.util.*;

public class MyDate
{
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year  = year;
	}

        public void print()
	{
		System.out.println(day + " " + month + " " + year);
        }

	public static void main (String args[])
	{
		MyDate now = new MyDate(06, 29, 2003);
		System.out.println(now.toString() );
		//now.print();

		Date  today = new Date();
		System.out.println(today.toString());
	}

}

