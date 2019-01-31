package linkedList;

public class LinkedList {
	private Node head;
	private int size;
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	public class Node {
		private Object data;
		private Node next;
		public Node(Object value) {
			this.data = value;
			this.next = null;
		}
	}
	public void addHead(Object value) {
		Node newNode = new Node(value);
		if (size == 0) {
			head = newNode; 
		} else {
			newNode.next  = head;
			head = newNode;
		}
		size++;
	}
	public Object deleteHead() {
		if (size == 0) {
			System.out.println("链表为空");
			return null;
		} else {
			Node firstNode = head.data;
			head.next = firstNode.next;
		}
		size--;
		return obj;
	}
}
