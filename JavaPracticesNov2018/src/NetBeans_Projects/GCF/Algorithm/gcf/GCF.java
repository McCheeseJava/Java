package gcf;
public class GCF {

    public static void main(String[] args) {
        int A = 1222;
        int B = 1024;
        
        int a = A;
        int b = B;
        int r = 0;
        int ctr = 1;
            
        while (b != 0)
        {
            System.out.println("b= " + b + " a= " + a);
            System.out.println(a + " % " + b + " = " + r);
            r = a % b;

            System.out.println("b= " + b + " a= " + a);
            a = b;
            System.out.println("b= " + b + " a= " + a);

            System.out.println("b= " + b + " r= " + r);
            b = r;
            System.out.println("b= " + b + " r= " + r);
            
            System.out.println("counter " + ctr++ + "\n");
        }
        
        System.out.println("GCF of " + A + " and " + B + " = " + a);      
        
        //This algorithm examines each of the N items in the array once, so it has O(N) performance.

           
    }
    
}
