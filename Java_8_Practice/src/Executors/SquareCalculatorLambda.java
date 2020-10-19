import java.util.concurrent.*;

public class SquareCalculatorLambda {    
    
    ExecutorService executor 
      = Executors.newSingleThreadExecutor();
    
    public Future<Integer> calculate(Integer input) {        
        return executor.submit(() -> {
            Thread.sleep(1);
            return input * input;
        });
    }

    public static void main (String args[]) throws Exception{
        Future<Integer> future = new SquareCalculatorLambda().calculate(10);
       /* while(!future.isDone()) {
          System.out.println("Calculating...");
          Thread.sleep(3);
        } */ 

        //Integer result = future.get(500, TimeUnit.MILLISECONDS);
        Integer result = future.get();
        System.out.println(result);
        //new SquareCalculatorLambda().executor.shutdown();
    }
 
}
