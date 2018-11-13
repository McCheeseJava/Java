package ccalendar;
import java.util.*;
import java.text.*;

public class MyCalendar 
{

	public void funcgetDate()
	{
	Locale currentLocale = new Locale("en");
	DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,currentLocale);
        Date     date = new Date();
        String dateOut = dateFormatter.format(date);
	System.out.println("Date " + dateOut);
	}

	public void funcStringToString()
	{
	
	SimpleDateFormat stringToDate = new SimpleDateFormat("11/11/2004");
  	String testDate = stringToDate.toPattern();
	System.out.println("Date " + testDate);
	}

	public void funcStringToDate()
	{
		DateFormat raf = DateFormat.getDateInstance();
		try
		{
			Date date1 = raf.parse("feb 21, 2005");
			System.out.println("Date: " + date1);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}

	}

}
