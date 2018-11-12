public class Consumer implements Runnable
{
	private SyncTravel obj2 = new SyncTravel();

	public void run()
	{
		String str;
		str = obj2.listen();
		System.err.println("Consumer: " + str );
		try
		{
			Thread.sleep( (int) (Math.random() * 300) );
		}
		catch (InterruptedException e) {}

	}


}	
