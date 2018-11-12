package exception2;
public class Ex
{
	public static void main(String args[])
	{
		int i[] = new int[3];
		try
		{
			i[3]=2;
		}
		catch (ArrayIndexOutOfBoundsException e)
		{}
		catch (Exception e)
		{}
	}

}

			
