package stairs;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Stdin {

     public static void main(String args[])
        throws IOException
    {
        int ch;
        int arr[] = new int[6];
        while ((ch = System.in.read()) != 'n')
        {
                for (int i =0; i<arr.length; i++)
                     arr[i] = ch;
           
        }
        for (int i=0; i<arr.length; i++)
            System.out.println(arr[i]);
    }
}