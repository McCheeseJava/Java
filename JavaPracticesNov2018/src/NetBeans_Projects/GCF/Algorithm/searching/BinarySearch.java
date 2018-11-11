package searching;

public class BinarySearch {

    public static void main(String[] args) {
        int SIZE = 5;
        final int ITEM = 4;
        int MIN = 0;
        int MAX = SIZE - 1;
        int MID = 0;
        //array declared and initialized
        int arr[] = new int[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }   
        while (MIN <= MAX) {
            MID = (MAX - MIN) / 2;
            if (ITEM == arr[MID]) {
                System.out.println("Item found: " + arr[MID]);
                MIN = MAX + 1;
            } else if (ITEM < arr[MID]) {
                MAX = MID - 1;
            } else if (ITEM  > arr[MID]) {
                MIN = MID + 1;
            }            
            else{
                System.out.println("Item " + ITEM + " not found.");
            }
                
        }
    }
}
