package threading2;
class X {
   static class Worker extends java.lang.Thread {
     public void run() {
       synchronized(this) {
         try {
         notify();
           wait();
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
