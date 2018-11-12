package string2;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	// immutable = not changeable

	public static void main(String args[]) {
		int i = 5;
		String s = "Java";
		s = "C++"; // reference is changeable
        String t = s;
		//System.out.println("s : " + s);
		//System.out.println("t : " + t);
		
		s.concat(" SE 6"); // object is immutable
		//System.out.println("s after concat: " + s);
		//System.out.println("Java".concat(" SE 6")); //STRING WAS CHANGED HERE? NO IMMUTABILITY??
		//System.out.println("Java".concat(" SE 8"));

		String k = new String("JAVA");
		k.concat(" SE 6"); // immutable
		//System.out.println("k: " + k);
		//System.out.println("k in lowercase: " + k.toLowerCase()); //STRING WAS CHANGED HERE? NO IMMUTABILITY??
		

		//int a[] = new int[-2];
		//System.out.println(Double.valueOf("120D"));
		//System.out.println(Integer.valueOf("808"));
		//System.out.println(LocalDate.now() + " " + LocalTime.now());

		//LocalDate date = LocalDate.of(2020, 9, 31);
		//System.out.println(date); //dateformatException

		String arr[] = new String[2];
		arr[0] = "1";
		arr[1] = "1";
		//System.out.println(arr[0] + arr[1]);
		
		

		// //System.out.println("Output is: " + 10 != 5);

		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(200);
		list.remove(3);

		//System.out.println(list);

		// Two StringBuilder objects are never equal
		StringBuilder str = new StringBuilder("java");
		StringBuilder sb  = new StringBuilder("java");
		//System.out.println(str.equals(sb) + ":" + sb.equals(str));

		//String str1 = new String("java");
		//String str2 = new String("java");
		String str1 = "C++";
		String str2 = "C++";
		//System.out.println(str1.equals(str2) + ":" + str2.equals(str1));

		int[] arr2 = { 2, 1, 0 };
		for (int j : arr2) {
			//System.out.println(arr2[j]);
		}
		
		for (int l=0; l < 3; l++) {
			//System.out.println(arr2[l]);
		}
		
		double price = 90000;
        String model = "";
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        //System.out.println(model);
        
        String string1 = new String("Core");
        String string2 = new String("CoRe");
        //System.out.println(string1 = string2);
        
        
        
		
	}
}
