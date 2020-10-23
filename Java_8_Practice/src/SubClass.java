class SuperClass {
    SuperClass(int x) {
        System.out.println("Super");
    }
}

public class SubClass extends SuperClass {
    SubClass() {
        super(5);
        System.out.println("Sub 2");
    }
}