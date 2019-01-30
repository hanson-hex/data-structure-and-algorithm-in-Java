package orderArray;

public class OrderArray {
	private int elems;
	private int maxLengths;
	private int[] intArray;
	public OrderArray(int max) {
		this.maxLengths = max;
		this.elems = 0;
		this.intArray = new int[max];
	}
	public int getSize() {
		return this.elems;
	}
	public void display() {
		for(int i = 0; i < elems;i++)
		{
			System.out.print(intArray[i] + " ");
		}
	}
	public boolean add(int value){
		if (elems == maxLengths) {
			return false;
		}
		int i;
		for(i = 0; i < elems; i++) {
			if (intArray[i] > value) {
				break;
			}
		}
		for (int j = elems; j > i; j--) {
			intArray[j] = intArray[j - 1];
		}
		elems++;
		intArray[i] = value;
		return true;
	}
	public int get(int i) {
		if (i < 0 || i > elems) {
			System.out.println("访问下表过界");
		}
		return intArray[i];
	}
	public int find(int sValue) {
		int low = 0;
		int high = elems - 1;
		while(low <= high) {
			int middle = (low + high) / 2;
			if (intArray[middle] == sValue) {
				return middle;
			} else if (intArray[middle] < sValue) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return -1;
	}
	public boolean delete(int value) {
		int i = find(value);
		if (i == -1) return false;
		else if (i == elems - 1) {
			elems--;
			}
		else {
			for (int j = i; j < elems - 1; j++){
				intArray[j] = intArray[j + 1];
			}
			elems--;
		}
		return true;
	}
	public boolean modify(int oldValue, int newValue) {
		int i = find(oldValue);
		if (i == -1) return false;
		else {
			intArray[i] = newValue;
			return true;
		}
	}
}
