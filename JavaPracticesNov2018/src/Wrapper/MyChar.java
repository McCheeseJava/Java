public class MyChar
{
	private char c;

	public MyChar(char c)
	{
		this.c = c;
	}

	public void test()
	{

		if ( Character.isLowerCase(c) == true)
			System.out.println(" letter " + c + " is lower case");

		else
			System.out.println(" letter " + c + " is upper case");


	}

	public static void main( String args[])
	{
		MyChar oo = new MyChar('h');
		MyChar oo2 = new MyChar('F');
		oo.test();
		oo2.test();
	}

}