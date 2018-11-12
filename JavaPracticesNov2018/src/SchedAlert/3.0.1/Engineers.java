import java.io.*;
import java.util.*;

public class Engineers
{
		private InputStreamReader ir = new InputStreamReader(System.in);
	    private BufferedReader    in = new BufferedReader(ir);


		private FileWriter writer;
		private PrintWriter out;
		private File fileName;

		private String numOfEngString;
		private int    numOfEngInt;
		private String nameOfEng[] = new String[50];

		private String ingStartLtHour[] = new String[50];
		private int    intStartLtHour[] = new int[50];

		private HashMap hmap = new HashMap();



		private void getFileName()
		{
			this.fileName = CreateFile.getFileName();
			System.out.println("File Name:" + fileName);

		}

		public void getEngineerNames()
		{
			getFileName();
			System.out.println("How many eng working today?");

			try
			{
				writer = new FileWriter(fileName);
				out    = new PrintWriter(writer);

				numOfEngString = in.readLine();
				numOfEngInt    = Integer.parseInt(numOfEngString);

				for (int i = 0; i < numOfEngInt; i++)
				{

					System.out.println("Enter name of engineer " + (i+1) );
					nameOfEng[i] = in.readLine();

					if(nameOfEng[i] != null)
						out.println(nameOfEng[i]);

	        	}


	        	for (int i = 0; i < numOfEngInt; i++)
	        	{
					System.out.println("what is the starting LT hour for " + nameOfEng[i]);
					ingStartLtHour[i] = in.readLine();
					intStartLtHour[i] = Integer.parseInt(ingStartLtHour[i]);
					hmap.put( nameOfEng[i], intStartLtHour[i] );


				}

							System.out.println("The size of HashMap = "+hmap.size());
			System.out.println("If hashmap empty = "+hmap.isEmpty());





					for (int i = 0; i < numOfEngInt; i++)
					{
						System.out.println ( "LT hours for " + nameOfEng[i] + " is " + hmap.get(nameOfEng[i]) ) ;
					}







				in.close();
	        	out.close();


		     } //try


			 catch (IOException e)
		 	 {
				e.printStackTrace();
		 	 }


		 } //gineerNames()






}
