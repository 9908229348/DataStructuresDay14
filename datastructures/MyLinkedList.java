package datastructures;

public class MyLinkedList<K extends Comparable<K>> {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		head = null;
	}

	public void insert(INode node) {
		INode current = head;
		// System.out.println(head.getKey()+" " + node.getKey());
		INode previous = null;
		while (current != null && ((Comparable<K>) node.getKey()).compareTo((K) current.getKey()) > 0) {
			previous = current;
			current = current.getNext();
		}
		if (previous == null) {
			head = node;
		} else {
			previous.setNext(node);
		}
		node.setNext(current);
	}

	public void displayList() {
		INode current = head;
		while (current != null) {
			System.out.print(current.getKey() + " ");
			current = current.getNext();
		}
	}

	public void add(INode newNode) {
		if (this.tail == null)
			this.tail = newNode;
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
}
