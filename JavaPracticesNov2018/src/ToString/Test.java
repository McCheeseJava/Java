public class Test{

	public String toString(){
		return getClass().getName();
	}

	public static void main (String args[])
	{
		Test test = new Test();
		System.out.println(test.toString());
	}

}