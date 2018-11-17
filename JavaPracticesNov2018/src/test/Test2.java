package test;
public class Test2
{
	public static void main(String args[])
	{
		int  b = 5;
		String c = Integer.toString(b);
		System.out.println(c);

		if (c instanceof String)
			System.out.println("c is a instance of String!");
		
		double d = -10 / 0.0;
		if (d == Double.NEGATIVE_INFINITY)
		{
			System.out.println(d);
		}

	}

}
