public class Producer implements Runnable
{
	private SyncTravel obj = new SyncTravel();
	private String str;
	
	public Producer(String str)
	{
		this.str = str;
	}

	public void run()
	{
			obj.talk(str);
			System.err.println("Producer: " + str);
			try
			{
				Thread.sleep( (int) (Math.random() * 300) );
			}
			catch (InterruptedException e) {}
		

	}

} 
