package queueusinglinkedlist;

import datastructures.MyLinkedList;
import datastructures.INode;
import datastructures.MyNode;

public class MyQueue<K> {
	private final MyLinkedList myList;

	public MyQueue() {
		this.myList = new MyLinkedList();
	}

	public void printStack() {
		myList.printMyNodes();
	}

	public INode peak() {
		return myList.head;
	}

	public void push(INode<K> myNode) {
		myList.append(myNode);
	}
	
	public void dequeue() {
		myList.pop();
	}
}
