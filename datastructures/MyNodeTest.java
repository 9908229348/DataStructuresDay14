package datastructures;

public class MyNodeTest {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insert(56);
		list.insert(30);
		list.insert(40);
		list.insert(70);
		System.out.println("Linked List :");
		list.displayList();
	}
}
