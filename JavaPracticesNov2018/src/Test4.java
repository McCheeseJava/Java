/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Test4 {

    public static void main(String[] args) {
        String a = "abc123gh3ft4";
        char c[] = a.toCharArray();
        int total[] = new int[20];
        int t = 0;
        for (int i = 0; i < c.length; i++) {
          //  System.out.println(c[i]);
            if (Character.isDigit(c[i])) {
                total[i] = Character.getNumericValue(c[i]);
            }
        }

        for (int i =0; i< total.length;i++)
            if (total[i] != 0)
            System.out.println(total[i]);
        

    }
}
