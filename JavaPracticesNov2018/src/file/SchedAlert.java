package file;
import java.io.*;

public class SchedAlert 
{
	public static void main (String args[])
	{
		File fileName;
		final String directory = "/tmp";

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		System.out.println("Please enter todays date: Mar 1, 2005"); 
		try
		{
			fileName = new File ( directory, in.readLine() );
			fileName.createNewFile();
			in.close();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

	}


	
}


