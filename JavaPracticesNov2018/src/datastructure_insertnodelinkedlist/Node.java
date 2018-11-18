package datastructure_insertnodelinkedlist;
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

	public void insert(Node new_node) {
		Node current;
		if (head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		} 
		else {
			current = head;
			while (current.next != null && current.next.data < new_node.data)
				current = current.next;
		    	new_node.next = current.next;
			    current.next = new_node;
		}
	}

	public Node newNode(int data) 
    { 
       Node x = new Node(data); 
       return x; 
    } 
  
     public void printList() 
     { 
         Node temp = head; 
         while (temp != null) 
         { 
            System.out.print(temp.data+" "); 
            temp = temp.next; 
         } 
     } 
     
     public static void main(String args[]) 
     { 
         Node list = new Node(); 
         Node new_node; 
         
         new_node = list.newNode(5); 
         list.insert(new_node);
         
         new_node = list.newNode(10); 
         list.insert(new_node); 
         
         new_node = list.newNode(7); 
         list.insert(new_node); 
         
         new_node = list.newNode(3); 
         list.insert(new_node); 
         
         new_node = list.newNode(1); 
         list.insert(new_node); 
         
         new_node = list.newNode(9); 
         list.insert(new_node); 
         
         new_node = list.newNode(18); 
         list.insert(new_node);
         
         list.printList(); 
     } 
}
