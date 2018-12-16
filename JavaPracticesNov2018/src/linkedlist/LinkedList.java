package linkedlist;

public class LinkedList {

	private Node head;
	private Node lastNode;
	private int size;
	
	public LinkedList() {
		head = new Node();
		head.next = lastNode;
		size = 0;
	}
	
	public void prepend(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head.data = data;
			head.next = n;
			lastNode = n;
			size++;
		}
		else {
			Node temp = head.next;
			head.data = data;
			head.next = n;
			n.next = temp;
			size++;
		}
		
	}
	
	public void append(int data) {
		Node n = new Node(data);
		if (size == 0) {
			head.data = data;
			head.next = n;
			lastNode = n;
			size++;
		}
		else {
			lastNode.next = n;
			lastNode = n;
			size++;
			
		}
		
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
		a.append(90);
		System.out.println(a);
		a.prepend(999);
		System.out.println(a);

	}

}
