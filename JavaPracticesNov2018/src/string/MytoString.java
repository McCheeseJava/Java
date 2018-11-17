package string;
public class MytoString
{
	public static void main(MyString2 args[])
	{
		MytoString a = new MytoString();
		System.out.println(a);
		System.out.println(new MytoString());

		MytoString b = new MytoString();
		b = a;
		System.out.println(b);

	}

}