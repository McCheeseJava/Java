package threading2Stack;
public class Test
{
	public static void main(String args[])
	{
		MyStack o = new MyStack();
		
		Producer push1 = new Producer(o);
		Thread thread1 = new Thread(push1);
		thread1.start();

		Producer push2 = new Producer(o);
                Thread thread2 = new Thread(push2);
                thread2.start();

		Consumer pop1 = new Consumer(o);
                Thread pthread1 = new Thread(pop1);
                pthread1.start();

		Consumer pop2 = new Consumer(o);
                Thread pthread2 = new Thread(pop2);
                pthread2.start();
	}

}
