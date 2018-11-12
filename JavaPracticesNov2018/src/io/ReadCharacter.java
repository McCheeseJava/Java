package io;
import java.io.*;

public class ReadCharacter{

	public static void main (String args[]){


		int charr;

		try{

			File myfile = new File("interview.txt");
			FileReader fileReader = new FileReader(myfile);
			BufferedReader reader = new BufferedReader(fileReader);

			while (   (charr = reader.read()) != -1  )
			{
				System.out.println(charr);
			}

		}


		catch (IOException e)
		{}
	}

}
