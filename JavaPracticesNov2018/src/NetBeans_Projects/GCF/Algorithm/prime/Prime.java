package prime;
import java.util.ArrayList;
import java.util.List;
public class Prime {

    public static void main(String[] args) {
        int num = 660000000;
        int cfactor = 2;
        int sqrt = (int) Math.sqrt(204.0);
        List<Integer> factors = new ArrayList<Integer>();
        
        long startTime = System.currentTimeMillis();

        while (cfactor <= sqrt) //cfactor == 2 sqrt = 14
        {
            while (num % cfactor == 0) //If num (102) is divisible by factor of 2 then add 2 to the list again                                      
            {
                factors.add(cfactor);  //added the current factor 2 to list
                num = num / cfactor;  //divide 204 by the curent factor 2 and go to the beginning of the inner while loop      num ==> 102  num = 204 / 2; 102/2 = 51
            }
            cfactor++;  //since 51 is not divisible by 2 go to next factor       
        }
        
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        
        System.out.println(totalTime);
        for (int i = 0; i < factors.size(); i++) 
            System.out.print ( " " + factors.get(i) + " " );
        
        System.out.print(" " + num + " ");
   }

}
