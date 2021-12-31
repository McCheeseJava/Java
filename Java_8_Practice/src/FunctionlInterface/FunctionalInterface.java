@FunctionalInterface
public interface FunctionalInterface<E> {
    /*public void method1() {
        System.out.println("method1");
    }*/
    public default void method2() {
        System.out.println("method2");
    }
    public static void method3() {
        System.out.println("method3");
    }
    public abstract void method4();

    public default void method6() {
        System.out.println("method2");
    }
    public int divisorSum(int n);
}
