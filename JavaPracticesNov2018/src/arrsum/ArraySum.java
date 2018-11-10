package arrsum;
import java.util.HashSet;
public class ArraySum {
    private int total = 0;
    HashSet<Integer> set = new HashSet<>();

    public int getMinimumUniqueSum(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {          
               if ( set.add(arr[i]) == false )
                   System.out.print("\nfound a duplicate: " + arr[i]); 
        }
        return 0;
    }
    public static void main(String[] args) {
        Integer a[] = new Integer[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = (int)( Math.random() * 9);
            System.out.print(a[i] + " ");
        }
        ArraySum o = new ArraySum();
        System.out.println("\ntotal: " + o.getMinimumUniqueSum(a) );        
    }
}