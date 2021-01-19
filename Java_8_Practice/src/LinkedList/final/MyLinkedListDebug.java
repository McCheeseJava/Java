public class MyLinkedListDebug {
    private Node head;
    private Node tail;

    private class Node {
        private Node next;
        private int data;
    }

    MyLinkedListDebug() {
        System.out.println("From line 11 head " + head);
        if (head != null) {
            System.out.println("head.data " + head.data);
            System.out.println("From line 14 head.next " + head.next);
        }
        System.out.println("From line 16 tail " + tail);
        if (tail != null){
            System.out.println("tail.data " + tail.data);
            System.out.println("From line 19 tail.next " + tail.next);
        }
            
    }

    public void addLast(int data) {
        Node newNode = new Node();
        System.out.println("newNode " + newNode);
        newNode.data = data;
        System.out.println("newNode.data " + newNode.data);

        if (head == null) {
            System.out.println("From line 31 head == " + head);
            head = newNode;
            System.out.println("From line 33 head == " + head);

            System.out.println("From line 35 tail == " + tail);
            tail = newNode;
            System.out.println("From line 37 tail == " + tail);
        }
        System.out.println("From line 39 tail.next == " + tail.next);
        //tail.next is pointing to null. Let's point it to our new node.
        tail.next = newNode;
        System.out.println("From line 41 tail.next == " + tail.next);

        System.out.println("From line 43 tail == " + tail);
        //tail is pointing to previous newNode. Let's point it to the new newNode
        tail = newNode;
        System.out.println("From line 44 tail == " + tail);
    }

    public void addFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            System.out.println("head == " + head);
            tail = newNode;
            System.out.println("tail == " + tail);

        } else {
            Node temp = head;
            head = newNode;
            System.out.println("head == " + head);

            head.next = temp;
            System.out.println("head.next == " + head.next);

        }

    }

    public void print() {
        Node current = head;
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        MyLinkedListDebug o = new MyLinkedListDebug();
        o.addLast(5);
        o.addLast(6);
        o.addLast(7);
        o.addLast(8);
        //o.addFirst(9);
        o.print();

    }
}
