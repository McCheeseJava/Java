package stairs;


import java.io.*;
import java.util.*;

public class Stairs {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int num  = Integer.parseInt(sc.nextLine());
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
                if ( i < num - j)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println("");
        }
        
    }
}