package generics;
public class TestNumericFns {
    public static void main(String[] args) {
        int NUM = 50;
        NumericFns<Long> o = new NumericFns<>(5L);
        System.out.println("reciprocal of " + o.getNum() + " is: " + o.reciprocal());
        System.out.println("fraction of " + o.getNum() + " is: " + o.fraction());
        
        NumericFns<Integer> o2 = new NumericFns<>(NUM);
        System.out.println("\nreciprocal of " + o2.getNum() + " is: " + o2.reciprocal());
        System.out.println("fraction of " + o2.getNum() + " is: " + o2.fraction());
       
        NumericFns<Double> o3 = new NumericFns<>(50.0);
        System.out.println("\nreciprocal of " + o3.getNum() + " is: " + o3.reciprocal());
        System.out.println("fraction of " + o3.getNum() + " is: " + o3.fraction());
        
        System.out.println("comparing integer values of " + o.getNum() + " and " + o3.getNum() + " is: " + o.equalTest(o3));
    }
    
}
