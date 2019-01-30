package testSort;

import bubbleSort.BubbleSort;
import choiceSort.ChoiceSort;
import insertSort.InsertSort;

public class TestSort {
	
	public static void start() {
//		testBubbleSort();
//		testChoiceSort();
		testInsertSort();
	}
	
	public static void testBubbleSort() {
		int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
		BubbleSort bSort = new BubbleSort();
		array = bSort.sort(array);
	    System.out.println("经过冒泡排序后的数组顺序为：");
	    display(array);
	}
	
	public static void testChoiceSort() {
		int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
		ChoiceSort bSort = new ChoiceSort();
		array = bSort.sort(array);
	    System.out.println("经过选择排序后的数组顺序为：");
	    display(array);
	}
	
	public static void testInsertSort() {
		int[] array = {4,2,8,9,5,7,6,1,3};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
		InsertSort bSort = new InsertSort();
		array = bSort.sort(array);
	    System.out.println("经过插入排序后的数组顺序为：");
	    display(array);
	}
	/**
	 * 遍历显示数组
	 * @param array
	 */
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
