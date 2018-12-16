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
		} else {
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
		} else {
			n.next = null;
			lastNode.next = n;
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
		a.prepend(55);
		a.prepend(10);
		a.prepend(33);
		a.append(44);

		System.out.println(a);

	}
}
