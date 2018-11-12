package immute;
public class Immute
{
	public static void main(String args[])
	{
		//String a = "a";
	    //String b = "a";
	    //a = "c";

	    String a = new String ("a");

	    String b = new String ("a");

	    System.out.println("a.equals(b):  " + a.equals(b) );
	    System.out.println("a == b:  " + (a == b) );
	}
}

