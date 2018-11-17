package threading2;

 public class MyThread
 {

    public static void main( String[] args )
    {
		class T1 extends java.lang.Thread{}
		class T2 extends T1{}
		//class T3 implements java.lang.Runnable{}

		new T1().start();
		new T2().start();
		//new Thread(new T3()).start();
		System.out.println( "Executing" );

	}

 }