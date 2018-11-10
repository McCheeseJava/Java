package comparable;
import java.util.Arrays;
public class MyArray  {

    private String a = "";  
    public static void main(String[] args) {
        String arr[] = {"thomas", "jones", "pete", "harry", "bob", "zaki"};
        Arrays.sort(arr);
        for (String e : arr) {
            System.out.println(e);
        }
    }
}
