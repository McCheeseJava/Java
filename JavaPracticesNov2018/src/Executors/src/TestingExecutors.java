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
        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(50);
        for (int i = 0; i < 10; i++){
            //new Thread(new TestingExecutors()).start();
            service.execute(new TestingExecutors());
        }
        service.shutdown();
    }
}
