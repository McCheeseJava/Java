package collections3;
import java.util.*;

public class MyHashMap{

	Map <String, Integer> a = new HashMap<String, Integer>();

	public void testMethod(){

		a.put("key1", new Integer("1"));
		a.put("key2", new Integer("2"));
		a.put("key3", new Integer("3"));
		a.put("key4", new Integer("4"));
		a.put("key5", new Integer("5"));

		Iterator it = a.keySet().iterator();

		while (it.hasNext()){

			String key = (String)it.next();
		    Integer value = a.get(key);
		    System.out.println(key + " has a value of " + value);
		}

		Iterator itt = a.values().iterator();
		while (itt.hasNext()){

					Integer value = (Integer)itt.next();
					 System.out.println("values are: " + value);
		}


		System.out.println(a);

		/*  every time you override equals() method make sure to override hashCode() as well.
		  when not to override equals():

		  1)  your class design doesn't care about the logical equivalence of two instance of its objects
		  2)  a higher class in your class heighrcy has overriden equals
		  3)  each instance of your class object is unique by desing

		  when you override equals watch out for the following:

		  1) a.equals(a) must return true
		  2) if b.equals(a), then this must also be true a.equals(b)

		  It is reflexive: For any reference value x, x.equals(x) must return true.
		  n It is symmetric: For any reference values x and y, x.equals(y) must return
		  true if and only if y.equals(x) returns true.
		  n It is transitive: For any reference values x, y, and z, if x.equals(y) returns
		  true and y.equals(z) returns true, then x.equals(z) must return true.
		  n It is consistent: For any reference values x and y, multiple invocations of
		  x.equals(y) consistently return true or consistently return false, provided
		  no information used in equals comparisons on the object is modified.
          For any non-null reference value x, x.equals(null) must return false.


          */

          /*  if a.equals(b) == true then   a.hashCode must be equal to b.hashCode() */




	}


	public static void main(String args[]){

		MyHashMap o = new MyHashMap();
		o.testMethod();
	}
}