package equations;
public class Test
{
	public static void main (String args[])
	{
		Test arr = new Test();
		Test att = new Test();

		arr = att;

		if (arr == att)
			System.out.println("the two arrays are the same object");
		else
			System.out.println("the two arrays are not the same object");


		if (arr.equals(att)  )
			System.out.println("the two arrays are equal in their values");
		else
			System.out.println("the two arrays are NOT equal in their values");

	}

}

/*java Test
the two arrays are equal in their values
the two arrays are the same object
*/
