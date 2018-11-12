import java.io.*;

public class CreateFile
{
	private final String directory = ".";
	private static File  fileName;

	public CreateFile (String fileName)
	{
		this.fileName = new File (directory, fileName);
	}

	public void setFileName()
	{

		try
		{
			fileName.createNewFile();
		}

		catch (Exception e)
		{
			System.out.println("File already exist.");
			e.printStackTrace();
		}

	}

	public static File getFileName()
	{
		return fileName;
	}

}
