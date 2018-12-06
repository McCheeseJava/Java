package linkedlist;
import java.util.Scanner;

public class Solution {
    
    static Node head  = null;  //pointer to head
    private static Node start = null; //pointer to start
    private static Node p     = null;  //pointer to current node
    private static Scanner sc = new Scanner(System.in);
    
    public static Node insert(Node head, int num) {
        p = new Node(num);  //p is a pointer to a current data. Data is set by user input.
        
        if (head == null) {
            head = p;
            System.out.println("from insert head is: " + head.data); //if head is not pointing to anything then make head point to current pointer
        } else if (head.next == null) {
            head.next = p;  //if head is not null but head.next is null, then point head.next also to current pointer
            System.out.println("from insert head is: " + head.data);
        } else {
            start = head;    //if there is a head and there is a next point start to head
              System.out.println("from insert start is : " + start.data);
            while (start.next != null) {   // while start.next isn't pointing to anything
                System.out.println("from insert-while. start.data: " + start.data);
                start = start.next;
                 System.out.println("from insert-while. after calling start.next, start.data: " + start.data);

            }
            start.next = p;
        }
        return head;
    }

    public static void display(Node head) {
        start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
    
    public static Node removeDuplicates(Node head) {
        return new Node(5);
    }

    public static void main(String args[]) {        
        int T = sc.nextInt();
        while (T-- > 0) {   //while T is greater than 0
            int ele = sc.nextInt();
            head = insert(head, ele);
            System.out.println("from while loop inside main");
        }
       //head = removeDuplicates(head);
        display(head);
    }
}