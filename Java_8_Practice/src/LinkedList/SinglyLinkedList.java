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

    public static void main(String args[])
    {
        SinglyLinkedList myLinkedlist = new SinglyLinkedList();
        myLinkedlist.insertFirst(5);
        myLinkedlist.insertFirst(6);
        myLinkedlist.insertFirst(7);
        myLinkedlist.insertFirst(1);
        myLinkedlist.printLinkedList();
        System.out.println("isEmpty(): " + myLinkedlist.isEmpty());
        myLinkedlist.insertLast(0);
        myLinkedlist.printLinkedList();

    }
}