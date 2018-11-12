package bitwise;
public class Test
{
	public static void main(String args[])
	{
		long t = -98 << 3;
		long u =  98 << 3;
		long v = -98 >> 3;
		long w =  98 >> 3;

		long x =   2 >>> 3;

		System.out.println (t + " " + u + " " + v + " " + w + " " + x);
	}

}

//output:
//-784 784 -13 12 0

