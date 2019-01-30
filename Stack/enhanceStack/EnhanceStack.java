package enhanceStack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class EnhanceStack {
	private int maxSize;
	private int top;
	private Object[] arrayStack;
	public EnhanceStack() {
		this.maxSize = 10;
		this.top = -1;
		arrayStack = new Object[10];
	}
	/**
	 * 构造函数
	 * @param max
	 */
	public EnhanceStack(int initCapacity) {
		if (initCapacity < 0) {
			throw new IllegalArgumentException("初始栈不能小于0:" + initCapacity);
		} 
		this.maxSize = initCapacity;
		this.top = -1;
		arrayStack = new Object[initCapacity];
	}
	/**
	 * 压入栈
	 * @param value
	 */
	public void push(Object value) {
		isGrow(top + 1);
		arrayStack[++top] = value;
	}
	/**
	 * 拓展空间？
	 * @param minCapacity
	 * @return
	 */
	public boolean isGrow(int minCapacity) {
		int oldCapacity = maxSize;
		if (minCapacity >= oldCapacity) {
			if (minCapacity<<1 > Integer.MAX_VALUE) {
				maxSize = Integer.MAX_VALUE;
			} else {
				maxSize = minCapacity<<1;
			}
			arrayStack = Arrays.copyOf(arrayStack, maxSize);
			return true;
		}
		return true;
	}
	public Object pop() {
		Object temp = peek();
		arrayStack[top--] = null;
		return temp;
	}
	 /**
	  * 空栈
	  * @return
	  */
	public boolean isEmpty() {
		return top == -1;
	}
	public Object peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return arrayStack[top];
	}
	
}
