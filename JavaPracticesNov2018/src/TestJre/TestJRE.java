public class TestJRE
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 5;
		i = j / i; //JVM catches this problem prior to executing the .class file
			   //and JVM avoids a stack underflow
		System.out.println(i);
	}

}
