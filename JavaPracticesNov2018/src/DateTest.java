import java.text.*;
import java.util.*;

public class DateTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        DateFormat fmt = DateFormat.getDateInstance();

        //c.add(Calendar.DAY_OF_MONTH, -1); //back one
        //System.out.println(fmt.format(c.getTime()));

        System.out.println(c.get(Calendar.DAY_OF_WEEK));

    }
}
