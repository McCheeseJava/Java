package integer;

public class MyInteger {

    public static void main(String[] args) {
        try {
            int ints = Integer.parseInt("1059");
            String str = String.valueOf(1059);
            System.out.println(ints);
            System.out.println(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " generated a NumberFormatException! \nPlease only enter digits.");
        } finally {
            System.out.println("All good here.");
        }

    }
}
