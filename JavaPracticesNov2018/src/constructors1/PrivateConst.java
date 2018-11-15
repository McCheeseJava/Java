package constructors1;
class Worker extends java.lang.Thread {
    private Worker() {
      this.start();
    }
    public void run() {
      System.out.println( "working" );
    }

    public static void main( String[] args ) {
     new Worker();
   }
 }