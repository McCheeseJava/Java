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
	
	public void removeFirst() {
		if (size != 0) {
			head = head.next.next;
			size--;
		}
	}
	
	public String largest() {
		Node n = head;
		int largest = 0;
		while (n != null) {
			if (n.data > largest) {
				largest = n.data;
			}
 			n = n.next;
		}
	    return largest + " ";

	}

	@Override
	public String toString() {
		Node n = head;
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
		a.prepend(44);
		a.removeFirst();

		System.out.println(a);
		System.out.println("largest element in the list: " + a.largest());

	}
}
