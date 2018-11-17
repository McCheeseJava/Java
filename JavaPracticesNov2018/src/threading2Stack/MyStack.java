package threading2Stack;
public class MyStack
{
	public static final int MAX = 10; 
	private int idx = 0;
	private char data[] = new char[MAX];

	public synchronized void push(char c)
	{
		while (idx >= MAX-1)
		{
			try
			{
				System.out.println("push method is waiting. stack is full!");
                                this.wait();
			}

			catch(InterruptedException e)
                        {
                                System.out.println("exception caught in push method");
                        }

			finally
			{
				System.out.println("push  method has finished waiting.");
			}

		}

		this.notify();
		data[idx] = c;
		System.out.println("pushing: " + c);
		idx++;
	}

	public synchronized char pop()
	{
		while (idx == 0)
		{
			try
			{
				System.out.println("pop method is waiting for data to arrive");
				this.wait();
			}
			catch(InterruptedException e)
			{
				System.out.println("exception caught in pop method");	
			}

			finally
			{

				System.out.println("pop method has finished waiting...");
			}

		}

		idx--; //wake up push() that the stack size is < 199
		System.out.println("popping: " + data[idx]);
		return data[idx];

	}

}

 
