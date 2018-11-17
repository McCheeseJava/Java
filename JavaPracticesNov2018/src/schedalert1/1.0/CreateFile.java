import java.io.*;

public class CreateFile 
{
	private final String directory = ".";
	private File  fileName;

	public CreateFile (String fileName)
	{
		this.fileName = new File (directory, fileName);
	}

	public void createFile()
	{
		
		try
		{
			fileName.createNewFile();
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
