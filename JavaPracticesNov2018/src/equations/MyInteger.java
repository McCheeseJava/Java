package equations;
public class MyInteger
{
	private Integer arr = new Integer(6);
        private Integer att = new Integer(6);

	public static void main (String args[])
	{

		MyInteger aint = new MyInteger();
                System.out.println(aint.arr + " " + aint.att);
		System.out.println(aint.arr.compareTo(aint.att) == 0 );
                System.out.println(aint.arr.equals(aint.att)  );
		System.out.println(aint.arr == aint.att);

	}

}
