public class Consumer implements Runnable
{
	private MyStack popObj;
	
	Consumer(MyStack o)
	{
		popObj = o;
	} 
 
	public void run()
	{
		for (int i = 0; i < MyStack.MAX; i++)
		{
			popObj.pop(); 

			try
			{
				Thread.sleep(1);
			}
			catch (InterruptedException e)
			{
				e.getMessage();
			}
		}

		
	}

}			
