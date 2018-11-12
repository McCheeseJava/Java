public class Producer implements Runnable
{
	MyStack pushObj;
	
	Producer(MyStack o)
	{
		pushObj = o;
	}
 
	public void run()
	{
		char c;
		for (int i = 0; i < MyStack.MAX; i++)
		{
			c = (char) (Math.random()*26+'A');
			pushObj.push(c);
	
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
