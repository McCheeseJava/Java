package passbyvalue;
public class Test
{
	public static void replacer(String t)
	{
		t = new String(); // new object with new memory address
		t = "Omar";
 	}

	public static void main (String args[])
	{
		String s = new String();
		s	 = "Haroon";

		Test.replacer(s);
	
		System.out.println(s);
	}

}

        
