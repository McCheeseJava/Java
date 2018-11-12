package array3;
public class TestArrays
{
	public static void main(String args[])
	{
		int array1[] = {2, 3, 5, 7, 9, 11, 13, 17, 19};
		int array2[];

		array2 = array1;

		for (int i = 0; i < array2.length; i++)
		{
			try
			{
				if ( (i % i) == 0) 
				array2[i] = i;
			}

			catch (ArithmeticException e)
			{
				i++;
			}
		}

		for (int i = 0; i < array1.length; i++)
                        System.out.print(array1[i]+ " ");


	}

}

		
