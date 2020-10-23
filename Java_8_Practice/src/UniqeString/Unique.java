import java.util.*;

public class Unique {
    public static void main(String args[]) {

        String tempChar = args[0];
        Set<Character> chars = new HashSet<>();
        boolean unique = false;

        for (Character a : tempChar.toCharArray()) {
            if (!chars.add(a)) {
                System.out.println("String doesn't have unique characters");
            }
        }



       Unique o = new Unique();
       if (o.uniqueCharacters(tempChar)){
           System.out.println("true");
       }
       else {
           System.out.println("false");
       }
    }

    public boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;

        // If no duplicate characters encountered,
        // return true
        return true;
    }
}
