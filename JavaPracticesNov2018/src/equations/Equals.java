package equations;
public class Equals
{
	public static void main (String args[])
	{
		int arr[] = new int[1];
		int att[] = new int[1];

		arr[0] = 1;
		att[0] = 1;

		System.out.println( arr[0] == att[0] );
		System.out.println( arr.equals(att)  );

		String a = "a";
		String b = "a";

		System.out.println(a.equals(b));
		System.out.println(a == b);

		System.out.println("a.hashCode() == b.hashCode() = "  + (   a.hashCode() == b.hashCode()   )  );



	}

}
