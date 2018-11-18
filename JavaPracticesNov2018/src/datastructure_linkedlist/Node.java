package datastructure_linkedlist;

public class Node {
	private Node head;
	private Node next;
	private int data;

	Node(int d) {
		data = d;
		next = null;
	}

	public Node() {
	}

	public static void main(String[] args) {

		Node list = new Node();

		list.head   = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		Node fourth = new Node(4);

		list.head.next = second;
        second.next    = third;
        third.next     = fourth;
        
        System.out.println(list.head.data);
		System.out.println(list.head.next.data);
		System.out.println(second.next.data);
		System.out.println(third.next.data);

	}
}
