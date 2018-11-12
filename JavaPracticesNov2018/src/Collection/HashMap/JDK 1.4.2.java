import java.util.*;

class Test
{
        public static void main(String args[])
        {
                String a[] = {"john", "jay", "tom", "harry"};
                int    b[] = { 43   ,  45  ,  49  ,  55    };

                HashMap hmap = new HashMap();
                hmap.put(a[0], b[0]);

                System.out.println( hmap.get(a[0]) );


        }

}
