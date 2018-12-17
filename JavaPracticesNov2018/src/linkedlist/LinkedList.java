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
			Node h = head;
			while (h.next != lastNode) {
				h = h.next;
			}

			h.next.next = n;
			lastNode = n;
			n.next = null;
			size++;
		}
	}

	public void removeFirst() {
		if (size != 0) {
			head = head.next;
			size--;
		}
	}

	public void removeLast() {
		Node n = head;
		while (n.next != lastNode) {
			n = n.next;
		}
		lastNode = n;
		size--;
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
		Node n = head.next;
		while (n != lastNode.next) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("\n");
		return "";
	}

	public static void main(String args[]) {
		LinkedList a = new LinkedList();
		a.append(66);
		a.append(22);
		a.append(33);
		a.append(44);
		a.append(55);
		a.removeLast();
		a.removeFirst();
		a.prepend(99);
		a.removeFirst();
		a.append(104);
		a.prepend(8);
		a.prepend(9);
		a.prepend(10);
		a.prepend(11);
		a.toString();

		System.out.println("\nlargest element in the list: " + a.largest());

	}
}