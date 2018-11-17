import java.io.*;

public class SchedAlert
{
	public static void main (String args[])
	{
		InputStreamReader ir = new InputStreamReader(System.in);
	        BufferedReader    in = new BufferedReader(ir);
		String fileName;

                System.out.println("Please enter todays date: Mar 1,2005");

		try
                {
                        fileName = in.readLine();
			CreateFile todaysFile = new CreateFile(fileName);
			todaysFile.setFileName();
                }

                catch (Exception e)
                {
                        e.printStackTrace();
                }

		new Engineers().getEngineerNames();

	}

}






