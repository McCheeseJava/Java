package TreeSet;
import java.util.*;
public class TreeSetDemo {

   public static void main(String args[]) {
      TreeSet<String> ts = new TreeSet<>();   
      ts.add("KKKK")
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      ts.add("D");
      ts.add("k");
      ts.add("Z");
 
      System.out.println(ts);
      
     Iterator i = ts.iterator();
      while(i.hasNext()) {
          System.out.print(i.next() + " ");
      }

      
   }
}