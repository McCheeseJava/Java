public class MT implements Runnable
{
	private int i = 0;

	public MT()
	{
		i = 5;
	}

	public void run()
	{
		i++;
		i--;
		System.out.println("value of i is: " + i);

	}

}