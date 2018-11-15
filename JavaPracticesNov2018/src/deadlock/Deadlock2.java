package deadlock;
public class Deadlock2 {
       
        public synchronized void bow(Deadlock2 a) {
            
        	System.out.println(Thread.currentThread().getName());
        	a.bowBack(this);
        }
        public synchronized void bowBack(Deadlock2 a) {
           
        	System.out.println(Thread.currentThread().getName());
        	a.bow(this);
        }

    public static void main(String[] args) {
       
        Deadlock2 o  = new Deadlock2();
        Deadlock2 o2 = new Deadlock2();
        
        new Thread(new Runnable() {
            public void run() { o2.bow(o); }
        }).start();
        new Thread(new Runnable() {
            public void run() { o.bow(o2); }
        }).start();
    }
}
