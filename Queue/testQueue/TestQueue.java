package testQueue;

import doubleLinkedQueue.DoubleLinkedQueue;
import priorityQueue.PriorityQueue;
import singleLinkedQueue.SingleLinkedQueue;

public class TestQueue {
	public static void start() {
		testSingleQueue();
//		testDoubleQueue();
//		testPriorityQueue();
	}
	public static void testPriorityQueue() {
		PriorityQueue myQueue  = new PriorityQueue(4);
		myQueue.insert(3);
		myQueue.insert(2);
		myQueue.insert(4);
		myQueue.display();
		System.out.println(myQueue.remove());
		myQueue.display();
	}
	public static void testDoubleQueue() {
		DoubleLinkedQueue myQueue = new DoubleLinkedQueue(4);
		myQueue.insertLeft(3);
		myQueue.insertLeft(4);
		myQueue.insertLeft(2);
		myQueue.display();
		myQueue.removeRight();
		myQueue.display();
	}
	public static void testSingleQueue() {
		SingleLinkedQueue myQueue = new SingleLinkedQueue(4);
		myQueue.insert(4);
		myQueue.insert(3);
		myQueue.insert(2);
		myQueue.display();
		myQueue.remove();
		myQueue.display();
		myQueue.remove();
		myQueue.remove();
		myQueue.remove();
	}
}
