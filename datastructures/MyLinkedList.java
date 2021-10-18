package datastructures;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
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

	public void append(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null) {
			this.head = myNode;
		} else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tail.setNext(null);
		return tempNode;
	}

	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	public INode searchKey() {
		INode node = head;
		while (!node.getKey().equals(30)) {
			node = node.getNext();
		}
		return node;
	}

	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNodes.append("-->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}
