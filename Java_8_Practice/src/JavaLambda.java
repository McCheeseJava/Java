import java.util.*;
public class JavaLambda {
    public static void main(String args[]){
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.forEach(item -> System.out.println(item * item));
    }


}
