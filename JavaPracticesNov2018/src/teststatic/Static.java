package teststatic;

public class Static {
	
	protected static int i = 0;
	
    public static void main(String[] args) throws Exception {
        m1(); //Line 3
        double [] arr = new double[2]; //Line 3
        System.out.println(arr[0]); //Line 4
    }

    private static void m1() throws Exception { //Line 6
        i = 5;
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
        System.out.println("value of i: " + i);
        test.print();
        
    }
    
}

class test{
	public static void print() {
		//A static variable value is common to all the instances (or objects) of the class
		System.out.println("value of i: " + Static.i); 
	}
}