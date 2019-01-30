package doubleLinkedQueue;

import java.util.EmptyStackException;

public class DoubleLinkedQueue {
	private Object[] arrayQueue;
	private int front; // 前端
	private int rear; // 尾端
	private int nItem; // 队列元素数量
	private int maxSize;
	public DoubleLinkedQueue(int max) {
		this.maxSize = max;
		this.front = 0;
		this.rear = -1;
		this.nItem = 0;
		arrayQueue = new Object[max];
	}
	public boolean insertRight(Object value) {
		if (isFull()) {
			System.out.println("队列已经满了");
			return false;
		}
		if (rear + 1 == maxSize) {
			rear = -1;
		}
		arrayQueue[++rear] = value;
		nItem++;
		return true;
	}
	public boolean insertLeft(Object value) {
		if (isFull()) {
			System.out.println("队列已经满了");
			return false;
		}
		if (front - 1 == -1) {
			front = maxSize;
		}
		arrayQueue[--front] = value;
		nItem++;
		return true;
	}
	public Object removeLeft() {
		Object removeValue;
		if (isEmpty()) {
			System.out.println("队列为空");
			return -1;
		}
		removeValue = arrayQueue[front];
		arrayQueue[front] = null;
		front++;
		if (front == maxSize) {
			front = 0;
		}
		nItem--;
		return removeValue;
	}
	public Object removeRight() {
		Object removeValue;
		if (isEmpty()) {
			System.out.println("队列为空");
			return -1;
		}
		System.out.println("rear:" + rear);
		if (rear == -1) {
			rear = maxSize - 1;
		}
		removeValue = arrayQueue[rear];
		arrayQueue[rear--] = null;
		nItem--;
		return removeValue;
	}
	public Object peekFront() {
		if (!isEmpty()) {
			return arrayQueue[rear];
		} else {
			throw new EmptyStackException();
		}
	}
	public boolean isEmpty() {
		return nItem == 0;
	}
	public boolean isFull() {
		return maxSize == nItem;
	}
	public int getSize() {
		return nItem;
	}
	public void display() {
		for(int i = 0; i < arrayQueue.length; i++) {
			System.out.print(arrayQueue[i] + " ");
		}
		System.out.println("");
	}
}
