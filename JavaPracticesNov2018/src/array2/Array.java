package array2;
public class Array
{
   private int arr[][] = {  {1,2}  ,  {3,4} ,  {5,6}  }; //3 Rows 2 Clmns
   private boolean ar2[][] = new boolean[4][4]; // 4 Rows 4 Columns

   public void func()
   {
     System.out.println(arr.length);
   
     System.out.println(arr[0][0]);
     System.out.println(arr[0][1]);
     System.out.println(arr[1][0]);
     System.out.println(arr[1][1]);
     System.out.println(arr[2][0]);
     System.out.println(arr[2][1]);

   }


   public void func2()
   {
     int i;
     int j;

     for (i = 0; i < ar2.length; i++)
     {
        for (j = 0; j < ar2.length; j++)
           System.out.println(ar2[i][j]);
     }

    } 
   
   public static void main(String args[])
   {

      Array obj = new Array();
      obj.func();
      obj.func2();
   }

}
