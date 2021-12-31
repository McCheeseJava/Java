import java.util.Arrays;

public class Permutation {

    public boolean permutation (String a, String b){
        int length1 = a.length();
        int length2 = b.length();

        if (length1 != length2){
            return false;
        }
        else{
            char arr1[] = a.toCharArray();
            char arr2[] = b.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i=0; i<length1; i++){
                if (arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String myString  = args[0];
        String myString2 = args[1];
        if (new Permutation().permutation(myString, myString2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

}
