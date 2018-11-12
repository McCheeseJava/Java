import java.io.*;

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

			in.close();
			out.close();
			
                }

		catch (Exception e)
                {
		System.out.println("please be sure to Enter a number");
                }
	
	
		}


}
