package myassert;
public class MyAssert
{

	public static int test()
	{
		return 4;
	}

	public static void main(String args[])
	{
		try
		{
			assert 5 == 8 : MyAssert.test();
		}
		catch (AssertionError e)
		{
			e.getMessage();
		}
	}

}


