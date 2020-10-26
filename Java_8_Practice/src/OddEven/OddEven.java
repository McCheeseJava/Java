public class OddEven {
    public void categorizeArr (int arr[]){
        int arrOdd[] = new int[arr.length];
        int arrEven[] = new int[arr.length];

        for (int i=0; i <arr.length; i++){
            if ((arr[i] % 2) == 0){
                arrEven[i] = arr[i];
            }
            else {
                arrOdd[i]  = arr[i];
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print("Even Array: " + arrEven[i] + " ");
        }
        System.out.println();

        for (int i=0; i<arr.length; i++){
            System.out.print("Odd  Array: " + arrOdd[i] + " ");
        }
    }

    public static void main (String args[]){
        int myArr[] = new int[]{1, 5, 6, 8, 10};
        new OddEven().categorizeArr(myArr);
    }
}
