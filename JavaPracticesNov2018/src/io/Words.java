package io;
import java.io.*;

public class Words{

	public static void main (String args[]){


		String line = "";

		try{

			File myfile = new File("interview.txt");
			FileReader fileReader = new FileReader(myfile);
			BufferedReader reader = new BufferedReader(fileReader);

			while (   (line = reader.readLine()) != null  )
			{
				System.out.println(line);
			}

		}


		catch (IOException e)
		{}
	}

}
