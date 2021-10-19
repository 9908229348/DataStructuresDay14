package datastructures;

public class MyNodeTest {
	public static void main(String[] args) {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(40);
		MyNode<Integer> myFourthNode = new MyNode<>(70);

		MyLinkedList list = new MyLinkedList();
		list.add(myFirstNode);
		list.insert(mySecondNode);
		list.insert(myThirdNode);
		list.insert(myFourthNode);
		System.out.println("Linked List :");
		list.displayList();
	}
}
