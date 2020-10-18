import java.util.concurrent.*;

public class SquareCalculator implements Callable  {    
    
    private ExecutorService executor 
      = Executors.newSingleThreadExecutor();
    
    public Integer call() throws InterruptedException {
            Thread.sleep(1000);
            return 5*5;
    }

    public static void main (String args[]){
        ExecutorService service = Executors.newSingleThreadExecutor();
        //ExecutorService service = Executors.newFixedThreadPool(50);
        Future<Integer>  future = service.submit(new SquareCalculator());
        try {
          System.out.println("I get: " + future.get());
        }
        catch (Exception e){
          e.printStackTrace();
        }
        service.shutdown();
   }
}
