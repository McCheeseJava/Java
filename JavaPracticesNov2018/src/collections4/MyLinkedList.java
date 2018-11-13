package collections4;
import java.util.*;

public class MyLinkedList{

	LinkedList <String> a = new LinkedList<String>();

	public void testLinkedList(){

		/*
		If you need to support random access, without inserting or removing elements from any
		place other than the end, than ArrayList offers the optimal collection.
		If, however, you need to frequently add and remove elements from the middle of the list
		and only access the list elements sequentially then LinkedList offers the better implementation.

		Another words don't use LinkedLists for random access. This will take lots of memory.
		Use LikedList when you access your lists' elements sequentially.

		*/



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

		MyLinkedList obj = new MyLinkedList();
		obj.testLinkedList();

	}


}