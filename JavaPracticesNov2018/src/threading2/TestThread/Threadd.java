public class Threadd implements Runnable
{
	private int i; 
	
	public void run()
	{
		System.err.println(i);
		i++;

	}

}

 
