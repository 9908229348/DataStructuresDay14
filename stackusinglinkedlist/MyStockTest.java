package stackusinglinkedlist;

import datastructures.INode;
import datastructures.MyNode;

public class MyStockTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		myStack.printStack();
		INode peak = myStack.peak();
		if (peak == myThirdNode) {
			System.out.println("Nodes are Linked");
		} else {
			System.out.println("Not Linked");
		}
	}
}
