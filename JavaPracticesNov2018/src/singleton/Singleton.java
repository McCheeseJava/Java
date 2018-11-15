package singleton;

/**
 *
 * @author  haroonn
 */
public class Singleton {
    private static Singleton instance = null;
    private String name;
    private static int i;

    public static Singleton getSingleton() {
        if (instance == null) {
        	instance = new Singleton();
        	return instance;
        }
        	
        else
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
        Singleton e = Singleton.getSingleton();

    }
}
