
/**
 *
 * @author  haroonn
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private String name;
    private static int i;

    public static Singleton getSingleton() {
        return instance;
    }

    /** Creates a new instance of Singleton */
    private Singleton() {
        i++;
        System.out.println(i + " instance created! ");
    }

    public static void main (String args[]) {
        Singleton c = Singleton.getSingleton();
        Singleton d = Singleton.getSingleton();
    }
}
