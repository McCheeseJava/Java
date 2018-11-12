public class MyStrings
{
	public static void main (String args[])
	{
		String arr = new String("hi");
		String att = new String("hi");

		System.out.println(arr);

		if (arr == att)
			System.out.println("the two items are equal in their values");
		else
			System.out.println("the two items are NOT equal in their values");


		if (arr.equals(att)  )
			System.out.println("the two items are the same object");
		else
			System.out.println("the two items are not the same object");



	}

}

/*
java MyStrings
the two items are NOT equal in their values
the two items are the same object
*/
