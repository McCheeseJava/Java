import java.util.*;

public class Test{

	public static void main(String args[]){

		LinkedList <String> mylist = new LinkedList <String>();
		mylist.addFirst("tom");
		mylist.addFirst("john");
		String str = mylist.getFirst();

		System.out.println(str);
	}

}