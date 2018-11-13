package collections2;
import java.util.*;


public class MyArrayList {

	ArrayList <String> a = new ArrayList <>();

	public void testArrayList(){
		a.add("Haroon");
		a.add("Steve");
		a.add("Mike");
		a.add("Kevin");

		System.out.println(a.contains("Haroon"));
		System.out.println(a.size());
		System.out.println(a.get(2));

		a.add(0, "Terry");
		a.add(5, "David");

		for (int i = 0; i < a.size(); i++)
			System.out.println(a.get(i));



	}

	public static void main(String args[]){

		MyArrayList obj = new MyArrayList();
		obj.testArrayList();
	}


}


