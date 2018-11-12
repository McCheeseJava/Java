class LocalClass 
{
	static void f (int x)
	{
		assert x < 0 : "X is not less than 0";
	}

}

public class Test
{
	public static void main(String args[])
	{
		LocalClass.f(59);
	}

}
