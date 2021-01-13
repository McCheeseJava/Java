import java.util.*;
class Node<T> {
    public T data;
    public Node<T> next;
    public void displayNodeData() {
        System.out.print(data + " ");
    }
}

public class SinglyLinkedList<T> {
    private Node<T> head;
    public boolean isEmpty() {
        return (head == null);
    }

    public void insertFirst(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public T removeFirst(){
        Node<T> current = head;
        T temp = current.data;
        head = current.next;
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

    public static void main(String args[])
    {       
        SinglyLinkedList<String> myLinkedlist = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> myIntLinkedlist = new SinglyLinkedList<>();

        System.out.println("inserting Str at head");
        myLinkedlist.insertFirst("Haroon");
        myLinkedlist.printLinkedList();

        System.out.println("inserting Int at head");
        myIntLinkedlist.insertFirst(5);
        myIntLinkedlist.printLinkedList();

        System.out.println("removing from head");
        myIntLinkedlist.removeFirst();
        myIntLinkedlist.printLinkedList();
        myLinkedlist.printLinkedList();

    }
}
