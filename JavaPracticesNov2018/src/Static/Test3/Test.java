//a non static method can access a static variable

public class Test
{
	private static int x = 5;

	public void test()
	{
		System.out.println(x);
	}

	public static void main(String args[])
	{
		x = 6;
		new Test().test();
	}

}