package threading4;
public class MTtester
{
	public static void main(String args[])
	{
		MT job = new MT();

		Thread thread = new Thread(job);
		thread.start();

		Thread thread2 = new Thread(job);
		thread2.start();

		try
		{
			thread2.sleep(50);
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}


		System.out.println("method main running...");

	}

}