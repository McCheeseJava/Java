package exception2;
/*
 * T2.java
 *
 * Created on January 27, 2004, 10:25 PM
 */

/**
 *
 * @author  Administrator
 */
public class T2 
{
    
    public int f1()
    {
         System.out.println("Hi .. this is f1!");
         return 0;
    }
    
    public void f2() throws HaroonsDamnException
    {
        System.out.println("Hi..this is f2! Here is my exeption:");        
        throw new HaroonsDamnException ("it cored big time..program crashed*&^(*%@(#");
    }    
    
    public static void main( String args[])
    {
         T2 o = new T2();
         try
         {
             o.f2();
         }
         catch (HaroonsDamnException e)
         {
             System.out.println ( e.getMessage() + e.getCause() + e.getStackTrace() );
         }
         finally
         {
              System.out.println("Sorry folks!");
         }
        
    }   
        
    
    /** Creates a new instance of Class */
    public T2()
    {
    }
    
}
