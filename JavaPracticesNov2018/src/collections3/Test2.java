package collections3;
import java.util.*;

class Test2

{
        public static void main(String args[])
        {
                String a[] = {"john", "jay", "tom", "harry"};
                int    b[] = { 43   ,  45  ,  49  ,  55    };

                HashMap <String, Integer> hmap = new HashMap<String, Integer>();
                hmap.put(a[0], b[0]);

                System.out.println( hmap.get(a[0]) );


        }

}
