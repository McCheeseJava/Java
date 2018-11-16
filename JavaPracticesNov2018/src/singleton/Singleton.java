package singleton;
public class Singleton {
    private static Singleton instance = null;
    public static Singleton getSingleton() {
        if (instance == null) {
        	instance = new Singleton();
            System.out.println("New instance created! ");
        	return instance;
        }
        else {
            System.out.println("returning existing instance! ");
            return instance;
        }
    }

    private Singleton() {
    }   
}