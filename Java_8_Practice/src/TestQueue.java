import java.util.*;
import java.util.LinkedList;

public class TestQueue {
    public static void main(String args[]) {
        Queue<String> products = new ArrayDeque<String>();
        products = new LinkedList<String>();
        products.add("p1");
        products.add("p2");
        products.add("p3");
        System.out.print(products.peek());
        System.out.print(products.poll());
        System.out.println("");
        products.forEach(s -> System.out.print(s));


    }

}
