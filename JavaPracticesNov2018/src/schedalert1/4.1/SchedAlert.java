/*
 * Main.java
 *
 * Created on March 20, 2005, 1:51 PM
 */


/**
 *
 * @author Owner
 */
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

		Engineers engineer = new Engineers();
		engineer.writeEngineersToFile();

	    SchedAlertDaemon daemon = new SchedAlertDaemon();
	    daemon.readEngineersFromFile();

	}

}
