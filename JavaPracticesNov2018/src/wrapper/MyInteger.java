package wrapper;
public class MyInteger
{
	public static void main(String args[]) throws NumberFormatException
	{

		int i = Integer.parseInt("55");
		System.out.println(i);

		System.out.println(Integer.valueOf(5).intValue());

		/*try
		{
			int i = Integer.parseInt("55");
			System.out.println(i);

		}

		catch (Exception e)
		{} */

	}

}
