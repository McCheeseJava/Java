import java.util.concurrent.*;
import java.lang.Thread.*;

import static java.lang.Thread.sleep;

public class TestingExecutors implements Runnable{
    public void run() {
        try {
            synchronized ("Test"){
                System.out.println("I am in thread " + Thread.currentThread().getName());
                System.out.println("sleep for 1 seconds...");
                sleep (1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main (String args[]){
        // Test Executors with a single thread. It will create a thread Q and threads will wait for their turn.
        //ExecutorService service = Executors.newSingleThreadExecutor();
        
        //Create a thread pool so they can be reused
        ExecutorService service = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 10; i++){
            //new Thread(new TestingExecutors()).start();
            service.execute(new TestingExecutors());
        }
        service.shutdown();
    }
}
