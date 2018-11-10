/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Test2 {
    public static void main(String[] args) {
        String a = "abc123gh3ft4";
        char c[] = a.toCharArray();
        System.out.println(c);
        int total = 0;
        for (int i =0; i<c.length; i++)
        {
            System.out.println(c[i]);
            if (Character.isDigit(c[i]))
                total = c[i] + total;
        }
        System.out.println(total);
    
    }
}
