package List;

import java.util.*;

public class MyArrayList {

    private static List mylist = new ArrayList(); //if you add generics here you will limit the list to only one type
    private static List<ArrayList> myGList = new ArrayList<>();
    private static List<String> myStrList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            mylist.add((int) (Math.random() * 19));
            mylist.add("test");
            mylist.add(.5);
            mylist.add(new MyArrayList());
            
            myGList.add(new ArrayList());
            myStrList.add("test");

            if (mylist.get(i) instanceof MyArrayList) {
                System.out.println(mylist.indexOf(i));
            }
        }
        System.out.println("Here is the Random List: " + mylist);

    }
}
