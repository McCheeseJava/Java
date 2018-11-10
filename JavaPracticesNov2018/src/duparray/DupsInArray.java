package duparray;
import java.util.HashSet;
public class DupsInArray {
    public static void main(String[] args) {
        Integer arr[] = new Integer[15];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9);
            System.out.print(arr[i] + " ");
        }
        
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println("Duplicate Element is : " + arr[i]);
            }
        }
    }

}
