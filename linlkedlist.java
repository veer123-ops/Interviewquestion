package veer.com;


public class linlkedlist {

	public static void revserorder(Node head) {
		if (head == null)
			return;
		// Displayrecusvely(head.nextNode);
		revserorder(head.nextNode);
		// reverse order list this function use in in you proganm
		System.out.print(head.data + "->");

	}

	public static void Display(Node head) {
		Node tempNode = head;

		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;

		}
		/// node is null while not running beacuse node null already null this is not
		/// loop working in your program
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.nextNode;
		}
	}

	public static class Node {

		int data;
		Node nextNode;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(100);
		Node b = new Node(101);
		Node c = new Node(102);
		Node d = new Node(103);
		Node e = new Node(105);
		Node f = new Node(109);
		a.nextNode = b;
		b.nextNode = c;
		c.nextNode = d;
		d.nextNode = e;
		e.nextNode = f;

		Display(a);

		System.out.println();
		revserorder(a);

	}

}
