package singleton;
public class Singleton {
    
	//3
	private static Singleton instance = null;
    
    //2
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

    //1
    private Singleton() {
    }   
}