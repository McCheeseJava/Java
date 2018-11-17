package timee;
public class Time {

  private int hr;
  private int min;
  private int sec;
  private char def;

  public Time(int hr, int min, int sec, char def)
  {
     this.hr   = hr;
     this.min  = min;
     this.sec  = sec;
     this.def  = def;
  }

  public void getMilTime()
  {
     if (def == 'a')
        System.out.println("\nThe Military Time is:  " + hr + ":" + min + ":" + sec);
     else 
     {
            if (hr < 12) {
            hr = hr + 12;
            System.out.println("\nThe Military Time is:  " + hr + ":" + min + ":" + sec);
            } 
            
            if (hr == 12) {
            hr = hr - hr;
            System.out.println("\nThe Military Time is:  " + hr + ":" + min + ":" + sec);
            } 
      }

   }// getMilTime

} // Time
