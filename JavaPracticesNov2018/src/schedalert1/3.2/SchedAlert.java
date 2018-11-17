import java.io.*;
import java.text.*;
import java.util.*;

public class SchedAlert
{
	public static void main (String args[])
	{
		Locale currentLocale = new Locale("en");
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
		Date     date = new Date();
		String fileName = dateFormatter.format(date);

        System.out.println("Your information will be stored in file:" + fileName);

		CreateFile todaysFile = new CreateFile(fileName);
		todaysFile.createFileName();

		Engineers ref = new Engineers();
		ref.writeEngineersToFile();
		ref.readEngineersFromFile();

	}

}






