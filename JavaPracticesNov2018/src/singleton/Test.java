package singleton;

class Test {
	public static void main (String args[]) {
        Singleton c = Singleton.getSingleton();
        Singleton d = Singleton.getSingleton();
        Singleton e = Singleton.getSingleton();   
        //Singleton f = new Singleton();
    } 
}
