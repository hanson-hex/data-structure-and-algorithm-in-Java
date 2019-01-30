package myArray;

public class MyArray {
	private int elems;
	private int maxLengths;
	private int[] intArray;
	// 默认构造一个长度为50的长度
	public MyArray() {
		this.elems = 0;
		this.maxLengths = 50;
		intArray = new int[this.maxLengths];
	}
	public MyArray(int n) {
		this.elems = 0;
		this.maxLengths = n;
		intArray = new int[n]; 
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
		intArray[elems] = value;
		elems++;
		return true;
	}
	public int get(int i) {
		if (i < 0 || i > elems) {
			System.out.println("访问下表过界");
		}
		return intArray[i];
	}
	public int find(int sValue) {
		int i;
		for (i = 0; i < elems; i++){
			if (intArray[i] == sValue) break;
		}
		if (i == elems) return -1;
		else return i;
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
