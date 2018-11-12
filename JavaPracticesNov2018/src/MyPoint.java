public class MyPoint {
  public int x = 5;
  public int y = 8;

  public String toString() {
    return ("[" + x + "," + y + "]");
  }

  public static void main(String args[])
  {
	  MyPoint p = new MyPoint();
	  System.out.println(p.toString() );
  }
}

