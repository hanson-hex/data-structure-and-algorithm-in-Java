package priorityQueue;

public class PriorityQueue {
	private int maxSize;
	private int[] arrayQueue;
	private int nItem;
	public PriorityQueue(int max) {
		this.maxSize = max;
		this.nItem = 0;
		arrayQueue = new int[max];
	}
	public boolean isFull() {
		return nItem == maxSize;
	}
	public boolean isEmpty() {
		return nItem == 0;
	}
	/**
	 * 优先队列 按照从大到小存取 最小对应优先级最高
	 * @param value
	 */
	public void insert(int value) {
		if (isFull()) {
			System.out.println("队列已满");
			return;
		}
		if (isEmpty()) {
			arrayQueue[nItem++] = value;
		} else {
			int j = nItem - 1;
			while(j >= 0 && value > arrayQueue[j]) {
				arrayQueue[j + 1] = arrayQueue[j];
				j--;
			}
			arrayQueue[j + 1] = value;
			nItem++;
		}
	}
	public int peekMin() {
		return arrayQueue[nItem - 1];
	} 
	public int remove() {
		if(isEmpty()) {
			System.out.println("优先队列为空");
			return -1;
		}
		int topItem = arrayQueue[nItem - 1];
		arrayQueue[--nItem] = -1;
		return topItem;
	}
	public void display() {
		for(int i = 0; i < arrayQueue.length; i++) {
			System.out.print(arrayQueue[i] + " ");
		}
	}
	
}
