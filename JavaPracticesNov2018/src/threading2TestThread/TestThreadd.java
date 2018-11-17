package threading2TestThread;
public class TestThreadd
{
	public static void main(String args[])
	{
		Threadd thread1 = new Threadd();
		Threadd thread2 = new Threadd();
		Threadd thread3 = new Threadd();

		Thread  t1      = new Thread(thread1);
		Thread  t2      = new Thread(thread1);
		Thread  t3      = new Thread(thread1);
		

		t1.start();
                long time = (long) (Math.random()*100);
                System.err.println("t1 is sleeping for " + time);
		try
		{
			Thread.sleep(time);
		}
		catch (InterruptedException e){}

		if (t1.isAlive() == true )
                        System.err.println("t1 is Alive");
                else
                        System.err.println("t1 is Dead");


		t2.start();
		time = (long) (Math.random()*100);
		System.err.println("t2 is sleeping for " + time);
		try
                {
                        Thread.sleep(time);
                }
                catch (InterruptedException e){}
		if (t2.isAlive() == true )
                        System.err.println("t2 is Alive");
                else
                        System.err.println("t2 is Dead");



		t3.start();
		if (t3.isAlive() == true )
                        System.err.println("t3 is Alive");
                else
                        System.err.println("t3 is Dead");

	}

}
		
