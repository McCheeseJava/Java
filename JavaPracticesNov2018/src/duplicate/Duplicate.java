package duplicate;

import java.util.Arrays;

public class Duplicate {

    public static void main(String args[]) {
        int arr[] = {5,5,2000, 1000, 9, 666, 1, 3, 3, 5, 405, 7, 99, 0, 9, 999,1,405};
        //Because one loop is nested inside the other, the combined performance is O(N × N) = O(N2).
        // BIG O https://www.youtube.com/watch?v=V6mKVRU1evU

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) 
            for (int j = i + 1; j < arr.length-1; j++)                
                if (arr[i] == arr[j] && i != j) 
                    System.out.println("duplicate value: " + arr[j]);;
                    
        
        
    }

}
