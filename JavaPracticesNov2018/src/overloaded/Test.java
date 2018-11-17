package overloaded;
public class Test
{
	public int func(String a, double b)
	{
		System.out.println("func 1 ");
		return 1;
	}

	public int func(Double c, double b)
	{
		System.out.println("fucn 2 ");
		return 2;
	}


	public static void main(String args[])
        {
                Test o = new Test();
                int i =  o.func("haroon", 5.5);
                int j = o.func(Double.valueOf(5.5), 5.5);
        }

}
