package stringbuilder;
public class MyStringBuilder
{
	public static void main(String args[])
	{
		StringBuilder a = new StringBuilder("ar");
		StringBuilder b = new StringBuilder("ar");

	    System.out.println("a.equals(b):  " + a.equals(b) );
	    System.out.println("a == b:  " + (a == b) );
	    
	    System.out.println(new StringBuilder("a").equals(new StringBuilder("a")));
	    
	    System.out.println(new String("a").equals(new String("a")));
	    System.out.println(new String("a"));
	    System.out.println(new StringBuilder("a"));
	    
	    System.out.println(new MyStringBuilder());

	    

	}
}

