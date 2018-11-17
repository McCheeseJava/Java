package string;
public class MyStrings
{
	public static void main (MyString2 args[])
	{
		MyString2 arr = new MyString2("hi");
		MyString2 att = new MyString2("hi");

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
