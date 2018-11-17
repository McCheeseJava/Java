package test;
public class Test
{
  private int k = 5;
  final int SIZE = 5;
  private boolean arr[] = new boolean[SIZE];
  private int i;
  /** Hello how are you test javadoc  */
  public void prt()
  {
        this.k = 9;
	System.out.println(this.k);
        for (i = 0; i < SIZE; i++)
            System.out.println(arr[i]);
  }

  public static void main(String[] args)
  {
    String str = "My string is here!";
    boolean var3 = true;
    System.out.println("Hello World!"+ "\n" + str);
    System.out.println('a');

    String str2 = str;

    System.out.println("Hello World!"+ "\n" + str2);
    Test obj = new Test();
    obj.prt();
  }

}
