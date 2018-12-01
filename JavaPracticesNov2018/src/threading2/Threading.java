package threading2;
class X {
   static class Worker extends java.lang.Thread {
     @Override
	public void run() {
       synchronized(this) {
         try {
         notify(); //i'm done you guys do your work now
           wait(); //i'm waiting for execution time notify me when you're done
         } catch (Exception e) {}
       }
    }
  }
 public static void main( String[] args ) {
   while (true) {
     new Worker().start();
   }
 }
}
