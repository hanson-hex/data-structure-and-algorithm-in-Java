package bubbleSort;

public class BubbleSort {
	 public int[] sort(int[] array){
	        //这里for循环表示总共需要比较多少轮
	        for(int i = 1 ; i < array.length; i++){
	            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
	            boolean flag = true;
	            //这里for循环表示每轮比较参与的元素下标
	            //对当前无序区间array[0......length-i]进行排序
	            //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
	            for(int j = 0 ; j < array.length-i ; j++){
	                if(array[j]>array[j+1]){
	                    int temp = array[j];
	                    array[j] = array[j+1];
	                    array[j+1] = temp;
	                    flag = false;
	                }
	            }
	            if(flag){
	                break;
	            }
	            //第 i轮排序的结果为
	            System.out.print("第"+i+"轮排序后的结果为:");
	            display(array);
	             
	        }
	        return array;
	         
	    }
	     
	    public void display(int[] array){
	        for(int i = 0 ; i < array.length ; i++){
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	    }
}
