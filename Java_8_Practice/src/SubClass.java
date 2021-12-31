class SuperClass {
    SuperClass(int x) {
        System.out.println("Super " + x);
    }
}

public class SubClass extends SuperClass {
    SubClass() {
        super(5);
        System.out.println("Sub 2");
    }
    public static void main(String args[]){
	new SubClass();
    }
}
