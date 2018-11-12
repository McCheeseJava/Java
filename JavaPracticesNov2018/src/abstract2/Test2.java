package abstract2;
public class Test2 extends Test
{
	public String funcS (String s)
	{
		return s;	
	}

	public char   funcC (char   c)
	{
		return c;
	}

	public static void main(String args[])
	{
		Test2 o = new Test2();
		String st =  o.funcS("string");
		char   ch =  o.funcC('A');

		System.out.println(st + ch);
	}

}
 
	
