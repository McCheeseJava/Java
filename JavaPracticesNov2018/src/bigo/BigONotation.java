package bigo;

public class BigONotation {

    private int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    BigONotation(int size) {
        arraySize = size;
        theArray = new int[size];
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 1000000000) + 10;
        }
        itemsInArray = arraySize - 1;
    }

    public static void main(String[] args) {

        BigONotation testAlgo5 = new BigONotation(40000000);
        startTime = System.currentTimeMillis();
        testAlgo5.generateRandomArray();
        endTime = System.currentTimeMillis();
        System.out.println("Size of the array " + testAlgo5.arraySize + " took " + (endTime - startTime) + " to create " + testAlgo5.theArray[0]);

        startTime = System.currentTimeMillis();
        testAlgo5.linearSearchForValue(9251384);
        endTime = System.currentTimeMillis();
        System.out.println("linearSearchForValue Took " + (endTime - startTime));
    }

    public void linearSearchForValue(int value) {

        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                System.out.println("Value Found: " + theArray[i]);
                break;
            }
        }
        if (valueInArray == false) {
            System.out.println(value + " Not Found");
        } 
    }

}
