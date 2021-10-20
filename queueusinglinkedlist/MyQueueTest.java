package queueusinglinkedlist;

import datastructures.INode;
import datastructures.MyNode;

public class MyQueueTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyQueue myQueue = new MyQueue();
		myQueue.push(myFirstNode);
		myQueue.push(mySecondNode);
		myQueue.push(myThirdNode);

		myQueue.printStack();
		INode peak = myQueue.peak();
		if (peak == myFirstNode) {
			System.out.println("Nodes are Linked");
		} else {
			System.out.println("Not Linked");
		}
		myQueue.dequeue();
		System.out.println("Queue after dequeue from begining");
		myQueue.printStack();
	}
}
