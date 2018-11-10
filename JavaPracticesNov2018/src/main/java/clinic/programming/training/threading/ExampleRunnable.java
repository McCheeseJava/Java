package clinic.programming.training.threading;

public class ExampleRunnable implements Runnable {
	// private static int i = 0; //A static variable is common to all the instances (or objects) of the class
	// private int i; //data shared amongst threads
	// private volatile int i = 0; // thread-safe

	//data is accessed one thread at a time with a synchronized method. 
	//other threads are queued 
	 public synchronized void print() { 
		int i = 0; //each thread gets its own copy of i (data not shared)
		for (i = 0; i < 5; i++) {
			try {
				//System.out.println(i instanceof Object);
				Thread.sleep(1000);
				System.out.println("i: " + i + " " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void run() {
        print();
	}

	public static void main(String[] args) {
		ExampleRunnable r1 = new ExampleRunnable();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r1);
		Thread t5 = new Thread(r1);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
