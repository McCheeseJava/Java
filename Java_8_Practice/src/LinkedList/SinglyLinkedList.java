import java.util.*;
class Node {
    public int data;
    public Node next;
    public void displayNodeData() {
        System.out.print(data + " ");
    }
}

public class SinglyLinkedList {
    private Node head;
    public boolean isEmpty() {
        return (head == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node start = head;
        while (start.next != null){
            start = start.next;
        }
        start.next = newNode;
    }

    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    public void findDups() {
        Node current = head;
        Set<Integer> mySet = new HashSet<>();
        while (current != null) {
            current = current.next;
            if (current != null && !mySet.add(current.data)){
                    System.out.println(current.data + " is a duplicate");
            }
        }
    }

    public static void main(String args[])
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        System.out.println("isEmpty(): " + myLinkedlist.isEmpty());
        System.out.println("inserting 5 at head");
        myLinkedlist.insertFirst(5);
        System.out.println("inserting 6 at head");
        myLinkedlist.insertFirst(6);
        System.out.println("inserting 7 at head");
        myLinkedlist.insertFirst(7);
        myLinkedlist.printLinkedList();
        System.out.println("inserting 1 at head");
        myLinkedlist.insertFirst(1);
        myLinkedlist.printLinkedList();
        System.out.println("inserting 0 at end");
        myLinkedlist.insertLast(5);
        myLinkedlist.printLinkedList();
        System.out.println("isEmpty(): " + myLinkedlist.isEmpty());
        myLinkedlist.findDups();


    }
}