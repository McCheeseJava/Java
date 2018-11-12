package file;
import java.io.*;

public class Test 
{
	public static void main (String args[])
	{
		final String directory = "/tmp";
		File fileName;

		fileName = new File ( directory, "test5" );
		
		try
		{
			fileName.createNewFile();
		}

		catch (IOException e)
		{
			e.printStackTrace();
		}
	
	}

	
}


