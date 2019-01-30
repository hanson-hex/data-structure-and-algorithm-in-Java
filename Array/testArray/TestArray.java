package testArray;

import myArray.MyArray;
import orderArray.OrderArray;

public class TestArray {
	public static void start() {
		// 无序数组
//		testUnOrderArray();
		// 有序数组
		testOrderArray();
	}
	public static void testUnOrderArray() {
		MyArray temArray = new MyArray(4);
		temArray.add(1);
		temArray.add(2);
		temArray.add(3);
		temArray.display();
		temArray.add(4);
		int i = temArray.get(3);
		System.out.println(i);
		temArray.delete(4);
		temArray.modify(3, 5);
		temArray.display();
	}
	public static void testOrderArray() {
		OrderArray temArray1 = new OrderArray(8);
		temArray1.add(5);
		temArray1.add(2);
		temArray1.add(3);
		temArray1.add(4);
		temArray1.add(1);
		temArray1.display();
		System.out.println(temArray1.find(5));
	}
}
