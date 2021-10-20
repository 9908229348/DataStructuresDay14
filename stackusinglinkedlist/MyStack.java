package stackusinglinkedlist;

import datastructures.MyLinkedList;
import datastructures.INode;
import datastructures.MyNode;

public class MyStack<K> {

	private final MyLinkedList myList;

	public MyStack() {
		this.myList = new MyLinkedList();
	}

	public void printStack() {
		myList.printMyNodes();
	}

	public INode peak() {
		return myList.head;
	}

	public void push(INode<K> myNode) {
		myList.add(myNode);
	}
}
