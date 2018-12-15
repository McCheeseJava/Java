package linkedlist0;

public class LinkedList {
	private Node head;
	private Node lastNode;
	private int size;
	
	public LinkedList() {
		head = new Node();
		lastNode = head;
	}
	
	public void prepend(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head.next = n;
			lastNode  = n;
			size++;
		}
		else {
			Node temp = head.next;
			head.next = n;
			n.next = temp;
			size++;	
		}
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		Node n = head.next;
		String temp = "";
		while (n != null) {
			temp = temp + n.data + " ";
			n = n.next;
		}
		return temp;
	} 

	public static void main(String args[]) {
		LinkedList a = new LinkedList();
		for (int i = 1; i < 10; i++) {
			a.prepend(i);
		}
		System.out.println(a);
	}
	
}
