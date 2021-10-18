package datastructures;

public class MyNodeTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		myLinkedList.popLast();
		System.out.println("LinkedList after popping the last element");
		myLinkedList.printMyNodes();
		boolean find = myLinkedList.searchKey();
		System.out.println("Node with key 30 is Present in List :" +find);
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
						 && myLinkedList.tail.equals(mySecondNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}
}
