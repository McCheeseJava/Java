package exception2;
 public class MyException2 
 {
     public static void main(String args[])
     {
	System.out.println(a());
     }

     static String a()
     {

        try 
	{
	
            System.out.print("Try ");
	    return "hi";
        }
        catch(Exception e)
        {
           System.out.print("Catch ");
        }
      	finally 
	{
           System.out.println("Finally ");
        }
     }

}
