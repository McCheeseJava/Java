import java.util.*;

public class SyncTravel
{
	private List comm = new ArrayList(10);

	public synchronized String listen()
	//use the listen method to listen to it
	{
		String c;

		while (comm.size() == 0) // while nothing has been spoken 
		{
			try
			{
				this.wait();
			}
			catch (InterruptedException e) {}
			
		}
		
		c = ( (String)comm.remove(comm.size()-1));

		return c;//let me listen to what you have to say.
		
	}

	public synchronized void talk(String chars) 
	//use the talk method to send your comments 
	{
		this.notify(); //inform the thread(s) that are waiting
			       //for something to be spoken that something
			       //is being spoken now

		String strObj = new String (chars);
		comm.add(strObj);//let me tell you something
 	}	

}
