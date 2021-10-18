package datastructures;

public class MyNode implements INode {
	private int key;
	private INode next;

	public MyNode(int key) {
		this.key = key;
		this.next = null;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public INode getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = (MyNode) next;
	}
}
