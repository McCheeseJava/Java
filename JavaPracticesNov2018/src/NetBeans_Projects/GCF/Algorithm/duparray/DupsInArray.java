/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duparray;

/**
 *
 * @author admin
 */
public class DupsInArray {

    public static void main(String[] args) {
        int arr[] = {2000, 1000, 9, 666, 1, 3, 5, 405, 7, 99, 0, 9, 3,999};
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == arr[i+1])
                System.out.println("found a duplicate: " + arr[i]);

        }

    }

}
