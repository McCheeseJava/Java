package string;
public class Immute
{
	public static void main(String args[])
	{
		String s = new String("hi");
		String t = new String("bye");
		String u = new String("what");

		//u = t.concat( t.toUpperCase() );

		s = "give me a break";

		System.out.println(s + t + u);

		System.out.println(  );
	}

}
