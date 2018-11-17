package string;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	// immutable = not changeable

	public static void main(MyString2 args[]) {
		int i = 5;
		MyString2 s = "Java";
		s = "C++"; // reference is changeable
        MyString2 t = s;
		//System.out.println("s : " + s);
		//System.out.println("t : " + t);
		
		s.concat(" SE 6"); // object is immutable
		//System.out.println("s after concat: " + s);
		//System.out.println("Java".concat(" SE 6")); //STRING WAS CHANGED HERE? NO IMMUTABILITY??
		//System.out.println("Java".concat(" SE 8"));

		MyString2 k = new MyString2("JAVA");
		k.concat(" SE 6"); // immutable
		//System.out.println("k: " + k);
		//System.out.println("k in lowercase: " + k.toLowerCase()); //STRING WAS CHANGED HERE? NO IMMUTABILITY??
		

		//int a[] = new int[-2];
		//System.out.println(Double.valueOf("120D"));
		//System.out.println(Integer.valueOf("808"));
		//System.out.println(LocalDate.now() + " " + LocalTime.now());

		//LocalDate date = LocalDate.of(2020, 9, 31);
		//System.out.println(date); //dateformatException

		MyString2 arr[] = new MyString2[2];
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
		MyString2 str1 = "C++";
		MyString2 str2 = "C++";
		//System.out.println(str1.equals(str2) + ":" + str2.equals(str1));

		int[] arr2 = { 2, 1, 0 };
		for (int j : arr2) {
			//System.out.println(arr2[j]);
		}
		
		for (int l=0; l < 3; l++) {
			//System.out.println(arr2[l]);
		}
		
		double price = 90000;
        MyString2 model = "";
        if(price > 100000) {
            model = "Tesla Model X";
        } else if(price <= 100000) {
            model = "Tesla Model S";
        }
        //System.out.println(model);
        
        MyString2 string1 = new MyString2("Core");
        MyString2 string2 = new MyString2("CoRe");
        //System.out.println(string1 = string2);
        
        
        
		
	}
}
