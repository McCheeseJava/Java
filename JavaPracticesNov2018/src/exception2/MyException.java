package exception2;
 import java.io.*;

 class Exc1 extends Exception{ }
 class Exc2 extends Exception { }

 public class MyException 
 {
     static void a() throws Exc1
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

     static void b() throws Exc1, Exc2 {
        throw new Exc2();
       }

    public static void main (String args[]) 
    {
       try
       {
           System.out.println( a() );
           b();
       } 
       catch(Exc1 e)
       {
           System.out.println("Caught1 ");
       }
       catch(Exc2 ex)
       {
       System.out.println("Caught2" );
       }
    }

}

/*
compiler error:

MyException.java:11: exception java.io.IOException is never thrown in body of corresponding try
statement
        catch(IOException e) 
        ^
1 error

*/

