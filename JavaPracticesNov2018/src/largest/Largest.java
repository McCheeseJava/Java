package largest;
import java.util.Arrays;

public class Largest {

    public static void main(String[] args) {
        double arr[] = new double[16];
        double largest = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random() * 200);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest Number in array using my algo: " + largest);                
        for (int i = 0; i < arr.length; i++) {
            largest = Double.max(arr[i], largest);
        }
        System.out.println("Largest Number in array using Double.max algo: " + largest);
        
        Arrays.sort(arr);
        for (double e : arr) {
            System.out.println(e);
        }
        Integer r = new Integer(5);
     
    }

}
