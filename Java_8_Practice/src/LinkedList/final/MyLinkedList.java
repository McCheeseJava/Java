public class MyLinkedList {
    //head can point to the address of a newNode
    private Node head;
    //tail can point to the address of a newNode
    private Node tail;

    private class Node {
        //head.next or tail.next points the current newNode to the address of the next newNode
        private Node next;
        private int data;
    }
    
    public void addLast(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }

    }

    public void print(){
        Node current = head;
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        MyLinkedList o = new MyLinkedList();
        o.addLast(5);
        o.addLast(6);
        o.addLast(7);
        o.addLast(8);
        o.addFirst(9);
        o.print();


    }
}
