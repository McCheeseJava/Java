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

    public int removeFirst(){
        Node current = head;
        int temp = current.data;
        head = current.next;
        return temp;
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

    public int removeLast(){
        Node start = head;
        while (start.next.next != null){
            start = start.next;
        }
        int temp = start.next.data;
        start.next = null;
        return temp;
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
        Node previous;
        Set<Integer> mySet = new HashSet<>();
        while (current != null) {
            previous = current;
            mySet.add(current.data);
            current = current.next;
            if (current != null && !mySet.add(current.data)){
                previous.next = current.next;
                System.out.println(current.data + " is a duplicate and is being removed.");
                findDups();
            }
        }
    }

    public static void main(String args[])
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        System.out.println("isEmpty(): " + myLinkedlist.isEmpty());

        System.out.println("inserting 5 at head");
        myLinkedlist.insertFirst(5);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 6 at head");
        myLinkedlist.insertFirst(6);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 0 at head");
        myLinkedlist.insertFirst(9);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 1 at head");
        myLinkedlist.insertFirst(1);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 6 at end");
        myLinkedlist.insertLast(6);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 5 at end");
        myLinkedlist.insertLast(5);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 8 at end");
        myLinkedlist.insertLast(8);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 0 at end");
        myLinkedlist.insertLast(3);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 4 at head");
        myLinkedlist.insertFirst(4);
        myLinkedlist.printLinkedList();

        System.out.println("inserting 4 at head");
        myLinkedlist.insertFirst(4);
        myLinkedlist.printLinkedList();

        //myLinkedlist.findDups();
        //myLinkedlist.printLinkedList();
        System.out.println("Removing First... " + myLinkedlist.removeFirst());
        myLinkedlist.printLinkedList();

        System.out.println("Removing Last..." + myLinkedlist.removeLast());
        myLinkedlist.printLinkedList();

        System.out.println("Removing Last..." + myLinkedlist.removeLast());
        myLinkedlist.printLinkedList();



    }
}