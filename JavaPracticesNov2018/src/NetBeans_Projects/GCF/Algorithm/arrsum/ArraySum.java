package arrsum;

public class ArraySum {

    public int getMinimumUniqueSum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    arr[i] = arr[i] + 1;
                    return total + arr[i];
                }
                else
                    return total + arr[i];
            }
        }
        return total;
    }
}
