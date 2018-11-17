package opoverloading;
import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        
        //percentage in Dec = x .  (y/100.0)
        
        double tipDec = mealCost * (tipPercent/100.0);
        double taxDec = mealCost * (taxPercent/100.0);
        // Write your calculation code here.
      
        // cast the result of the rounding operation to an int and save it as totalCost 
       // int totalCost = (int) Math.round(/*numberToRoundHere*/);
       
        System.out.println(      (int) Math.round(mealCost  + tipDec +    taxDec)        );
      
        // Print your result
    }
}