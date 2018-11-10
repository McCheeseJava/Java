//extract numbers from a String using a linkedlist
import java.util.*;

public class Test5 {

    public static void main(String[] args) {

        String s = "abc123gh3ft4";
        String d = "";
        int total = 0;
        List<Integer> num = new ArrayList<>();
        /* I can't do the following if num is of type ArrayList and not List:
                   num = new LinkedList<>();
      If I declare List<Integer> num = new ArrayList<>();
                    then I can point num to a new LinkedList:
                                       num = new LinkedList<>();
        "Every ArrayList is a List, but not every list is an ArrayList."  */
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                d = d + s.charAt(i);
               // System.out.println(s.charAt(i));
                            System.out.println("from first if: "+d);

                //System.out.println(d);
            } else if (!d.isEmpty()) {
                
                num.add(Integer.parseInt(d));
                d = "";
            }
        }
        if (!d.isEmpty()) {
            System.out.println("from second if: "+d);
            num.add(Integer.parseInt(d));
            d = "";
        }

        for (Integer j : num) {
            total = total + j;

        }
        System.out.println(total);

    }
}
