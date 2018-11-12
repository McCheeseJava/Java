package exception2;
/*
 * T.java
 *
 * Created on January 27, 2004, 10:25 PM
 */

/**
 *
 * @author  Administrator
 */
public class T 
{
    
    public int f1()
    {
         System.out.println("Hi .. this is f1!");
         f2();
         return 0;
    }
    
    public int f2() throws ArrayIndexOutOfBoundsException
    {
        
        int i[] = { 0, 1, 2};
        System.out.println("Hi..this is f2! Here is my exeption:");
        System.out.println(i[3]);
        return 0;
    }    
    
    public static void main( String args[])
    {
        T o = new T();
         try{
             o.f1();
         }
         catch (Exception e)
         {}
         finally
         {
              System.out.println("Sorry folks!");
         }
        
    }   
        
    
    /** Creates a new instance of Class */
    public T()
    {
    }
    
}
