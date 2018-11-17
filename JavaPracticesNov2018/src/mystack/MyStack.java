package mystack;
import java.util.*;

public class MyStack{
	public static void main(String args[]){

		Stack <String> myStack = new Stack<String>();
		String name[] = new String[10];

		myStack.push("plate1");
		myStack.push("plate2");
		myStack.push("plate3");
		myStack.push("plate4");

		System.out.println("size of this stack is: " + myStack.size() );

		for (int i=0; i < myStack.size()+4; i++){

			name[i] = myStack.pop();
			System.out.println(name[i]);
		}
		while (true) {;}


	}

}