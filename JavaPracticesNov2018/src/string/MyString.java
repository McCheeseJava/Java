/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class MyString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println (a.substring(0, 3) );
        
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println(age);
    }
    
}
