package datastructures;

public class MyNodeTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyNode<Integer> myNewNode = new MyNode<Integer>(40);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		System.out.println("LinkedList After adding 40 after 30");
		INode searchForNode = myLinkedList.searchKey();
		myLinkedList.insert(searchForNode, myNewNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
						 && myLinkedList.tail.equals(myThirdNode) && myNewNode.getNext().equals(myThirdNode);
		if (result == true)
			System.out.println("Nodes are linked");
		else
			System.out.println("Nodes are not linked");
	}
}
