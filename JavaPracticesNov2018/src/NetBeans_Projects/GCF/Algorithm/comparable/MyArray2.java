/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparable;

import java.util.Arrays;

public class MyArray2 implements Comparable<String> {

    public int compareTo(String c) {
        //return this.a.compareTo(c);
        return 1;
    }

    public static void main(String[] args) {
        String arr[] = {"thomas", "jones", "pete", "harry", "bob", "zaki"};
        Arrays.sort(arr);
        for (String e : arr) {
            System.out.println(e);
        }

    }
}
